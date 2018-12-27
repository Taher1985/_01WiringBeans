package _01_com.spring.declaringbeans;

public class Juggler implements Performer {

	private int beanBag = 15;

	public Juggler() {
		super();
	}

	public Juggler(int beanBag) {
		super();
		this.beanBag = beanBag;
	}

	@Override
	public void perform() {
		System.out.println("Juggler performed");
	}

}
