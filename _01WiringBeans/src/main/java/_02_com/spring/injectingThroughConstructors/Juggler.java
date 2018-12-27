package _02_com.spring.injectingThroughConstructors;

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
		System.out.println("Juggling "+ beanBag + " BeanBags");
	}

}
