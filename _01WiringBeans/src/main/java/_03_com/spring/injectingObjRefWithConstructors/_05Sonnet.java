package _03_com.spring.injectingObjRefWithConstructors;

public class _05Sonnet implements _02Poem {

	private String[] lines = { "Poem1,", "Poem2,", "Poem3" };

	public void recite() {
		for (int i = 0; i < lines.length; i++) {
			System.out.print(lines[i]);
		}
	}
}
