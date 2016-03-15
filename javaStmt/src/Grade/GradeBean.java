package Grade;

public class GradeBean {
	private String name;
	private int hak, java, spl, jsp, spring;
	
	//생성자 오버로딩
	public GradeBean() {}

	public GradeBean(int hak, String name, int java, int sql, int jsp, int spring) {
		this.hak = hak;
		this.name = name;
		this.java = java;
		this.spl = sql;
		this.jsp = jsp;
		this.spring = spring;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHak() {
		return hak;
	}

	public void setHak(int hak) {
		this.hak = hak;
	}

	public int getJava() {
		return java;
	}

	public void setJava(int java) {
		this.java = java;
	}

	public int getSpl() {
		return spl;
	}

	public void setSpl(int spl) {
		this.spl = spl;
	}

	public int getJsp() {
		return jsp;
	}

	public void setJsp(int jsp) {
		this.jsp = jsp;
	}

	public int getSpring() {
		return spring;
	}

	public void setSpring(int spring) {
		this.spring = spring;
	}

	@Override
	public String toString() {
		return "성적표 [이름=" + name + ", 학번=" + hak + ", 자바=" + java + ", SQL=" + spl + ", JSP=" + jsp
				+ ", 스프링=" + spring + "]";
	}
}
