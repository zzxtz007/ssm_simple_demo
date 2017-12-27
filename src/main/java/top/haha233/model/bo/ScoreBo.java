package top.haha233.model.bo;

import top.haha233.model.po.StuPo;

/**
 * @author Ice_Dog
 */
public class ScoreBo {
	private Long id;
	private StuPo studentId;
	private String lesson;
	private Float score;

	@Override
	public String toString() {
		return "ScoreBo{" +
				"id=" + id +
				", studentId=" + studentId +
				", lesson='" + lesson + '\'' +
				", score=" + score +
				'}';
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public StuPo getStudentId() {
		return studentId;
	}

	public void setStudentId(StuPo studentId) {
		this.studentId = studentId;
	}

	public String getLesson() {
		return lesson;
	}

	public void setLesson(String lesson) {
		this.lesson = lesson;
	}

	public Float getScore() {
		return score;
	}

	public void setScore(Float score) {
		this.score = score;
	}
}
