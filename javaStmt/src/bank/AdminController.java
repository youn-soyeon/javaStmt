package bank;

import java.util.Scanner;

/**
 * @file : AdminController.java
 * @author sssoyeon92@naver.com
 * @date 2016. 3. 15.
 * @story 관리자가 보는 화면
 */

public class AdminController {
	public static void main(String[] args) {
		AdminServiceImpl admin = new AdminServiceImpl();
		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.println("[메뉴] 1.계좌개설 2.목록 3.조회(계좌번호) 4.조회(이름) 5.계좌 수(전체) 6.계좌 해지 7.계좌 수(이름) 0.종료");
			
			switch (s.nextInt()) {
			case 1: 
				System.out.println("이름과 비밀번호를 입력하세요 > ");
				admin.openAccount(new AccountBean(s.next(), s.nextInt()));
				break;
			case 2: 
				System.out.println(admin.getList());
				break;
			case 3: 
				System.out.println("조회하실 계좌번호를 입력하세요 > ");
				System.out.println(admin.findAccountByAccountNo(s.nextInt()));
				break;
			case 4: 
				System.out.println("조회하실 이름을 입력하세요 > ");
				System.out.println(admin.findAccountsByName(s.next()));
				break;
			case 5: System.out.println("[전체 계좌 수] " + admin.countAll() + "개"); break;
			case 6:
				System.out.println("해지하실 계좌번호를 입력하세요 > ");
				System.out.println(admin.closeAccount(s.nextInt()));
				break;
			case 7:
				System.out.println("해당 이름의 계좌 수를 조회합니다 > ");
				System.out.println(admin.countByName(s.next()));
				break;
			case 0: System.out.println("시스템을 종료합니다."); return;

			default: System.out.println("잘못된 입력입니다. 다시 메뉴로 돌아갑니다."); continue;
			}
		}
	}
}
