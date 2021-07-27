package allgemeineThemen;

public class CountNumber implements Runnable {
	
	
	@Override
	public void run() {
		for (int i = 0; i <= 200; i++) {
			System.out.println("CountNumber in Run "+i);
			
		}
		
	}
	
	
	

	public static void main(String[] args) {
		
		Thread counThread = new Thread(new CountNumber());
		counThread.start();;
		
		
		for (int i = 0; i <= 200; i++) {
			System.out.println("CountNumber in Main "+ i);
			
		}
		

	}


}
