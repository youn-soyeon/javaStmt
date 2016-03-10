package ifelse;

public class Kaup {
	// 속성영역 : field
	private String name;
	private int kaup;
	private double height, weight;
	private String result;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		//main에서 파라미터 받아와야 한다.
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getKaup() {
		return kaup;
	}

	public void setKaup() {
		// pow(밑, 지수) : 제곱구하는 함수
		this.kaup = (int) (weight / Math.pow(height, 2) * 10000);
	}

	public String getResult() {
		// 기능영역 : area
		return result;
	}

	public void setResult() {
		String temp = "";
		if (kaup > 30) {
			temp = "비만";
		} else if (kaup >= 24) {
			temp = "과체중";
		} else if (kaup >= 20) {
			temp = "정상";
		} else if (kaup >= 15) {
			temp = "저체중";
		} else if (kaup >= 13) {
			temp = "마름";
		} else if (kaup >= 10) {
			temp = "영양실조";
		} else {
			temp = "소모증";
		}

		this.result = temp;
	}
}
