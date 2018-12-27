package _08_com.spring.injectingObjRefWithProperty;

public class _03Instrumentalist {

	private String isntrument;

	public void setIsntrument(String isntrument) {
		this.isntrument = isntrument;
	}

	public void playInstrument() {
		System.out.println("Playing " + isntrument);
	}

}
