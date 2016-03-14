package ifelse;

public class LeapYear {
	private int year;
	private String yearStr;
	
	public void setYear(int year) {
		this.year = year;
		getYearStr();
	}
	public String getYearStr() {
		yearStr = ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) ? "윤년" : "평년" ;		
		return yearStr;
	}
	
	@Override
	public String toString() {
		return year + "년은 " + yearStr +" 입니다.";
	}
	
}
