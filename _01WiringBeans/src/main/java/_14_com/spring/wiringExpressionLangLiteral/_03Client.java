package _14_com.spring.wiringExpressionLangLiteral;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class _03Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"/_14applicationcontainerbeans.xml");

		_01Performer performer = (_01Performer) context.getBean("oneManBand");
		performer.perform();
	}
}
