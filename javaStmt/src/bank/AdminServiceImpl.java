package bank;

import java.util.ArrayList;
import java.util.Vector;

public class AdminServiceImpl implements AdminService{
	Vector<AccountBean> accountList;
	
	public AdminServiceImpl() {
		accountList = new Vector<AccountBean>();
	}
	
	@Override
	public Vector<AccountBean> getList() {
		// 전체 계좌목록 출력
		return accountList;
	}

	@Override
	public void openAccount(AccountBean account) {
		accountList.add(account);
		// 계좌 개설
	}

	@Override
	public AccountBean findAccountByAccountNo(int accountNo) {
		// 계좌번호로 계좌 조회 (반드시 한개 조회)
		AccountBean tempAccount = new AccountBean();
		for (int i = 0; i < accountList.size(); i++) {
			if(accountList.get(i).getAccountNo() == accountNo) {
				tempAccount = accountList.get(i);
				break;
			}
		}
		return tempAccount;
	}

	@Override
	public Vector<AccountBean> findAccountsByName(String name) {
		// 이름으로 계좌 조회(복수개의 결과가능)
		Vector<AccountBean> tempAccountList = new Vector<AccountBean>();
		for (int i = 0; i < accountList.size(); i++) {
			if(accountList.get(i).getName().equals(name)) {
				tempAccountList.add(accountList.get(i));
			}
		}
		return tempAccountList;
	}

	@Override
	public String closeAccount(int accountNo) {
		// 계좌 해지
		String tempStr = "해지 실패";
		for (int i = 0; i < accountList.size(); i++) {
			if(accountList.get(i).getAccountNo() == accountNo) {
				accountList.remove(i);
				tempStr = "해지 성공";
				break;
			}
		}
		return tempStr;
	}

	@Override
	public int countAll() {
		// 전체 계좌수 조회
		return accountList.size();
	}

	@Override
	public int countByName(String name) {
		// 해당 이름에 맞는 계좌 수 조회
		Vector<AccountBean> tempAccountList = new Vector<AccountBean>();
		for (int i = 0; i < accountList.size(); i++) {
			if(accountList.get(i).getName().equals(name)) {
				tempAccountList.add(accountList.get(i));
				break;
			}
		}
		return tempAccountList.size();
	}


}
