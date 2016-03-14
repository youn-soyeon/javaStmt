package array;

public class MaxValue {
	int max;

	public int getMax(int[] arr) {
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= max) {
				max = arr[i];
			}
		}

		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

}
