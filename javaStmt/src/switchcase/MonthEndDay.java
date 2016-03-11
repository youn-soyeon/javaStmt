package switchcase;

import java.util.Scanner;

/**
 * @file : MonthEndDay.java
 * @author sssoyeon92@naver.com
 * @date 2016. 3. 11.
 * @story 해당 월의 말일을 출력함
 * 예를 들면 1월이면 31일 출력
 */

public class MonthEndDay {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("월 입력 > ");
		int month = scanner.nextInt(), endDay = 0;
		
		switch (month) {
		case 1:endDay = 31; break;
		case 3:endDay = 31; break;
		case 5:endDay = 31; break;
		case 7:endDay = 31; break;
		case 8:endDay = 31; break;
		case 10:endDay = 31; break;
		case 12:endDay = 31; break;
		
		case 4:endDay = 30; break;
		case 6:endDay = 30; break;
		case 9:endDay = 30; break;
		case 11:endDay = 30; break;
		
		case 2:endDay = 29; break;
		
		default:
			System.out.println("잘못된 값");
			return;
		}
		
		System.out.println(month + "월의 말일은 " + endDay + "일 입니다.");
	}
}
