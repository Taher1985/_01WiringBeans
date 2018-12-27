package _12_com.spring.wiringMap;

import java.util.Map;

public class _03OneManBand implements _01Performer {

	private Map<_02Instrument, String> collectionOfInstruments;

	public void setCollectionOfInstruments(
			Map<_02Instrument, String> collectionOfInstruments) {
		this.collectionOfInstruments = collectionOfInstruments;
	}

	@Override
	public void perform() {
		for (_02Instrument key : collectionOfInstruments.keySet()) {
			System.out.print("Value is " + collectionOfInstruments.get(key));
			System.out.print(" So Playing ");
			key.play();
		}
	}

}
