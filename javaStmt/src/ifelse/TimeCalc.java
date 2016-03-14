package ifelse;

public class TimeCalc {
	private int hour, minute, second;

	public void setSecond(int second) {
		this.second = second;
		setTime();
	}

	public void setTime() {
		if (second >= 60) {
			minute = second / 60;
			second = second % 60;
			if (minute >= 60) {
				hour = minute / 60;
				minute = minute % 60;
			}
		}
	}

	@Override
	public String toString() {
		return hour + "시간 " + minute + "분 " + second + "초";
	}

}
