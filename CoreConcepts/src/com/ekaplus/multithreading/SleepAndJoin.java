package com.ekaplus.multithreading;

public class SleepAndJoin extends Thread {
	int count = 0;

	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				synchronized (SleepAndJoin.class) {
                    // Thread.currentThread().join();
					System.out.println("Name : "
							+ Thread.currentThread().getName() + " Count : "
							+ count++);
					//System.out.println(" "+i);
					Thread.sleep(1000);
				suspend();
				resume();
				}
			} catch (InterruptedException ie) {
				System.out.print("I am Inturrepted");
			}
		}
		System.out.println();

	}

	public static void main(String[] args) {
		SleepAndJoin sleepAndJoin = new SleepAndJoin();
		Thread t1 = new Thread(sleepAndJoin,"Ramesh1");
		Thread t2 = new Thread(sleepAndJoin,"Basava");
		Thread t3 = new Thread(sleepAndJoin,"Krishna");
		t1.start();
		t2.start();
		t3.start();
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException ie) {
			
			System.out.print("I am Inturrepted");

		}
		System.out.println("I am main");
	}
}
