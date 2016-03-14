package ifelse;

public class Pass {
	String name, passStr;
	private int java, jsp, sql, spring, sum, avg;
	// = java+jsp+sql+spring;

	public void setScore(int java, int jsp, int sql, int spring) {
		this.java = java;
		this.jsp = jsp;
		this.sql = sql;
		this.spring = spring;
		
		setSum();
		setAvg();
		setPassStr();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSum() {
		return sum;
	}

	public void setSum() {
		this.sum = java + jsp + sql + spring;
	}

	public int getAvg() {
		return avg;
	}

	public void setAvg() {
		this.avg = (int) (sum / 4);
	}

	public String getPassStr() {
		return passStr;
	}

	public void setPassStr() {
		if (avg >= 60) {
			this.passStr = "합격";
		} else {
			this.passStr = "불합격";
		}
	}

	@Override
	public String toString() {
		return name + "\t" + java + "\t" + jsp + "\t" + sql + "\t" + spring + "\t" + sum + "\t" + avg + "\t" + passStr;
	}

}
