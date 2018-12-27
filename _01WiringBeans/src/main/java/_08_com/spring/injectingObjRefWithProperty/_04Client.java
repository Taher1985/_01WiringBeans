package _08_com.spring.injectingObjRefWithProperty;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class _04Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"/_08applicationcontainerbeans.xml");

		_01Performer performer = (_01Performer) context.getBean("juggler");
		performer.perform();

	}

}
