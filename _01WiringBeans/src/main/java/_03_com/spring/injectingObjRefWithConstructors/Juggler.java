package _03_com.spring.injectingObjRefWithConstructors;

public class Juggler implements Performer {

	private int beanBag = 15;

	private Poem poem;

	public Juggler() {
		super();
	}

	public Juggler(int beanBag) {
		super();
		this.beanBag = beanBag;
	}

	@Override
	public void perform() {
		System.out.println("Juggling " + beanBag + " BeanBags");
		poem.recite();
	}

}
