package _07_com.spring.injectingThroughProperty;

public class _02Juggler implements _01Performer {

	private String song;

	public _02Juggler() {
		super();
	}

	public void setSong(String song) {
		this.song = song;
	}

	@Override
	public void perform() {
		System.out.println("Singing " + song + " song");
	}

}
