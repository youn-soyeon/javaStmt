package product;

public class Computer extends Product {
	protected String cpu, ram, hdd; // 본체를 구성

	public void setComputerInfo(String company, String name, String serialNo, String cpu, String ram, String hdd) {
		this.cpu = cpu;
		this.ram = ram;
		this.hdd = hdd;
		super.setProductInfo(company, name, serialNo);
	}

	public void setComputerInfo() {

	}

	@Override
	public String display() {
		return "제조회사 : " + super.company + "\n제품명 : " + super.name + "\n고유번호 : " + super.serialNo + "\nCPU : "
				+ this.cpu + "\nRAM : " + this.ram + "\nHDD : " + this.hdd;
	}

}
