package _04_com.spring.creatingBeansViaFactoryMethod;

public class _02Juggler implements _01Performer {

	private int beanBag;
	private _03Stage stage;

	public _02Juggler(int beanBag, _03Stage stage) {
		super();
		this.beanBag = beanBag;
		this.stage = stage;
	}

	@Override
	public void perform() {
		System.out.println("Juggling " + beanBag + " BeanBags");
		stage.stagePerform();
	}

}
