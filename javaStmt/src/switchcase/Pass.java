package switchcase;

import java.util.Scanner;

/**
 *@file : Pass.java 
 *@author sssoyeon92@naver.com
 *@date 2016. 3. 11.
 *@story 과목 점수를 입력하면 총점과 평균이 나오고 
 *이를 통해 합격 여부를 통지하는 프로그램 (스위치케이스처리)
 *[결과]
 **************************************************************
 *학생 	자바 	JSP 	SQL 	스프링 	총점 	평균 	합격여부
 *-------------------------------------------------------------
 *홍길동  80      40     60      70      250      62.5    합격
 **************************************************************
 *합격 여부는 60 이상이면 합격
 */
public class Pass {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름과 자바점수, jsp점수, sql점수, 스프링 점수를 입력하세요 > ");
		String name = scanner.next();
		int java = scanner.nextInt(), jsp = scanner.nextInt(), sql = scanner.nextInt(), spring = scanner.nextInt();
		
		int sum = java+jsp+sql+spring;
		int avg = sum / 4;
		String passStr = "";
		
		switch(avg) {
		case 100 : case 99 : case 98: case 97 : case 96 : case 95 : case 94 : case 93 : case 92 : case 91 : 
		case 90 : case 89 : case 88: case 87 : case 86 : case 85 : case 84 : case 83 : case 82 : case 81 : 
		case 80 : case 79 : case 78: case 77 : case 76 : case 75 : case 74 : case 73 : case 72 : case 71 : 
		case 70 : case 69 : case 68: case 67 : case 66 : case 65 : case 64 : case 63 : case 62 : case 61 : 
		case 60 : passStr = "합격"; break;
		
		case 59 : case 58: case 57 : case 56 : case 55 : case 54 : case 53 : case 52 : case 51 :  
		case 50 : case 49 : case 48: case 47 : case 46 : case 45 : case 44 : case 43 : case 42 : case 41 : 
		case 40 : case 39 : case 38: case 37 : case 36 : case 35 : case 34 : case 33 : case 32 : case 31 : 
		case 30 : case 29 : case 28: case 27 : case 26 : case 25 : case 24 : case 23 : case 22 : case 21 : 
		case 20 : case 19 : case 18: case 17 : case 16 : case 15 : case 14 : case 13 : case 12 : case 11 : 
		case 10 : case 9 : case 8: case 7 : case 6 : case 5 : case 4 : case 3 : case 2 : case 1 : 
		case 0: passStr = "불합격";
		
		default :
			System.out.println("잘못된 입력입니다.");
			return;
		}
		
		
		System.out.println("[결과]");
		System.out.println("*************************************************************");
		System.out.println("학생 	자바 	JSP 	SQL 	스프링 	총점 	평균 	합격여부");
		System.out.println("-------------------------------------------------------------");
		System.out.println(name + "\t" + java + "\t" + jsp + "\t" + sql + "\t" + spring + "\t" + sum + "\t" + avg + "\t" + passStr);
		System.out.println("*************************************************************");
	}
}