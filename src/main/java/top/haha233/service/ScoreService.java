package top.haha233.service;

import top.haha233.utils.Response;

/**
 * @author Ice_dig
 */
public interface ScoreService {

	/**
	 * 添加score
	 *
	 * @param stuid  必选
	 * @param lesson 必选
	 * @param score  必选
	 * @return 状态码
	 */
	Response addScore(String stuid, String lesson, String score);

	/**
	 * 删除score
	 *
	 * @param id 必选
	 * @return 状态码
	 */
	Response deleteScore(String id);

	/**
	 * 修改 score
	 *
	 * @param stuid  可选
	 * @param lesson 可选
	 * @param score  可选
	 * @param id     必选
	 * @return 状态码
	 */
	Response updateScore(String stuid, String lesson, String score, String id);

	/**
	 * 查询 score
	 *
	 * @param stuid      可选
	 * @param lesson     可选
	 * @param score      可选
	 * @param id         可选
	 * @param startIndex 查询开始索引
	 * @param count      查询数量
	 * @return 状态码 + scores 模型结果集
	 */
	Response queryScore(String stuid, String lesson, String score, String id, String startIndex,
			String count);

	/**
	 * 查询 score的数量
	 *
	 * @param stuid      可选
	 * @param lesson     可选
	 * @param score      可选
	 * @param id         可选
	 * @return 状态码 + count 模型结果数量
	 */
	Response count(String stuid, String lesson, String score, String id);
}
