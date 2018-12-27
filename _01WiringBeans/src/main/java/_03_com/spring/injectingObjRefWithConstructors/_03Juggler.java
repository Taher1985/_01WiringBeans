package _03_com.spring.injectingObjRefWithConstructors;

public class _03Juggler implements _01Performer {

	private int beanBag = 15;

	public _03Juggler() {
		super();
	}

	public _03Juggler(int beanBag) {
		super();
		this.beanBag = beanBag;
	}

	@Override
	public void perform() {
		System.out.println("Juggling " + beanBag + " BeanBags");
	}

}
