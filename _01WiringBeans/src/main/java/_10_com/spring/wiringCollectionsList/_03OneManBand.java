package _10_com.spring.wiringCollectionsList;

import java.util.Collection;

public class _03OneManBand implements _01Performer {

	private Collection<_02Instrument> collectionOfInstruments;

	public void setCollectionOfInstruments(
			Collection<_02Instrument> collectionOfInstruments) {
		this.collectionOfInstruments = collectionOfInstruments;
	}

	@Override
	public void perform() {
		for (_02Instrument _02Instrument : collectionOfInstruments) {
			System.out.print("Playing ");
			_02Instrument.play();
		}
	}

}
