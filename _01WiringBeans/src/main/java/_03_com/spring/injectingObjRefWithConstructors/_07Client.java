package _03_com.spring.injectingObjRefWithConstructors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class _07Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"/_03applicationcontainerbeans.xml");

		_01Performer performer = (_01Performer) context.getBean("poeticJuggler");
		performer.perform();

	}

}
