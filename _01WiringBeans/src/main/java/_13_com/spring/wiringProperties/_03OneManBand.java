package _13_com.spring.wiringProperties;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class _03OneManBand implements _01Performer {

	private Properties collectionOfInstruments;

	public void setCollectionOfInstruments(Properties collectionOfInstruments) {
		this.collectionOfInstruments = collectionOfInstruments;
	}

	@Override
	public void perform() {

		Set set = collectionOfInstruments.keySet();

		Iterator<String> iterator = set.iterator();

		while (iterator.hasNext()) {
			String instrument = iterator.next();
			System.out.println("The music of " + instrument + " is "
					+ collectionOfInstruments.getProperty(instrument) + ".");
		}
	}

}
