package hclprograms;

public class ThreadJoin implements Runnable{

	/**
	 * @param args
	 */
	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
     System.out.print("Start");
     Thread t1=new Thread(new ThreadJoin());
     t1.start();
     t1.join();
     System.out.print("end");
     
	}

	public void run() {
		for(int i=1;i<5;i++)
		System.out.print(i);
		
	}

}
