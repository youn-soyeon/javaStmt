package array;

import java.util.Scanner;

/**
 * @file : InfiniteLoop.java
 * @author sssoyeon92@naver.com
 * @date 2016. 3. 14.
 * @story
 */

public class InfiniteLoopMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		InfiniteLoop il = new InfiniteLoop();
		
		while (true) { // 하나의 statement
			System.out.print("1.정수 입력 2.종료 > "); // 메뉴
			il.setKey(scanner.nextInt());

			switch (il.getKey()) {
			case 1:
				System.out.println("출력할 정수값 입력");
				il.setResult(scanner.nextInt());
				System.out.println(il.toString());
				break;
			
			case 2:
				System.out.println("종료합니다.");
				return;
			
			default:
				System.out.println("잘못된 값");
				return;
			}
		}
	}
}
