package _15_com.spring.wiringExpressionRefBeans;

public class _05OneManBandRefMethods implements _01Performer  {

	private _02Instrument instrument;
	
	private String song;
	
	public void setSong(String song) {
		this.song = song;
	}

	public String getSong() {
		return song;
	}

	public void setInstrument(_02Instrument instrument) {
		this.instrument = instrument;
	}

	public void perform() {
		instrument.play();
	} 

}
