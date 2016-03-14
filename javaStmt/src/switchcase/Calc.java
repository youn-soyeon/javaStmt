package switchcase;

public class Calc {
	private int num1, num2, result, mok, nmg;
	private String opcode;

	public void setValues(int num1, String opcode, int num2) {
		this.num1 = num1;
		this.opcode = opcode;
		this.num2 = num2;

		calculate();
	}

	public void calculate() {
		// + - * / 단 나눗셈은 몫과 나머지로 출력
		switch (opcode) {
		case "+": result = num1 + num2; break;
		case "-": result = num1 - num2; break;
		case "*": result = num1 * num2; break;
		case "/": mok = num1 / num2; nmg = num1 % num2; break;
		default: System.out.println("연산기호를 잘못 입력");
			return;
		}
	}

	@Override
	public String toString() {
		if (opcode.equals("/")) {
			return num1 + opcode + num2 + " 몫 = " + mok + " 나머지 = " + nmg;
		} else {
			return num1 + opcode + num2 + "=" + result;
		}
	}

}
