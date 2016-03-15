package bank;

import java.util.Vector;

public class AdminServiceImpl implements AdminService{
	Vector<AccountBean> accountList;
	
	public AdminServiceImpl() {
		accountList = new Vector<AccountBean>();
	}
	
	@Override
	public Vector<AccountBean> getList() {
		// 전체 계좌목록 출력
		return null;
	}

	@Override
	public void openAccount(AccountBean account) {
		accountList.add(account);
		// 계좌 개설
	}

	@Override
	public AccountBean findAccountByAccountNo(int accountNo) {
		// 계좌번호로 계좌 조회(반드시 하나만 검색됨)
		return null;
	}

	@Override
	public Vector<AccountBean> findAccountsByName(String name) {
		// 이름으로 계좌 조회(복수개의 결과가능)
		return null;
	}

	@Override
	public String closeAccount(int accountNo) {
		// 계좌 해지
		return null;
	}

	@Override
	public int countAll() {
		// 전체 계좌수 조회
		return 0;
	}

	@Override
	public int countByName(String name) {
		// 해당 이름에 맞는 계좌 수 조회
		return 0;
	}


}
