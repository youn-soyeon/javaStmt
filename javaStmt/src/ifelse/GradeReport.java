package ifelse;

public class GradeReport {
	private String name, subject;
	private int score;
	private char grade;
	
	public void setInfo(String name, String subject, int score) {
		this.name = name;
		this.subject = subject;
		this.score = score;
		
		getGrade();
	}

	public char getGrade() {
		
		if (score >= 90) {
			grade = 'A';
		} else if(score >= 80){
			grade = 'B';
		} else if(score >= 70) {
			grade = 'C';
		} else if(score >= 60) {
			grade = 'D';
		} else if(score >= 50) {
			grade = 'E';
		} else {
			grade = 'F';
		}

		return grade;
	}

	@Override
	public String toString() {
		return 	"[결과] \n" +"******************************\n"	+"이름	과목	점수	학점\n" + "------------------------------\n" 
				+ name + "	" + subject + "	" + score + "점	" + grade + "	\n" + "******************************";
	}
	
	
	
	
}
