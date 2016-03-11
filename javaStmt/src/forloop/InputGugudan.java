package forloop;

import java.util.Scanner;

/**
 * @file : InputGugudan.java
 * @author sssoyeon92@naver.com
 * @date 2016. 3. 11.
 * @story 입력받은 정수의 구구단 구하기 
 * 예) 2를 입력하면 2단 출력 
 * 109단을 입력하면 109*2 ~ 109*9 까지 출력 
 * 다만, 0과 음수를 입력하면 1이상 정수값만 입력하시오. 라고 출력
 */

public class InputGugudan {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("출력을 원하는 단을 입력하세요. > ");
		int dan = scanner.nextInt();

		if (dan <= 0) {
			System.out.println("1이상 정수값만 입력하시오.");
			return; // 이 메소드를 종료시켜라
		}

		System.out.println(dan + "단");
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + " * " + i + " = " + dan * i);
		}
	}

}
