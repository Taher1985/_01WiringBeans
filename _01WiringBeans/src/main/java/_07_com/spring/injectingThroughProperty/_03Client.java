package _07_com.spring.injectingThroughProperty;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class _03Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"/_07applicationcontainerbeans.xml");

		_01Performer performer = (_01Performer) context.getBean("juggler");
		performer.perform();

	}

}
