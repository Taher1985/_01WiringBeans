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
			key.play();
			System.out.print(" is being played by " + collectionOfInstruments.get(key));
			System.out.println();
		}
	}

}
