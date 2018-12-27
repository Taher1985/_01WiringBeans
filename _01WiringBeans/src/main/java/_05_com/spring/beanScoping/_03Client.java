package _05_com.spring.beanScoping;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class _03Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"/_05applicationcontainerbeans.xml");

		_01Juggler juggler1 = (_01Juggler) context.getBean("juggler");
		juggler1.setTicketPatter("Circle");
		System.out.println(juggler1.getTicketPattern());

		_01Juggler juggler2 = (_01Juggler) context.getBean("juggler");
		System.out.println(juggler2.getTicketPattern());

	}

}
