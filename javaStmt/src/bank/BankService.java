package bank;

public interface BankService {
	/**
	 * 계좌 개설
	 */
	public void openAccount(AccountBean account);

	/**
	 * 입금
	 */
	public String deposit(int account, int money);

	/**
	 * 출금
	 */
	public String withdraw(int account, int money, int password);

	/**
	 * 잔액조회
	 */
	public String findMoney(int account, int password);
}
