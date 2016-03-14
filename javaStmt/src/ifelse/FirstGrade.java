package ifelse;

public class FirstGrade {
	private String aName, bName, cName, firstName;
	private int aScore, bScore, cScore, firstScore;
	
	public void setInfoA(String name, int score) {
		this.aName = name;
		this.aScore = score;
	}
	
	public void setInfoB(String name, int score) {
		this.bName = name;
		this.bScore = score;
	}
	
	public void setInfoC(String name, int score) {
		this.cName = name;
		this.cScore = score;
	}
	
	public String getFirst() {
		firstName = aName;
		firstScore = aScore;
		
		if(bScore > firstScore) {
			firstScore = bScore;
			firstName = bName;
			if(cScore > firstScore) {
				firstScore = cScore;
				firstName = cName;
			}
		} 
		
		return "1등은 " + firstName +", " + firstScore + "점 입니다";
	}
}
