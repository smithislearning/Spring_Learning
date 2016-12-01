package HelloWorldP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.supportClassPathXmlApplicationContext;

public class HelloWorldSpringDI {
	public static void main(String[] args) {
		AplicationContext ctx = new ClassPathXmlApplicationContext("META-INF/spring/app-context.xml");
		
		MessageRenderer mr = ctx.getBean("renderer", MessageRenderer.class);
		mr.render();
	}
}
