package switchcase;

public class Gender {
	private String name, ssn, gender;
	private char flag;

	public void setInfo(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
		setGender();
	}

	public void setGender() {
		flag = ssn.charAt(7);
		switch(flag) {
		case 1:
		case 3: gender = "남자"; return;
		
		case 2:
		case 4: gender = "여자"; return;
		
		case 5:
		case 6: gender = "외국인"; return;
		
		default:
			System.out.println("잘못된 주민번호 입니다.");
			return;
		}
	}

	@Override
	public String toString() {
		return name + "은 " + gender + "입니다.";
	}

	
	
	
}
