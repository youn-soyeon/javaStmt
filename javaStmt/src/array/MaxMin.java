package array;

public class MaxMin {
	private int max, min;

	public int getMaxMin() {
		return min;
	}

	public void setMaxMin(int[] arr) {
		max = arr[0];
		min = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] >= max) {
				max = arr[i];
			} else if (arr[i] <= min){
				min = arr[i];
			}
		}
		
		this.max = max;
		this.min = min;
	}

	@Override
	public String toString() {
		return "최대, 최소값 [최대값=" + max + ", 최소값=" + min + "]";
	}

}
