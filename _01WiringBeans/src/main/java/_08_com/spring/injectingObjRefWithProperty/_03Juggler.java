package _08_com.spring.injectingObjRefWithProperty;

public class _03Juggler implements _01Performer {

	private _02Instrument instrument;

	public void setInstrument(_02Instrument instrument) {
		this.instrument = instrument;
	}

	@Override
	public void perform() {
		instrument.paly();
	}

}
