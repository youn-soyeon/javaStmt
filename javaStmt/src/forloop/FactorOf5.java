package forloop;

import java.util.Scanner;

/**
 * @file : FactorOf5.java
 * @author sssoyeon92@naver.com
 * @date 2016. 3. 11.
 * @story 5의 배수의 개수와 합
 */

public class FactorOf5 { 
	/**
	 * [결과]
	 * 1에서 100(입력받은 수)까지 정수까지
	 * 5 배수의 개수는 20이고
	 * 5 배수의 합은 1050 이다
	 * */
	
	public static void main(String[] args) {
		int endNum = 0, count = 0, sum = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("리미트값 입력 > ");
		endNum = scanner.nextInt();
		
		for (int i = 1; i <= endNum; i++) {
			if( i % 5 == 0){
				++count;
				sum += i;
			}
		}
		
		System.out.println("1에서"+ endNum +"까지 정수까지 5 배수의 개수는 " + count + "이고 5 배수의 합은 " + sum + " 이다");
	}
}
