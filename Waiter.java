package Test7;

public class Waiter implements Runnable{

	Thread thr;
	
	Consumer C;
	
	public Waiter() {
		this.thr = new Thread(this);
	}

	public void run() {
		while(true) {
			synchronized(C) {
				System.out.println("Ich bin der Waiter");
			try {
				C.wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
			}
		}
	}
}

