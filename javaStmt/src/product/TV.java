package product;

public class TV extends Product {
	protected String picture, screen;

	public void setTvInfo(String company, String name, String serialNo, String picture, String screen) {
		this.picture = picture;
		this.screen = screen;
		super.setProductInfo(company, name, serialNo);
	}

	@Override
	public String display() {
		return "제조사 : " + super.company + "\n제품명 : " + super.name + "\n제품번호 : " + super.serialNo + "\n화질 : "
				+ this.picture + "\n스크린 : " + this.screen;
	}

}
