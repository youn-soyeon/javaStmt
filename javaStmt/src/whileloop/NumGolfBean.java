package whileloop;

public class NumGolfBean {
	// 플레이어 : 게임 참여자가 맞히려고 입력한 값
	// 컴 : 컴퓨터가 랜덤 생성한 값
	// 카운트 : 플레이어가 입력한 횟수
	// 카운트가 작을수록 승리
	int player, com, count;
	boolean flag; // 컴의 숫자와 일치하는지 체크하는 값
	
	//생성하지 않아도 default로 생성되어있음.
	public NumGolfBean() {
		// TODO Auto-generated constructor stub
	}
	

	public int getPlayer() {
		return player;
	}

	public void setPlayer(int player) {
		this.player = player;

		setFlag();
		isFlag();
	}

	public int getCom() {
		return com;
	}

	public void setCom() {
		// 1부터 10까지 랜덤 수 발생
		this.com = (int) ((Math.random() * 10) + 1);
	}

	public int getCount() {
		return count;
	}

	public void setCount() {
		++this.count;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag() {
		if (getCom() == getPlayer()) {
			this.flag = true;
		} else {
			this.flag = false;
		}

		System.out.println(toString());
	}

	@Override
	public String toString() {
		if (getCom() == getPlayer()) {
			return "값이 일치합니다. \n" + "결과 [플레이어 값=" + player + ", 컴퓨터 값=" + com + ", 시도한 횟수=" + count + ", 일치여부=" + flag
					+ "]";
		} else {
			return "일치하지 않습니다. - "+count+"번 시도함";
		}
	}

}
