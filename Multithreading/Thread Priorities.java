
class MyThread extends Thread {
	public MyThread(String name) {
		super(name);
	}
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + "  : " + i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

public class Main {
	public static void main(String[] args) {

		MyThread t1 = new MyThread("MY TASK 1");
		t1.start();
		t1.setPriority(Thread.MAX_PRIORITY);;

		MyThread t2 = new MyThread("MY TASK 2");
		t2.start();
		t2.setPriority(7);
		MyThread t3 = new MyThread("MY TASK 3");
		t3.start();

		System.out.println("<<<<<<<<<<<<<<<<<<< " + Thread.currentThread().getName() + ">>>>>>>>>>>>>>");

	}

}
