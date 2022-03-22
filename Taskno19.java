package ExamTasksTO;

/*Implement an exception "InvalidUserName".
User inputs his UserName in console. When length of userName is <10 or if it has "&", this should be handled by the exception.
*/
import java.util.Scanner;

public class Taskno19 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		try {
			System.out.println("Enter the name :");
			String name=sc.next();
			if(name.length()<10 ||name.contains("&")) {
				throw new Exception("Exception is handled....");
			}
			else {
				System.out.println(name);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
