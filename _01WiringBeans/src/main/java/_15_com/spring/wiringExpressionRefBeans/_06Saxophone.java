package _15_com.spring.wiringExpressionRefBeans;

public class _06Saxophone implements _02Instrument {

	private _06Saxophone() {
		super();
	}

	public void play() {
		System.out.println("Rhythm of Saxophone is TOOT TOOT TOOT $$$");
	}

	public String playWhistle() {
		return "Phw Pwe Prr ###";
	}
}
