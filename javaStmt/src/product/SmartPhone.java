package product;

public class SmartPhone extends Product {
	protected String camera, size;

	public void setSmartPhoneInfo(String company, String name, String serialNo, String camera, String size) {
		this.camera = camera;
		this.size = size;
		super.setProductInfo(company, name, serialNo);
	}

	@Override
	public String display() {
		return "제조사 : " + super.company + "\n제품명 : " + super.name + "\n제품번호 : " + super.serialNo + "\n카메라화소 : "
				+ this.camera + "\n사이즈 : " + this.size;
	}

}
