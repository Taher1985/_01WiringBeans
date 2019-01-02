package _09_com.spring.injectingInnerBeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class _06Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"/_09applicationcontainerbeans.xml");

		_01Performer performer = (_01Performer) context.getBean("juggler");
		performer.perform();

	}

}
