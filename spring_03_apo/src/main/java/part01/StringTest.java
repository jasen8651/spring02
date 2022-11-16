package part01;

import java.util.Random;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StringTest {

	public static void main(String[] args) {
		String path ="part01/aop.xml";
		
		ApplicationContext context = new ClassPathXmlApplicationContext(path);
		
		Service svc = null;
		svc =(Service) context.getBean("svc");
		svc.prn1();
		svc.prn1(10);
		svc.prn1(new Random());
		svc.prn1(20,30);
	}

}
