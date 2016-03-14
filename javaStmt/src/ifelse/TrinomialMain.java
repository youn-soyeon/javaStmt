package ifelse;

import java.util.Scanner;

/**
 * @file : Trinomial.java
 * @author sssoyeon92@naver.com
 * @date 2016. 3. 14.
 * @story
 */

public class TrinomialMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Trinomial t = new Trinomial();
		
		System.out.println("이름, 국어, 영어, 수학 점수 입력 > ");
		t.setName(scanner.next());
		t.setScore(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
		
		System.out.println(t.toString());
	}
}
