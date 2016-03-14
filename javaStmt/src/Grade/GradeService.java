package Grade;

/**
 * CRUD
 * C : create 생성
 * R : read 조회
 * U : update 수정
 * D : delete 삭제
 * */

public interface GradeService {
	// C 성적표 등록
	public void input(); // 추상 메소드, 기능을 추상화 한다.
	// R 성적표 리스트 출력
	public void getList();
	// R 성적표 조회(학번)
	public void getGradebyHak();
	// R 성적표 조회(이름)
	public void getGrades();
	// U 성적표 수정
	public void update();
	// D 성적표 삭제
	public void delete();

}
