//  For any created thread, Observe the thread life cycle on each run.

package ExamTasksTO;


public class Taskno13{
	public static void main(String[] args) throws Exception {
		MyClass myclass=new MyClass();
		MyClass1 myclass1=new MyClass1();

		myclass.start();
		myclass1.start();

		myclass.setName("Daemon");
		System.out.println(myclass.getName());
		myclass.setPriority(10);

		System.out.println(myclass.getPriority());
		myclass1.setPriority(1);

		System.out.println(myclass1.getPriority());
		myclass.join();
		myclass1.join();

		System.out.println(myclass.isAlive());
		System.out.println(myclass1.isAlive());
		System.out.println(myclass.isDaemon());
		System.out.println(myclass1.isDaemon());
	}
}


