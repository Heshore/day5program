package Day5;
class MyThread extends Thread {
	@Override
	public void run() {
		System.out.println("Thread is running");
		
	}
}
public class Ex6 {
public static void main(String[] args) {
	// creating a thread by extending Thread class
	My Thread  thread1 = new  MyThread();
	thread1.start();// Start the thread
	
}
}
