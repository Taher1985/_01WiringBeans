package _03_com.spring.injectingObjRefWithConstructors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"/_03applicationcontainerbeans.xml");

		Performer performer = (Performer) context.getBean("juggler");
		performer.perform();

	}

}
