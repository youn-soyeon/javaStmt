package phone;

public class CellPhone extends Phone {
	private boolean potable; // 이동성
	private String move;

	public CellPhone() {
		this.setPotable(true);
	}

	public boolean isPotable() {
		return potable;
	}

	public void setPotable(boolean potable) {
		if (potable) {
			this.setMove("폰을 가지고 다닐 수 있음");
		} else {
			this.setMove("폰을 가지고 다닐 수 없음");
		}
		this.potable = potable;
	}

	public String getMove() {
		return move;
	}

	public void setMove(String move) {
		this.move = move;
	}

	@Override
	public String getCall() {
		// getCall()은 조상꺼 가져다 씀
		// getMove()는 본인 꺼 사용 (나한테만 있는 것)
		return super.getCall() + " " + this.getMove();
	}

}
