package forloop;

import java.util.Scanner;

/**
 * @file : InputSum.java
 * @author sssoyeon92@naver.com
 * @date 2016. 3. 11.
 * @story 1부터 입력된 수까지의 정수의 합 구하기
 * 예) 10을 입력하면 콘솔에는 1부터 10까지의 합은 55 입니다.
 */

public class InputSumMain {
	public static void main(String[] args) {
		InputSum is = new InputSum();
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 > ");
		is.setNumber(scanner.nextInt());
		System.out.println(is.toString());
	}
}
