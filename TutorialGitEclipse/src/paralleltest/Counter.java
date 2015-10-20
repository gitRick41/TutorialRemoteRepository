package paralleltest;

public class Counter implements Runnable{

	private static Integer numb = 0;
	private int prevoiusNumb;
	private int newAttribute;
	
	
	public  Integer getNumb(){
		return numb;
	}
	
	public synchronized void  Increase(){
		long id = Thread.currentThread().getId();
	      System.out.println(" Thread id is: " + id);
		
		Counter.numb=getNumb()+1;
			
	}
	
    public  synchronized void  Decrease(){
    	long id = Thread.currentThread().getId();
	      System.out.println(" Thread id is: " + id);
    	Counter.numb=getNumb()-1;
			
	}
	
	
	public void run() {
		// TODO Auto-generated method stub
		long id = Thread.currentThread().getId();
	      System.out.println(" Thread id is: " + id);
		
	      CounterThread pt = (CounterThread) Thread.currentThread();
	    //  TestStatic tsThread = (TestStatic) Thread.currentThread();
		//System.out.println("inside sum method");
		//myNumb=staticCounter.getNumb();
	      System.out.println(pt.getName());
	      prevoiusNumb = this.getNumb();
		  System.out.println("m1 original value=" + prevoiusNumb);
		
		
		this.Increase();
		
		System.out.println("Previous Numb + 1="+ prevoiusNumb + 1 + "Actual Numb=" +this.getNumb());
		
		
		
		
		//System.out.println("" + staticCounter.numb);
	    this.Decrease();
		System.out.println("Previous Numb="+ prevoiusNumb + "Actual Numb=" +this.getNumb());
		System.out.println();
		
		
		
	}
	
	
	
	
	
}
