package com.threads;

class CustomThread extends Thread {

	private int count;

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Hello " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

class RunnableImpl implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Hello " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

public class ThreadDemo {

	public static void main(String[] args) {

//		CustomThread thread = new CustomThread();
//		thread.start();
//
//		CustomThread thread2 = new CustomThread();
//		thread2.start();

		Thread t = new Thread(new RunnableImpl());
		t.start();

		Thread t3 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub

			}
		});
		Runnable r1 = () -> System.out.println("My Runnable");
		Thread t2 = new Thread(new RunnableImpl());
		t2.start();

	}

}
