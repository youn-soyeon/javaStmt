package ifelse;

import java.util.Scanner;

/**
 * @file : BigNumber.java
 * @author sssoyeon92@naver.com
 * @date 2016. 3. 11.
 * @story 입력된 3개 숫자에서 가장 큰 수
 */

public class BigNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("3개의 숫자를 입력하세요. > ");
		int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();
		int big = a;

		if (b > big) {
			big = b;
			if(c > big) {
				big = c;
			}
		} 

		System.out.println("가장 큰 수는 " + big + "입니다.");
	}
}