package _15_com.spring.wiringExpressionRefBeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class _07Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"/_15applicationcontainerbeans.xml");

		_01Performer performerRefBean = (_01Performer) context.getBean("oneManBandRefBeans");
		performerRefBean.perform();
		
		_01Performer performerRefProperties = (_01Performer) context.getBean("oneManBandRefProperties");
		performerRefProperties.perform();

		_01Performer performerRefMethods = (_01Performer) context.getBean("oneManBandReferencingMethods");
		performerRefMethods.perform();
	}

}
