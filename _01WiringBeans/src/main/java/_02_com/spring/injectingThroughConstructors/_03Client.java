package _02_com.spring.injectingThroughConstructors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class _03Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"/_02applicationcontainerbeans.xml");

		_01Performer performer = (_01Performer) context.getBean("juggler");
		performer.perform();

	}

}
