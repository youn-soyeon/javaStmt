package product;

// 추상 클래스 : 상속 받게 하기 위해서 사용
public abstract class Product {
	protected String company, name, serialNo;
	
	public Product() {}
	
	public void setProductInfo(String company, String name, String serialNo) {
		this.company = company;
		this.name = name;
		this.serialNo = serialNo;
	}
	
	public abstract String display(); // 추상 메소드 (반드시 하나이상 있어야함)
	// {} = 바디 있으면 구상 메소드
}
