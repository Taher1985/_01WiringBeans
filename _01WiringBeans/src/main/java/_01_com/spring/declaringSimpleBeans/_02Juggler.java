package _01_com.spring.declaringSimpleBeans;

public class _02Juggler implements _01Performer {

	private int beanBag = 15;

	public _02Juggler() {
		super();
	}

	public _02Juggler(int beanBag) {
		super();
		this.beanBag = beanBag;
	}

	@Override
	public void perform() {
		System.out.println("Juggling "+ beanBag + " BeanBags");
	}

}
