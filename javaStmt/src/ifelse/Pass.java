package ifelse;

import java.util.Scanner;

/**
 * @file : Pass.java
 * @author sssoyeon92@naver.com
 * @date 2016. 3. 11.
 * @story 과목 점수를 입력하면 총점과 평균이 나오고
 * 이를 통해 합격 여부를 통지하는 프로그램
 * [결과]
 * ************************************************************************
 * 이름	자바	JSP	SQL	스프링	총점	평균	합격여부
 * ------------------------------------------------------------------------
 * 홍길동	80	40	60	70	250	62.0	합격
 * ************************************************************************
 * 합격 여부는 평균이 60점 이상이면 합격
 */

public class Pass {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름, 자바점수, JSP점수, SQL점수, 스프링점수를 입력하세요. > ");
		String name = scanner.next();
		int java = scanner.nextInt(), jsp = scanner.nextInt(), sql = scanner.nextInt(), spring = scanner.nextInt();
		
		int sum = java+jsp+sql+spring;
		double avg = sum / 4;
		String passStr = "불합격";
		
		if(avg >= 60) {
			passStr = "합격";
		}
		
		System.out.println("[결과]");
		System.out.println("************************************************************************");
		System.out.println("이름	자바	JSP	SQL	스프링	총점	평균	합격여부");
		System.out.println("------------------------------------------------------------------------");
		System.out.println(name + "\t" + java + "\t" + jsp + "\t" + sql + "\t" + spring + "\t" + sum + "\t" + avg + "\t" + passStr);
		System.out.println("************************************************************************");
	}
}