package app;

import virus.CoronaThread;

public class CoronaThreadInterruptTest {
	public static void main(String[] args) {
		CoronaThread t = new CoronaThread(2020);
		t.start();
		t.interrupt();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();// TODO: handle exception
		}
		System.out.println("main thread end");
		
	}
}
