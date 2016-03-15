package Grade;

import java.util.Vector;

public class GradeServiceImpl implements GradeService{
	// 멤버 필드(속성 집합)
	Vector<GradeBean> gradeList;
	
	public GradeServiceImpl() {
		gradeList = new Vector<GradeBean>(); // 초기화
	}
	
	// 멤버 메소드 area(메소드 집)
	@Override
	public void input(GradeBean bean) {
		// C 성적표 등록
		gradeList.add(bean);
	}

	@Override
	public Vector<GradeBean> getList() {
		// R 성적표 리스트 출력
		return gradeList;
	}

	@Override
	public void getGradeByHak() {
		// R 성적표 조회(학번)
		
	}

	@Override
	public void getGrades() {
		// R 성적표 조회(이름)
		
	}
	
	@Override
	public void getCount() {
		// R 카운트 조회(개수)
		
	}

	@Override
	public void getCountByName() {
		// R 이름조회시 카운트 조회
		
	}

	@Override
	public void update() {
		// U 성적표 수정
		
	}

	@Override
	public void delete() {
		// D 성적표 삭제
		
	}

}
