package whileloop;

public class Trinomial {
	private String name, result;
	private int kor, eng, math, avg;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setScore(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
		setAvg();
		setResult();
	}
	
	public int getKor() {
		return kor;
	}
	
	public int getEng() {
		return eng;
	}
	
	public int getMath() {
		return math;
	}

	public int getAvg() {
		return avg;
	}

	public void setAvg() {
		this.avg = (int)((kor + eng + math) / 3);
	}

	public String getResult() {
		return result;
	}

	public void setResult() {
		this.result = (avg >= 60) ? "합격" : "불합격";
	}

	@Override
	public String toString() {
		return "[결과] " + name + "님의 평균점수는 " + avg + "으로 " + result + "입니다.";
	}
}
