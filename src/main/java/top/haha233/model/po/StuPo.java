package top.haha233.model.po;

/**
 * @author Ice_Dog
 */
public class StuPo {
	private Long id;
	private String name;

	@Override
	public String toString() {
		return "studentPo{" +
				"id=" + id +
				", name=" + name +
				'}';
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
