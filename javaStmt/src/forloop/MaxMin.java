package forloop;

import java.util.Arrays;

public class MaxMin {
	private int[] arr = new int[5];
	private int max, min, i = 0;

	public int[] getArr() {
		return arr;
	}

	public void setArr(int number) {
		this.arr[i] = number;
		++i;
	}

	public void getMaxMin() {
		
		max = arr[0];
		min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= max) {
				this.max = arr[i];
			} else if (arr[i] <= min) {
				this.min = arr[i];
			}
		}
	}

	@Override
	public String toString() {
		getMaxMin();
		return "최고점은 " + max + "점이고 최저점은 " + min + "점 입니다.";
	}
}
