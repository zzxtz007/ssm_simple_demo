package top.haha233.dal;

import org.apache.ibatis.annotations.Param;
import top.haha233.model.bo.ScoreBo;
import top.haha233.model.po.ScorePo;

import java.util.List;

/**
 * @author Ice_Dog
 */
public interface ScoreMapper {
	/**
	 * 对ScorePo模型进行持久化保存操作
	 *
	 * @param score ScorePo模型
	 * @return 操作值
	 */
	int insert(@Param("score") ScorePo score);

	/**
	 * 对ScorePo模型进行持久化删除操作
	 *
	 * @param score ScorePo模型
	 * @return 操作值
	 */
	int delete(@Param("score") ScorePo score);

	/**
	 * 对ScorePo模型进行持久化修改操作
	 *
	 * @param score ScorePo模型
	 * @return 操作值
	 */
	int update(@Param("score") ScorePo score);

	/**
	 * 查询score
	 *
	 * @param score      StuPo模型
	 * @param startIndex 开始索引
	 * @param count      查询数量
	 * @return stubo模型结果集
	 */
	List<ScoreBo> query(@Param("score") ScorePo score, @Param("start") Integer startIndex,
			@Param("count") Integer count);

	/**
	 * 查询score的数量
	 *
	 * @param score StuPo模型
	 * @return stubo模型结果集的数量
	 */
	int count(@Param("score") ScorePo score);

}
