package product;

/**
 * @file : ProductMain.java
 * @author sssoyeon92@naver.com
 * @date 2016. 3. 16.
 * @story
 */

public class ProductMain {
	public static void main(String[] args) {
		TV tv = new TV();
		tv.setTvInfo("LG", "TV", "lg1234", "1000만화소", "IPS");

		Computer computer = new Computer();
		computer.setComputerInfo("삼성", "컴퓨터", "sm1234", "512GH", "8G", "1TB");

		SmartPhone phone = new SmartPhone();
		phone.setSmartPhoneInfo("애플", "iphone6", "iphone1234", "1000만화소", "6인치");
		
		//List<Product> list = new ArrayList<Product>(); // 딥카피 List 인터페이스를 구현한 형태
		Product[] cart = new Product[3];
		cart[0] = tv;
		cart[1] = computer;
		cart[2] = phone;
		
		for(Product product : cart) {
			System.out.println(product.display());
		}
	}
}
