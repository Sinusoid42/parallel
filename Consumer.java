package Test7;

public class Consumer implements Runnable{
	
	Thread thr;
	
	Boolean keyMonitor = false;
	
	public Consumer() {
		this.thr = new Thread(this);
	}
	
	public void run() {
		while(true) {
			synchronized(this) {
				System.out.println("Ich bin der Consumer");
				this.notifyAll();		
			}
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}			
		}
	}
	

}
