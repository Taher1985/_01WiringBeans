package _03_com.spring.injectingObjRefWithConstructors;

public class _06Tonnet implements _02Poem {

	private String[] lines = { "Poem4,", "Poem5,", "Poem6" };

	public void recite() {
		for (int i = 0; i < lines.length; i++) {
			System.out.print(lines[i]);
		}
	}
}
