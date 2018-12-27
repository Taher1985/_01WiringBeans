package _08_com.spring.injectingObjRefWithProperty;

public class _02Juggler implements _01Performer {

	private _03Instrumentalist instrumentalist;

	public void setInstrumentalist(_03Instrumentalist instrumentalist) {
		this.instrumentalist = instrumentalist;
	}

	@Override
	public void perform() {
		instrumentalist.playInstrument();
	}

}
