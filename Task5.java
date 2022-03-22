// Design a class OnlyOnce and make sure that only one time it is instantiated. 

package ExamTasksTO;

  public class Task5 {
  static class Database {
  private static Database dbObject;
  private Database() {
     }
  public static Database getInstance() {

  if(dbObject == null) {
  dbObject = new Database();
     }
  return dbObject;
    }
  public void getConnection() {
  System.out.println("You are now connected to the database.");
    }
  }
  public static void main(String[] args) {
  Database db1;
  db1= Database.getInstance();
  db1.getConnection();
       }
   }