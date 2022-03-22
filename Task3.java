// With help of an anonymous inner class, implement any abstract method of the interface. Observe on working of anonymous Inner class here.

package ExamTasksTO;

interface Age {
	int x=5;
	void getAge();
  }
class Person implements Age {
	public void getAge()
	{
		System.out.println("Age is "+ x);
	}
}
public class Task3 {
	public static void main(String[] args) {
     Person a=new Person();
     a.getAge();
     }
 }

