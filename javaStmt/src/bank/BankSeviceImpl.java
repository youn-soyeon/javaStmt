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
		int index = 0;
		for (int i = 0; i < accountList.size(); i++) {
			if(accountList.elementAt(i).getAccountNo() == account) {
				int tempMoney = accountList.elementAt(i).getMoney() + money;
				accountList.elementAt(i).setMoney(tempMoney);
				index = i;
			}		
		}
		return "[입금완료] 계좌번호 : "+ account + " 금액 : " + accountList.elementAt(index).getMoney() + "원";
	}

	@Override
	public String withdraw(int account, int money, int password) {
		// 출금
		int index = 0;
		for (int i = 0; i < accountList.size(); i++) {
			if(accountList.elementAt(i).getAccountNo() == account) {
				int tempMoney = accountList.elementAt(i).getMoney() + money;
				accountList.elementAt(i).setMoney(tempMoney);
				index = i;
			}
		}
		return "정상적으로 출금처리 되었습니다.";
	}

	@Override
	public String findMoney() {
		
		// 계좌 조회
		return "";
//		return account.getName() + "님의 " + account.getAccountNo() + "잔액 : " + account.getMoney();
	}

}
