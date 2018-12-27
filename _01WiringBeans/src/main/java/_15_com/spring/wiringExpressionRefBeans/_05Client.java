package _15_com.spring.wiringExpressionRefBeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class _05Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"/_15applicationcontainerbeans.xml");

		_01Performer performer = (_01Performer) context.getBean("oneManBandRefBeans");
		performer.perform();

	}

}
