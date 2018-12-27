package _01_com.spring.declaringSimpleBeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"/_01applicationcontainerbeans.xml");

		Performer performer = (Performer) context.getBean("juggler");
		performer.perform();

	}

}