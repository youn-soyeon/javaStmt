package phone;

import java.util.Scanner;

public class PhoneMain {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println(" === 집전화기로 통화 > === ");
		PhoneMain pm = new PhoneMain();
//		pm.usePhone(s);
//		pm.useNokia(s);
//		pm.useIPhone(s);
		pm.useAndroid(s);
	}

	public void useAndroid(Scanner s) {
		Phone android = new AndroidPhone();
		android.setCompany("안드로이드");
		System.out.println(android.getCompany() + "를 사용");
		System.out.println("휴대폰으로 통화할 사람? ");
		((AndroidPhone) android).setData(s.next(), s.next(), "6인치");
		System.out.println(((AndroidPhone) android).getData());
	}

	public void useIPhone(Scanner s) {
		IPhone iPhone = new IPhone();
		iPhone.setCompany("애플");
		System.out.println(iPhone.getCompany() + "를 사용");
		System.out.println("휴대폰으로 통화할 사람? ");
		iPhone.setData(s.next(), s.next());
		System.out.println(iPhone.getData());
	}

	public void useNokia(Scanner s) {
		// 다형성
		// 부모의 타입으로 자식의 생성자를 통해 인스턴스를 생성해야 한다.
		Phone nokia = new CellPhone();

		nokia.setCompany("노키아");
		System.out.println(nokia.getCompany() + "를 사용합니다.");
		System.out.println("통화할 사람? ");
		nokia.setCall(s.next());
		System.out.println(nokia.getCall());
	}

	public void usePhone(Scanner s) {
		Phone phone = new Phone();
		phone.setCompany("삼성 집전화기");
		System.out.println(phone.getCompany() + "를 사용합니다.");
		System.out.println("통화할 사람? ");
		phone.setCall(s.next());
		System.out.println(phone.getCall());
	}
}
