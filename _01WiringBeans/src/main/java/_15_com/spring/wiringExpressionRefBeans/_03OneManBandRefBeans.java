package _15_com.spring.wiringExpressionRefBeans;

public class _03OneManBandRefBeans implements _01Performer {

	private _02Instrument instrument;

	public void setInstrument(_02Instrument instrument) {
		this.instrument = instrument;
	}

	@Override
	public void perform() {
		instrument.play();
	}

}
