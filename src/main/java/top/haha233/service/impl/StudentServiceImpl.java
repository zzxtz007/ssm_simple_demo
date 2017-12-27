package top.haha233.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.haha233.dal.StuMapper;
import top.haha233.model.bo.StuBo;
import top.haha233.model.po.StuPo;
import top.haha233.service.StudentService;
import top.haha233.utils.Response;

import java.util.List;

/**
 * @author Ice_Dog
 */
@Service("studentService")
public class StudentServiceImpl implements StudentService {
	private static Logger log = Logger.getLogger(StudentServiceImpl.class);
	@Autowired
	private StuMapper stuMapper;

	@Override
	public Response add(String id, String name) {
		//todo
		return null;
	}

	@Override
	public Response delete(String id) {
		//todo
		return null;
	}

	@Override
	public Response update(String id, String name) {
		//todo
		return null;
	}

	@Override
	public Response query(String id, String name, String stratIndex, String count) {
		if (stratIndex == null || count == null) {
			return new Response(2);
		}
		Integer start;
		Integer num;
		try {
			start = Integer.parseInt(stratIndex);
			num = Integer.parseInt(count);
		} catch (Exception e) {
			log.info(e.getMessage());
			return new Response(3);
		}
		Long sid = null;
		if (id != null) {
			try {
				sid = Long.parseLong(id);
			} catch (Exception e) {
				log.info(e.getMessage());
				return new Response(3);
			}
		}
		StuPo stuPo = new StuPo();
		stuPo.setId(sid);
		stuPo.setName(name);
		List<StuBo> stuBos = stuMapper.query(stuPo, start, num);
		return new Response(0).add("stuBos",stuBos);
	}

	@Override
	public Response count(String id, String name) {
		Long sid = null;
		if (id != null) {
			try {
				sid = Long.parseLong(id);
			} catch (Exception e) {
				log.info(e.getMessage());
				return new Response(3);
			}
		}
		StuPo stuPo = new StuPo();
		stuPo.setId(sid);
		stuPo.setName(name);
		Integer count = stuMapper.count(stuPo);
		return new Response(0).add("count",count);
	}
}
