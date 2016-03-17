package switchcase;

public class MonthEndDay {
	private int year, month, endDay;

	public MonthEndDay() {
	}

	public MonthEndDay(int year, int month) {
		this.year = year;
		this.month = month;
		setEndDay(month);
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getEndDay() {
		return endDay;
	}

	public int setEndDay(int month) {
		switch (month) {
		case 1:	case 3:	case 5:	case 7:	case 8:	case 10:
		case 12: endDay = 31;
			break;

		case 4:	case 6:	case 9:	
		case 11: endDay = 30;
			break;

		case 2: endDay = 29;
			break;
		}
		return endDay;
	}

	@Override
	public String toString() {
		if (month >=1 && month <=12) {
			return year + "년 " + month + "월의 말일은 " + endDay + "일 입니다.";
		} else {
			return "잘못된 값";
		}
		
	}
}
