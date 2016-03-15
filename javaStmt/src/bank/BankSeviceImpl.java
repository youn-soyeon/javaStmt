package bank;

import java.util.Vector;

public class BankSeviceImpl implements BankService {
	Vector<AccountBean> accountList;

	public BankSeviceImpl() {
		accountList = new Vector<AccountBean>();
	}

	@Override
	public void openAccount(AccountBean account) {
		// 계좌 개설
		accountList.add(account);
		System.out.println("임시" + accountList);
	}

	@Override
	public String deposit(int account, int money) {
		// 입금
		String str = "";
		for (int i = 0; i < accountList.size(); i++) {
			if (accountList.elementAt(i).getAccountNo() == account) {
				int tempMoney = accountList.elementAt(i).getMoney() + money;
				accountList.elementAt(i).setMoney(tempMoney);
				str = "[입금완료] 계좌번호 : " + account + " 잔액 : " + accountList.elementAt(i).getMoney() + "원";
			} else {
				str = "일치하는 계좌가 없습니다.";
			}
		}
		return str;
	}

	@Override
	public String withdraw(int account, int money, int password) {
		// 출금
		int index = 0;
		for (int i = 0; i < accountList.size(); i++) {

			if (accountList.elementAt(i).getAccountNo() == account) {
				if (accountList.elementAt(i).getPassword() == password) {
					int tempMoney = accountList.elementAt(i).getMoney() - money;
					accountList.elementAt(i).setMoney(tempMoney);
					index = i;
				}
			}
		}
		return "[출금완료] 계좌번호 : " + account + " 잔액 : " + accountList.elementAt(index).getMoney() + "원";
	}

	@Override
	public String findMoney(int account, int password) {
		// 계좌 조회
		String result = "계좌 조회 실패";
		for (int i = 0; i < accountList.size(); i++) {
			if (accountList.elementAt(i).getAccountNo() == account) {
				if (accountList.elementAt(i).getPassword() == password) {
					result = "[출금완료] 계좌번호 : " + account + " 잔액 : " + accountList.elementAt(i).getMoney() + "원";
				}
			}
		}
		return result;
	}

}
