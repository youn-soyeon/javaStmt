package bank;

public class BankSeviceImpl implements BankService {
	private AccountBean account;

	@Override
	public String openAccount(String name, int password) {
		// 계좌 개설
		account = new AccountBean(name, password);
		return account.toString();
	}

	@Override
	public String deposit(int money) {
		// 입금
		account.setMoney(account.getMoney() + money);
		return "정상적으로 입금처리 되었습니다.";
	}

	@Override
	public String withdraw(int money) {
		// 출금
		account.setMoney(account.getMoney() - money);
		return "정상적으로 출금처리 되었습니다.";
	}

	@Override
	public String findMoney() {
		// 계좌 조회
		return account.getName() + "님의 " + account.getAccountNo() + "잔액 : " + account.getMoney();
	}

}
