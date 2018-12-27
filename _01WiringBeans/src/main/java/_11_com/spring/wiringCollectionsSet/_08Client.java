package _11_com.spring.wiringCollectionsSet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class _08Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"/_11applicationcontainerbeans.xml");

		_01Performer performer = (_01Performer) context.getBean("oneManBand");
		performer.perform();

	}

}
