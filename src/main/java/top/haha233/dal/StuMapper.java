package top.haha233.dal;

import org.apache.ibatis.annotations.Param;
import top.haha233.model.bo.StuBo;
import top.haha233.model.po.StuPo;

import java.util.List;

/**
 * @author Ice_Dog
 */
public interface StuMapper {
	/**
	 * 对StuPo模型进行持久化保存操作
	 *
	 * @param student StuPo模型
	 * @return 操作值
	 */
	int insert(@Param("student") StuPo student);

	/**
	 * 对StuPo模型进行持久化删除操作
	 *
	 * @param student StuPo模型
	 * @return 操作值
	 */
	int delete(@Param("student") StuPo student);

	/**
	 * 对StuPo模型进行持久化修改操作
	 *
	 * @param student StuPo模型
	 * @return 操作值
	 */
	int update(@Param("student") StuPo student);

	/**
	 * 查询student
	 *
	 * @param student StuPo模型
	 * @return stubo模型结果集的数量
	 */
	int count(@Param("student") StuPo student);

	/**
	 * 查询student
	 *
	 * @param student    StuPo模型
	 * @param startIndex 开始索引
	 * @param count      查询数量
	 * @return stubo模型结果集
	 */
	List<StuBo> query(@Param("student") StuPo student, @Param("startIndex") Integer startIndex,
			@Param("count") Integer count);
}
