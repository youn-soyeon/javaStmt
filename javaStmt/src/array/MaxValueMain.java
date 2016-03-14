package array;

import java.util.Scanner;

/**
 * @file : MaxValue.java
 * @author sssoyeon92@naver.com
 * @date 2016. 3. 14.
 * @story 배열의 요소 중 가장 큰 값 출력
 */

public class MaxValueMain {
	public static void main(String[] args) {
/*
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수값 3개를 입력 > ");
		int a = 1, b = 2, c = 3; // 4byte 3개 = 12byte
		
*/		
		int[] arr1 = new int[3];
		arr1[0] = 1;
		arr1[1] = 2;
		arr1[2] = 3;
		
		int arr2[] = {32, 26, 76, 44, 66, 30};
		MaxValue mv = new MaxValue();
		
		System.out.println("배열 중 가장 큰 값은 " + mv.getMax(arr2) + "입니다.");
	}
}

class MaxValue{
	public int getMax(int[] arr) {
		int max = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] >= max){
				max = arr[i];
			}
		}
		
		return max;
	}
}