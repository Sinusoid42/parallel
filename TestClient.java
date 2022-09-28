package Test7;

public class TestClient {

	public static void main(String[] args) {
		
		Consumer C = new Consumer();
		Waiter W = new Waiter();
		W.C = C;
		W.thr.start();
		C.thr.start();
		System.out.println("TEST");
		
		
		
		
	}
}
