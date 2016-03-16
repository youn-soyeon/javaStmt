package bank;

import java.util.Scanner;

public class BankMain {
	public static void main(String[] args) {
		// 지역변수 영역
		Scanner scanner = new Scanner(System.in);
		BankServiceImpl bankService = new BankServiceImpl();
//		AdminServiceImpl2 admin = new AdminServiceImpl2(100);
		AdminServiceImpl admin = new AdminServiceImpl();

		Loop: while (true) {
			System.out.print("Mode 선택 : 1관리자 2고객 3종료 > ");

			Loop1: switch (scanner.nextInt()) {

			case 1:
				System.out.print("관리자 모드 : 1계좌개설 2계좌번호로 계좌 조회 3이름으로 계좌 조회 4계좌해지 > ");
				Loop2: switch (scanner.nextInt()) {
				case 1:
					System.out.println("이름과 비밀번호를 입력하세요 > ");
//					System.out.println(admin.openAccount(new AccountBean(scanner.next(), scanner.nextInt()));
					break;

				case 2:
					System.out.println("계좌번호로 계좌 조회 : ");
					admin.findAccountByAccountNo(scanner.nextInt());
					break;

				case 3:

					break;

				case 4:

					break;
				}
				continue Loop;

			case 2:
				System.out.println("고객 모드 : 1계좌개설 2입금 3출금 4계좌조회 > ");
				Loop3: switch (scanner.nextInt()) {

				case 1:
					System.out.println("이름과 비밀번호를 입력하세요 > ");
//					System.out.println(bankService.openAccount(scanner.nextLine(), scanner.nextInt()));
					break;

				case 2:
					System.out.println("입금할 금액 : ");
//					System.out.println(bankService.deposit(scanner.nextInt()));
					break;

				case 3:
					System.out.println("출금할 금액 : ");
//					System.out.println(bankService.withdraw(scanner.nextInt()));
					break;

				case 4:
					System.out.println("계좌 조회");
//					System.out.println(bankService.findMoney());
					break;
				}
				continue Loop;

			case 3:
				System.out.println("종료되었습니다.");
				System.exit(0);
				break;
			}
		}
	}

}
