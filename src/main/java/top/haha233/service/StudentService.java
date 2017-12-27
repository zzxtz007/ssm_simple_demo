package top.haha233.service;

import top.haha233.utils.Response;

/**
 * @author Ice_Dog
 */
public interface StudentService {
	/**
	 * 添加student
	 *
	 * @param id   必选
	 * @param name 必选
	 * @return 状态码
	 */
	Response add(String id, String name);

	/**
	 * 删除student
	 *
	 * @param id 必选
	 * @return 状态码
	 */
	Response delete(String id);

	/**
	 * 修改student
	 *
	 * @param id   必选
	 * @param name 必选
	 * @return 状态码
	 */
	Response update(String id, String name);

	/**
	 * 查询
	 *
	 * @param id         可选
	 * @param name       可选
	 * @param stratIndex 起始条目
	 * @param count      条目数
	 * @return 状态码+stuBos 查询到的student结果集
	 */
	Response query(String id, String name, String stratIndex, String count);

	/**
	 * 查询
	 *
	 * @param id   可选
	 * @param name 可选
	 * @return 状态码+count 查询到的条目数
	 */
	Response count(String id, String name);
}
