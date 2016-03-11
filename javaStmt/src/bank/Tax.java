package bank;

import java.util.Scanner;

/**
 * @file : Tax.java
 * @author sssoyeon92@naver.com
 * @date 2016. 3. 11.
 * @story 이름과 연봉을 입력받아서
 * 다음과 같은 결과물이 나오도록 출력하시오
 * 세율은 10%
 * [결과]
 * 연봉 ***원을 받으시는 ** 님께서
 * 이번달 납부할 세금은 *** 만원 입니다
 */

public class Tax {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name = "";
		int salary = 0, tax = 0;
		
		System.out.println("이름과 연봉을 입력하십시오 > ");
		name = scanner.next();
		salary = scanner.nextInt();
		
		tax = (int) (salary * 0.1);
		
		System.out.println("[결과] 연봉 " + salary + "만원을 받으시는 " + name + " 님께서 이번달 납부할 세금은 " + tax + "만원 입니다");
	}
}