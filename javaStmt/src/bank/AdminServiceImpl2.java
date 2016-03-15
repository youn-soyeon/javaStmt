package bank;

/**
 * @file : BankServiceImpl.java
 * @author sssoyeon92@naver.com
 * @date 2016. 3. 10.
 * @story 뱅크 서비스 비즈니스 로직
 */

public class AdminServiceImpl2 implements AdminService2 {

	private AccountBean[] accountList; // 전체 계좌를 보관하는 객체
	private int count; // 전체 통장 계좌 수

	public AdminServiceImpl2(int size) {
		// accountList를 초기화 해줌
		accountList = new AccountBean[size];
	}

	@Override
	public String openAccount(String name, int password) {
		// 계좌 개설
		// 기능안에 속성이 숨어들어감 = 은닉화
		AccountBean bean = new AccountBean(name, password);
		accountList[count] = bean; // 배열에 새로 생성된 bean 객체를 저장하여 전체계좌를 보관한다.
		
		count++; // 계좌를 개설할 때 마다 카운트를 1씩 증가시킨다.
		return bean.toString();
	}

	@Override
	public AccountBean findAccountByAccountNo(int accountNo) {
		// 계좌번호로 계좌 조회(반드시 하나만 검색됨)
		AccountBean temp = new AccountBean();
		
		for (int i = 0; i < count; i++) {
			if (accountList[i].getAccountNo() == accountNo) {
				temp = accountList[i];
				System.out.println("라라라라라랄"+temp.toString());
			}
		}
		return temp;
	}

	@Override
	public AccountBean[] findAccountsByName(String name) {
		// 이름으로 계좌 조회(복수개의 결과가능)
		AccountBean[] tempList = new AccountBean[this.countByName(name)];

		return tempList;
	}

	@Override
	public String closeAccount(int accountNo) {
		// 계좌 해지
		return null;
	}

	@Override
	public int countAll() {
		// 전체 계좌수 조회
		return count;
	}

	@Override
	public int countByName(String name) {
		// 해당 이름에 맞는 계좌 수 조회
		return 0;
	}

}
