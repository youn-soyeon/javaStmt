package bank;

import java.util.Scanner;

/**
 * @file : BankController.java
 * @author sssoyeon92@naver.com
 * @date 2016. 3. 15.
 * @story 고객이 보는 화면
 */

public class BankController {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		BankSeviceImpl bank = new BankSeviceImpl();
		while (true) {
			System.out.println("[메뉴] 1.계좌개설 2.입금 3.출금 4.잔액조회 0.종료");
			switch (s.nextInt()) {
			case 1:
				System.out.println("이름과 비밀번호를 입력하세요 > ");
				bank.openAccount(new AccountBean(s.next(), s.nextInt()));
				break;
			case 2: 
				System.out.println("입금하실 계좌번호와 금액을 입력하세요. > ");
				System.out.println(bank.deposit(s.nextInt(), s.nextInt()));
				break;
			case 3: 
				System.out.println("출금하실 계좌번호를 입력하세요 > ");
				int tempAccount1 = s.nextInt();
				System.out.println("출금하실 금액을 입력하세요 > ");
				int tempMoney1 = s.nextInt();
				System.out.println("출금하실 계좌의 비밀번호를 입력하세요 > ");
				int tempPass1 = s.nextInt();
				
				System.out.println(bank.withdraw(tempAccount1, tempMoney1, tempPass1));
				break;
			case 4:
				System.out.println("잔액을 조회하실 계좌번호를 입력하세요 > ");
				int tempAccount2 = s.nextInt();
				System.out.println("조회하실 계좌의 비밀번호를 입력하세요 > ");
				int tempPass2 = s.nextInt();
				
				System.out.println(bank.findMoney(tempAccount2, tempPass2));
				
				break;
			case 0: System.out.println("시스템을 종료합니다."); return;

			default: System.out.println("잘못된 입력입니다. 다시 메뉴로 돌아갑니다."); continue;			}
		}
	}
}
