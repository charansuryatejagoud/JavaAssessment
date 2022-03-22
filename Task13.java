//  For any created thread, Observe the thread life cycle on each run.

package ExamTasksTO;
class MyClass extends Thread{
	public void run() {
		System.out.println("Hai");
		try {
			Thread.sleep(50);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
class MyClass1 extends Thread{
	public void run() {
		System.out.println("Hello");
		try {
			Thread.sleep(50);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}


