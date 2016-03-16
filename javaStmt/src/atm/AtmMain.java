package atm;

/**
 * @file : AtmMain.java
 * @author sssoyeon92@naver.com
 * @date 2016. 3. 16.
 * @story
 */

public class AtmMain {
	public static void main(String[] args) {
		Atm atm = new Atm();

		// deep copy
		// implement도 내부적으로 extends처럼 처리된다
		Runnable hong = new User(atm, "홍길동");
		Runnable kim = new User(atm, "김유신");
		Runnable lee = new User(atm, "이순신");

		Thread thr1 = new Thread(hong);
		thr1.start();
		Thread thr2 = new Thread(kim);
		thr2.start();
		Thread thr3 = new Thread(lee);
		thr3.start();

	}
}
