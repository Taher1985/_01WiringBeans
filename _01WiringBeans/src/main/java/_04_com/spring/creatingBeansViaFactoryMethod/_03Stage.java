package _04_com.spring.creatingBeansViaFactoryMethod;

public class _03Stage {

	private static _03Stage stage;

	private _03Stage() {

	}

	public void stagePerform() {
		System.out.println("stagePerform is called ");
	}

	public static _03Stage getInstances() {
		if (stage == null) {
			stage = new _03Stage();
		}
		return stage;
	}

}
