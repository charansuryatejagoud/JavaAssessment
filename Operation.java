/* Class named Operations have final variables like plus,minus,divide and multiply.
   This class has a method named calculate which takes 2 inputs of type double and return value in double
   inside calculate: if plus, inputs are added and returned.(similarly for other methods minus,divide and multiply).
   AssertionError is also thrown when user doesn't perform any of these operations in default.
   In your main method: calculate all 4 results and have these printed in console.
   Make sure to have dynamic inputs.*/

package ExamTasksTO;

public class Operation {
	final double plus = 0;
	final double minus = 1;
	final double divide = 2;
	final double multiple = 3;
	public double calculate(int i, double a, double b) {
		if(i == plus) {
			System.out.println(a + b);
		}
		else if(i == minus) {
			System.out.println(a - b);
		}
		else if(i == divide) {
			System.out.println(a/b);
		}
		else if (i == multiple) {
			System.out.println(a*b);
		}
		return 0;
	}
}
