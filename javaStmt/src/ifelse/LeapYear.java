package ifelse;

import java.util.Scanner;

/**
 * @file : LeapYear.java
 * @author sssoyeon92@naver.com
 * @date 2016. 3. 11.
 * @story 윤년 프로그램
 * 연도를 4로 나눈 값이 0이라면 윤년일 수 있다
 * 그러나 해당 년도가 100으로 나눠 떨어지면 평년이다
 * 그중 100으로 나눠 떨어지더라도 다시 400으로 나눠 떨어지면 윤년이다
 * 예) 1000년은 평년, 2000년은 윤년, 2016년은 윤년이다.
 * 그래서 테스트 값이 1000을 입력했는데 평년이라 나오고,
 * 2000을 입력했는데 윤년, 2016을 입력했을 때 윤년이라고 나오면 정확
 */

public class LeapYear {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("판별하려는 년도를 입력");
		int year = scanner.nextInt();
		String yearStr = "";
		
		if(year % 4 == 0) {
			yearStr = "윤년";
			if(year % 100 == 0){
				yearStr = "평년";
				if(year % 400 == 0){
					yearStr = "윤년";
				}
			}
		}else {
			yearStr = "평년";
		}
		
		System.out.println(year + "는 " + yearStr +" 입니다.");
	}
}