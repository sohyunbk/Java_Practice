import java.util.Date;

public class Class_Course {
	public static void main(String[] args) {
		Course co1 = new Course("Math");
		//Course co1 = new Course();
		co1.addstudent("sohyun");
		co1.addstudent("sohyun2");
		co1.addstudent("sohyun3");
		System.out.println(co1.getNumberOfStudents());	
		System.out.println(co1.getCourseName());	
		String studentarray[] = co1.getStudents();
	}}

class Course {
  private String courseName;
  private String[] students = new String[16];
  private int numberOfStudents;


  public Course(String newcourseName) {
	  this.courseName = newcourseName;
  }

  
  public void addstudent(String student) {
	  students[numberOfStudents] = student;
	  numberOfStudents++;
  }
  
  public String[] getStudents() {
	  return students;
  }
  
  public int getNumberOfStudents() {
	  return numberOfStudents;
  }
  public String getCourseName() {
	  return courseName;
  }
  
}
