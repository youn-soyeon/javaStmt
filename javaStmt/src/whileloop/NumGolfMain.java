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
		System.out.println(numGolfBean.getCom());

		while (true) {
			System.out.println("[메뉴] 1.숫자 맞추기 2.종료 > ");
			int key = scanner.nextInt();
			switch (key) {
			case 1:
				while (numGolfBean.isFlag() == false) {
					System.out.println("숫자를 입력하세요.");
					numGolfBean.setPlayer(scanner.nextInt());
					System.out.println(numGolfBean.toString());
				}
				return;
			case 2: System.out.println("종료합니다.");
				return;
			default:
				System.out.println("잘못된 입력 입니다.");
				break;
			}

		}

	}
}
