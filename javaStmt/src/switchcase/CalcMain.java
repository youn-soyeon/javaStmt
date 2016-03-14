package switchcase;

import java.util.Scanner;

/**
 *@file : Calc.java 
 *@author sssoyeon92@naver.com
 *@date 2016. 3. 11.
 *@story 사칙연산기
 */

public class CalcMain {
	public static void main(String[] args) {
		Calc c = new Calc();
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자,연산기호,숫자 입력");
		c.setValues(scanner.nextInt(), scanner.next(), scanner.nextInt());
		
		System.out.println(c.toString());
	}
}