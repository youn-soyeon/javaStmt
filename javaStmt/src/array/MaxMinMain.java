package array;

import java.util.Scanner;

/**
 * @file : MaxMinMain.java
 * @author sssoyeon92@naver.com
 * @date 2016. 3. 14.
 * @story 배열의 최대값 최소값 구하기
 */

public class MaxMinMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = {100, 80, 69, 58, 76, 43, 88, 54, 63};
		MaxMin mm = new MaxMin();
		mm.setMaxMin(arr);
		
		System.out.println(mm.toString());
	}
}
