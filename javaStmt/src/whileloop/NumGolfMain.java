package whileloop;

import java.util.Scanner;

/**
 * @file : NumGolfMain.java
 * @author sssoyeon92@naver.com
 * @date 2016. 3. 10.
 * @story 컴퓨터가 랜덤생성한 숫자를 가장 빠른 횟수로 맞추는 게임
 */

public class NumGolfMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		NumGolfBean numGolfBean = new NumGolfBean();

		System.out.println("컴퓨터 랜덤 수 발생");
		numGolfBean.setCom();

		while (numGolfBean.isFlag() == false) {
			numGolfBean.setCount();
			System.out.println("숫자를 입력하세요.");
			numGolfBean.setPlayer(scanner.nextInt());
		}

	}
}
