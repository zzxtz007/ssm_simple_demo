package top.haha233.model.po;

/**
 * @author Ice_Dog
 */
public class ScorePo {
	private Long id;
	private Long studentId;
	private String lesson;
	private Float score;

	@Override
	public String toString() {
		return "ScorePo{" +
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

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
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
