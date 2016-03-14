package ifelse;

import java.util.Scanner;

/**
 * @file : TimeCalc.java
 * @author sssoyeon92@naver.com
 * @date 2016. 3. 11.
 * @story 초를 입력하면 시간, 분 초를 출력하는 프로그램
 * 10000초를 입력하면 7시간 47분 13초로 출력
 */
public class TimeCalc {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("초를 입력해 주세요. > ");
		int second = scanner.nextInt();
		
		int hour = 0, minute = 0;
		
		if(second >= 60) {
			minute = second / 60;
			second = second % 60;
			if(minute >= 60){
				hour = minute / 60;
				minute = minute % 60;
			}
		}
		
		
		System.out.println(hour + "시간 " + minute + "분 " + second + "초");
	}
}