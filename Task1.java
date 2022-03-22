// Implement one-many association for Company and Employee.(Make sure to have rating,startYear for Employee)

package ExamTasksTO;

	class Company { private String name;
	Company(String name)
 {
	this.name = name;
	   }
	public String getCompanyName()
 {
	return this.name;
	   }
	}
	class Employee { private String name;
	private int rating;
	private int startyear;
	Employee(String name,int rating, int startyear)
 {
	this.name = name;
	this.rating = rating;
	this.startyear = startyear;
	   }
	public String getName()
  {
	return this.name;
	    }
	public int getRating()
 {
	return this.rating;
	  }
	public int getStartYear()
 {
	return this.startyear;
	      }
	  }
	class Task1 { public static void main(String[] args)
  {
	Company c = new Company("SYSTEM");
	Employee emp1 = new Employee("Vikram",1, 2002 );
	Employee emp2 = new Employee("Surya",12, 2008 );
	Employee emp3 = new Employee("Vijay", 10, 2007);
	Employee emp4 = new Employee("Vishal", 15, 2010);
	System.out.println(emp1.getName()+"-"+emp1.getRating()+"-"+emp1.getStartYear()+"-"+ "is from "+ c.getCompanyName());
	System.out.println(emp2.getName()+"-"+emp2.getRating()+"-"+emp2.getStartYear()+"-"+ "is from "+ c.getCompanyName());
	System.out.println(emp3.getName()+"-"+emp3.getRating()+"-"+emp3.getStartYear()+"-"+ "is from  "+ c.getCompanyName());
	System.out.println(emp4.getName()+"-"+emp4.getRating()+"-"+emp4.getStartYear()+"-"+ "is from "+ c.getCompanyName());
	         }
	  }

	

