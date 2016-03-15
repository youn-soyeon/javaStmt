package member;

public interface MemberService {
	/**
	 * 회원가입
	 * */
	public String join(MemberBean member);
	/**
	 * 회원로그인
	 */
	public String login(String id, String password);
	/**
	 * 내정보보기
	 * */
	public MemberBean checkInfo(String id, String password);
	/**
	 * 회원정보수정
	 * */
	public String update(MemberBean member);
	/**
	 * 회원탈퇴
	 * */
	public String remove(String id, String password);

}
