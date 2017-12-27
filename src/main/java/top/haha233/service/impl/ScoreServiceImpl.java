package top.haha233.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.haha233.dal.ScoreMapper;
import top.haha233.model.bo.ScoreBo;
import top.haha233.model.po.ScorePo;
import top.haha233.service.ScoreService;
import top.haha233.utils.Response;

import java.util.List;

/**
 * @author Ice_Dog
 */
@Service("scoreService")
public class ScoreServiceImpl implements ScoreService {
	private static Logger log = Logger.getLogger(ScoreServiceImpl.class);
	@Autowired
	private ScoreMapper scoreMapper;

	@Override
	public Response addScore(String stuid, String lesson, String score) {
		//todo
		return null;
	}

	@Override
	public Response deleteScore(String id) {
		//todo
		return null;
	}

	@Override
	public Response updateScore(String stuid, String lesson, String score, String id) {
		//todo
		return null;
	}

	@Override
	public Response queryScore(String stuid, String lesson, String score, String id,
			String startIndex, String count) {
		//返回值含有空值 4
		if (startIndex == null || count == null) {
			return new Response(4);
		}
		Integer start;
		Integer num;
		try {
			start = Integer.parseInt(startIndex);
			num = Integer.parseInt(count);
		} catch (Exception e) {
			e.printStackTrace();
			return new Response(3);
		}
		Long stuId = null;
		if (stuid != null) {
			try {
				stuId = Long.parseLong(stuid);
			} catch (Exception e) {
				e.printStackTrace();
				return new Response(3);
			}
		}
		Long sid = null;
		if (id != null) {
			try {
				sid = Long.parseLong(id);
			} catch (Exception e) {
				e.printStackTrace();
				return new Response(3);
			}
		}
		Float sscore = null;
		if (score != null) {
			try {
				sscore = Float.parseFloat(score);
			} catch (Exception e) {
				e.printStackTrace();
				return new Response(3);
			}
		}
		ScorePo scorePo = new ScorePo();
		scorePo.setId(sid);
		scorePo.setLesson(lesson);
		scorePo.setStudentId(stuId);
		scorePo.setScore(sscore);
		List<ScoreBo> scoreBos = scoreMapper.query(scorePo, start, num);
		if (scoreBos.size() == 0) {
			return new Response(5);
		}
		return new Response(0).add("scoreBos", scoreBos);
	}

	@Override
	public Response count(String stuid, String lesson, String score, String id) {
		Long stuId = null;
		if (stuid != null) {
			try {
				stuId = Long.parseLong(stuid);
			} catch (Exception e) {
				e.printStackTrace();
				return new Response(3);
			}
		}
		Long sid = null;
		if (id != null) {
			try {
				sid = Long.parseLong(id);
			} catch (Exception e) {
				e.printStackTrace();
				return new Response(3);
			}
		}
		Float sscore = null;
		if (score != null) {
			try {
				sscore = Float.parseFloat(score);
			} catch (Exception e) {
				e.printStackTrace();
				return new Response(3);
			}
		}
		ScorePo scorePo = new ScorePo();
		scorePo.setId(sid);
		scorePo.setLesson(lesson);
		scorePo.setStudentId(stuId);
		scorePo.setScore(sscore);
		Integer count = scoreMapper.count(scorePo);
		return new Response(0).add("count", count);
	}
}
