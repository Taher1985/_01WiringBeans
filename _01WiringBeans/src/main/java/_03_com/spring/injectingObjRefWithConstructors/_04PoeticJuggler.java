package _03_com.spring.injectingObjRefWithConstructors;

public class _04PoeticJuggler extends _03Juggler {

	private _02Poem poem;

	public _04PoeticJuggler(_02Poem poem) {
		super();
		this.poem = poem;
	}

	public _04PoeticJuggler(int beanBags, _02Poem poem) {
		super(beanBags);
		this.poem = poem;
	}

	public void perform() {
		super.perform();
		System.out.print("While reciting poems ");
		poem.recite();
	}
}
