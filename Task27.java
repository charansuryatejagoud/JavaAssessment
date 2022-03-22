//Exceptions with many catches and its order of execution.
//	examine on specific to general. Make sure to include both compile time and runtime exceptions in it.
//	try followed by catch and finally with return in all blocks. Examine output.
//	try followed by catch with return in both blocks. Examine output.

package ExamTasksTO;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
  public class Task27 {
   public static void main(String[] args) {
	try {
	int a[]=new int[4];
	a[4]=75/0;
	FileWriter f=new FileWriter("pqr.txt");
	f.write("Hello");
	    }
	catch(ArithmeticException e) {
	System.out.println("Exception Solved"+e);
	return;
	   }
	catch(ArrayIndexOutOfBoundsException ae) {
	System.out.println("ArrayIndexOutOfBoundsExeption solved"+ae);
	return;
     	}
	catch(IOException a) {
	System.out.println("NullPointerException is handled"+a);
	return;
     	}
	catch(Exception n) {
	System.out.println("Nothing to do");
	return;
     	}
	finally{
	System.out.println("Exceptions Are Handled");
         	}
	     }
	}