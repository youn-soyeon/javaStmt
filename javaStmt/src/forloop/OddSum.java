package forloop;

/**
 * @file : OddSum.java
 * @author sssoyeon92@naver.com
 * @date 2016. 3. 10.
 * @story 1부터 10까지 홀수의 합 구하기
 */

public class OddSum {
	public static void main(String[] args) {

		int i = 0, result1 = 0, result2 = 0;

		// int i = 0; // 지역변수는 무조건 초기화
		// int result1 = 0;
		// int result2 = 0;

		System.out.println("1번째 방법");
		for (i = 1; i <= 10; i += 2) {
			result1 += i;
		}
		System.out.println("> 1부터 10까지 홀수의 합 = " + result1);
		System.out.println();

		System.out.println("2번째 방법");
		for (i = 0; i < 10; i++) {
			if (i % 2 == 1) {
				result2 += i;
			}
		}
		System.out.println("> 1부터 10까지 홀수의 합 = " + result2);
	}
}