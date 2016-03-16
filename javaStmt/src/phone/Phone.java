package phone;

/**
 * @file : Phone.java
 * @author sssoyeon92@naver.com
 * @date 2016. 3. 16.
 * @story 폰 외 확장을 통해 상속의 개념을 이해해보자
 */

// 상속 시킬 클래스
public class Phone {
	protected String company, call; // Phone를 상속받은 후손은 볼 수 있다

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getCall() {
		return call;
	}

	public void setCall(String call) {
		this.call = call + "에게 전화를 검";
	}
}
