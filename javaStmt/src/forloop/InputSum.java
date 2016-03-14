package forloop;

public class InputSum {
	private int number, i, sum;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
		setSum();
	}

	public int getSum() {
		return sum;
	}

	public void setSum() {
		for (i = 0; i <= number; i++) {
			this.sum += i;
		}
	}

	@Override
	public String toString() {
		return "결과 = [1부터 " + number + "까지의 합은 " + sum + " 입니다.]";
	}

}
