package part01;

import org.aspectj.lang.ProceedingJoinPoint;

public class AdviceCommon {
	public AdviceCommon() {
		// TODO Auto-generated constructor stub
	}
	
	public void comm1() {
		System.out.println("befor");
	}
	
	public void comm2() {
		System.out.println("after");	
	}
	
	public void comm3(String name) {
		System.out.println(name);
	}
	public void comm4(Exception ex) {
		System.out.println("comm4:"+ex);
	}
	public void comm5(ProceedingJoinPoint point) {
		System.out.println("comm5 start");
		try {
			point.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("prn5 end");
	}
}
