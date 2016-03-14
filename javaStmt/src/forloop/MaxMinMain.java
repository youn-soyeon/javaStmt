package forloop;

import java.util.Scanner;

/**
 * @file : MaxMin.java
 * @author sssoyeon92@naver.com
 * @date 2016. 3. 11.
 * @story 최고점, 최저점 구하기
 * [결과]
 * 학생들 평균 점수를 입력하시면 최고점, 최저점이 출력됩니다.
 * 단, 정원은 5명입니다. 
 * 평균 점수를 입력하세요.
 * 
 * 최고점은 100점이고
 * 최저점은 30점 입니다.
 */

public class MaxMinMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		MaxMin mm = new MaxMin();
		System.out.println("학생들 평균 점수를 입력하시면 최고점, 최저점이 출력됩니다. "
				+ "단, 정원은 5명입니다. 평균 점수를 입력하세요.");
		for (int i = 0; i < 5; i++) {
			mm.setArr(scanner.nextInt());
		}
		System.out.println(mm.toString());
		
	}
}
