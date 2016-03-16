package atm;

public class User implements Runnable {
	Atm atm;
	String name;

	public User(Atm atm, String name) {
		super();
		this.atm = atm;
		this.name = name;
		// 부모의 생성자
		// 부모의 기능을 가져다 쓰기 위해 부모의 생성자를
		// 자식의 생성자 내부에 호출함
	}

	@Override
	public void run() {
		atm.inchul(name);
	}
}
