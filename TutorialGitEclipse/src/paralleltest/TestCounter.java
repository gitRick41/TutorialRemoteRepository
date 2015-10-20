package paralleltest;

import org.testng.annotations.Test;

public class TestCounter {
	
	    @Test
		public void main(){
	    	 long id = Thread.currentThread().getId();
		      System.out.println(" Thread id is%%%%%%%%%: " + id);
				Counter ct = new Counter();
				CounterThread pt1 = new CounterThread(ct,"SAM");
				//CounterThread pt2 = new CounterThread(ct, "Jack");
				pt1.start();
				
				
				//pt2.start();
				
				
				}
	    
	    @Test
		public void main2(){
	    	long id = Thread.currentThread().getId();
		      System.out.println(" Thread id is@@@@@@@@@: " + id);
				Counter ct = new Counter();
				//CounterThread pt1 = new CounterThread(ct,"SAM");
				CounterThread pt2 = new CounterThread(ct, "Jack");
			//	pt1.start();
				pt2.start();
				
				
				}

}
