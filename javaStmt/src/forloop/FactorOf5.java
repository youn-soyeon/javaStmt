package forloop;

public class FactorOf5 {
	private int endNum, count, sum;

	public int getEndNum() {
		return endNum;
	}

	public void setEndNum(int endNum) {
		this.endNum = endNum;
		setSum();
	}

	public int getCount() {
		return count;
	}

	public void setCount() {
		++this.count;
	}

	public int getSum() {
		return sum;
	}

	public void setSum() {
		for (int i = 1; i <= endNum; i++) {
			if( i % 5 == 0){
				setCount();
				sum += i;
			}
		}
		System.out.println(toString());
	}
	
	@Override
	public String toString() {
		return "결과 = [1부터 " + endNum + "까지의 5배수의 개수는 " + count + "이고 그 합은 " + sum + "입니다.]";
	}
	
}
