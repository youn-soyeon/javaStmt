package bank;

import java.util.Scanner;

public class BankMain {
	public static void main(String[] args) {
		String name;
		int password;

		Scanner scanner = new Scanner(System.in);

		System.out.println("이름과 비밀번호를 입력하세요 > ");
		
		AccountBean accountBean = new AccountBean(scanner.nextLine(), scanner.nextInt());
		
		System.out.println(accountBean.toString());
	}

}
