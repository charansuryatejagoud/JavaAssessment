// Implement many-many association for Trainee and StudyMaterial.


package ExamTasksTO;

public class Task2 { 
	public static void main(String[] args) {
		Trainee P =new Trainee("Arun","Maths");
		Trainee P1 =new Trainee("Sujatha","Science");
		StudyMaterial C =new StudyMaterial("Charan",26);
		StudyMaterial C1 =new StudyMaterial("Kovela",16);
		System.out.println("These are Students :"+P.name +" "+ P1.name);
        System.out.println("They are Trainees :"+C.name +" "+ C1.name);
	}

}
