package top.haha233.web;

import com.google.gson.Gson;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import top.haha233.model.bo.StuBo;
import top.haha233.service.ScoreService;
import top.haha233.service.StudentService;
import top.haha233.utils.Response;

import java.util.List;

/**
 * @author Ice_Dog
 */
@Controller
@RequestMapping(value = "/score")
public class ScoreController {
	private static Logger log = Logger.getLogger(ScoreController.class);

	@Autowired
	private StudentService studentService;
	@Autowired
	private ScoreService scoreService;

	@RequestMapping(value = "/search",method = {RequestMethod.GET},produces = "application/json;charset=utf-8")
	@ResponseBody
	public String getStudentScores(@RequestParam(required = false)String name, @RequestParam String startIndex, @RequestParam String count) {
		Gson g = new Gson();
		log.info("执行getStudentScores方法,接收的参数为" + name);
		if (name == null||name.equals("")) {
			log.info("参数为空 查询全部");
			return g.toJson(scoreService.queryScore(null, null, null, null,startIndex,count));
		}
		Response response = studentService.query(null, name,"0","1");
		StuBo stuBo = null;
		log.info(response);
		switch ((int) response.get("status")) {
			case 0:
				try {
					List<StuBo> stuBos = (List<StuBo>) response.get("stuBos");
					stuBo = stuBos.get(0);
					log.info("根据名字查询student,结果为"+stuBo);
				} catch (Exception e) {
					log.info("根据名字查询student，发生异常"+e.getMessage());
					return g.toJson(new Response(5));
				}
				break;
			default:
				return g.toJson(response);
		}
		return g.toJson(scoreService.queryScore(""+stuBo.getId(), null, null, null, startIndex, count));
	}
	@RequestMapping(value = "/searchCount" ,produces = "application/json;charset=utf-8")
	@ResponseBody
	public String getStudentScoresCount(@RequestParam(required = false) String name) {
		Gson g = new Gson();
		log.info("执行getStudentScoresCount方法,接收的参数为" + name);
		if (name == null||name.equals("")) {
			log.info("参数为空 查询全部");
			return g.toJson(scoreService.count(null, null, null, null));
		}
		Response response = studentService.query(null, name,"0","1");
		StuBo stuBo = null;
		log.info(response);
		switch ((int) response.get("status")) {
			case 0:
				try {
					List<StuBo> stuBos = (List<StuBo>) response.get("stuBos");
					stuBo = stuBos.get(0);
					log.info("根据名字查询student,结果为"+stuBo);
				} catch (Exception e) {
					log.info("根据名字查询student，发生异常"+e.getMessage());
					return g.toJson(new Response(5));
				}
				break;
			default:
				return g.toJson(response);
		}
		return g.toJson(scoreService.count(""+stuBo.getId(), null, null, null));
	}
}
