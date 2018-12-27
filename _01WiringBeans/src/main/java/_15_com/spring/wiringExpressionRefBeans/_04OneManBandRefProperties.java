package _15_com.spring.wiringExpressionRefBeans;

public class _04OneManBandRefProperties implements _01Performer {

	private _02Instrument instrument;
	
	private String tong;

	public void setInstrument(_02Instrument instrument) {
		this.instrument = instrument;
	}

	public void setTong(String tong) {
		this.tong = tong;
	}

	@Override
	public void perform() {
		instrument.play();
		System.out.println("Song is " + tong);
	}

}
