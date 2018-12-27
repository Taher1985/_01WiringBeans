package _06_com.spring.initdestroyBeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class _02Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"/_06applicationcontainerbeans.xml");

		_01Auditorium auditorium = (_01Auditorium)context.getBean("auditorium");

		((ClassPathXmlApplicationContext) context).close();
	}

}
