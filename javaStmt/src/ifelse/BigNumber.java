package ifelse;

public class BigNumber {
	int a, b, c, big;

	
	public void setNumber(int a, int b, int c) {
		getBig(this.a = a, this.b = b, this.c = c);
	}
	
	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

	public int getC() {
		return c;
	}

	public int getBig(int a, int b, int c) {
		this.big = a;

		if (a > b && a > c) {
			this.big = a;
		} else if (b > a && b > c) {
			this.big = b;
		} else {
			this.big = c;
		}	
		
		return big;
	}
	
	@Override
	public String toString() {
		return "가장 큰 수는 " + big + "입니다.";
	}
}
