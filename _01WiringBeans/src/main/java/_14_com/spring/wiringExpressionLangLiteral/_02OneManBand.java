package _14_com.spring.wiringExpressionLangLiteral;

public class _02OneManBand implements _01Performer {

	private String stringLiteral;

	private int intLiteral;

	private boolean booleanLiteral;

	public void setStringLiteral(String stringLiteral) {
		this.stringLiteral = stringLiteral;
	}

	public void setIntLiteral(int intLiteral) {
		this.intLiteral = intLiteral;
	}

	public void setBooleanLiteral(boolean booleanLiteral) {
		this.booleanLiteral = booleanLiteral;
	}

	public void perform() {
		System.out.println("Value of string literal is " + stringLiteral);
		System.out.println("Value of int literal is " + intLiteral);
		System.out.println("Value of boolean literal is " + booleanLiteral);
	}
}
