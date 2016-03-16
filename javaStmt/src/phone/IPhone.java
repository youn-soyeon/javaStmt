package phone;

public class IPhone extends CellPhone {
	private String data;
	public static String BRAND = "아이폰";
	public static boolean TRUE = true;
	// 아이폰은 집 전화기는 생산하지 않는다.
	
	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	// 메소드 오버로딩 - 재정의
	public void setData(String name, String data) {
		super.setCompany(BRAND);
		super.setPotable(TRUE);
		this.setCall(name);
		this.data = super.getCompany() + "\t" + super.isPotable() + "\t" + super.getCall() + "\t" + data + " : 메시지 전달";
	}

}
