package part03;

public class ServiceImp implements Service {

	public ServiceImp() {

	}

	@Override
	public void prn() {
		int sum = 0;
		for (int i = 0; i < 100000; i++) {
			sum +=i;
		}
		System.out.println("sum :" + sum);
	}

}
