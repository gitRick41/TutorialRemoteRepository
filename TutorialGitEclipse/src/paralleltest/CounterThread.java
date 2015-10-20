package paralleltest;

import org.testng.annotations.Test;
//@Test(singleThreaded= true)
public class CounterThread extends Thread {
	
	 
	public CounterThread(Runnable target, String name){
		
		super(target, name);
		long id = Thread.currentThread().getId();
	      System.out.println(" Thread id is *********************: " + id);
		
	}
	
	 
}
