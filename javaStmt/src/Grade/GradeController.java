package Grade;

import java.util.Scanner;

public class GradeController {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		GradeServiceImpl service = new GradeServiceImpl();
		while (true) {
			System.out.println("[메뉴] 1.등록 2.수정 3.삭제 4.조회(전체) 5.조회(이름) 6.조회(학번) 7.회원수 0.종료");
			
			switch (scanner.nextInt()) {
			case 1: 
				System.out.println("*** 1.등록 ***");
				System.out.println("학번, 이름, JAVA, SQL, JSP, 스프링 점수 입력 > ");
				service.input(new GradeBean(scanner.nextInt(), scanner.next(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt())); // Bean > DAO > DB전달
				System.out.println("등록을 완료하였습니다.");
				break;
			case 2: 
				service.update();
				break;
			case 3: 
				service.delete();
				break;
			case 4: 
				System.out.println("*** 4.조회(전체) ***");
				System.out.println(service.getList());
				break;
			case 5: 
				service.getGrades();
				break;
			case 6: 
				service.getGradeByHak();
				break;
			case 7: 
				service.getCount();
				break;
			case 0: System.out.println("프로그램을 종료합니다."); return;

			default: System.out.println("잘못된 입력입니다. 다시 메뉴로 돌아갑니다."); continue;
			}
		}
	}
}
