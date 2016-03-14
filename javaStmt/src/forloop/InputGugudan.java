package forloop;

public class InputGugudan {
	private int dan, i, result;
	private String resultStr = "";

	public int getDan() {
		return dan;
	}

	public void setDan(int dan) {
		if (dan <= 0) {
			resultStr = "1이상 정수값만 입력하시오.";
		} else {
			getGugudan(this.dan = dan);
		}
	}

	public void getGugudan(int dan) {
		for (i = 2; i <= 9; i++) {
			result = dan * i;
			resultStr +=  dan + " * " + i + " = " + dan * i + "\n";
		}
		
	}

	@Override
	public String toString() {
		return resultStr;
	}

}
