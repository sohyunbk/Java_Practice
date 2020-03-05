
public class TestCourse {
	public static void main(String[] args) {
	    Course course1 = new Course("Data Structures");
	    Course course2 = new Course("BINF 6006");

	    course1.addStudent("Peter Jones");
	    course1.addStudent("Brian Smith");
	    course1.addStudent("Alice Kennedy");

	    course2.addStudent("Peter Jones");
	    course2.addStudent("Steve Smith");

	    System.out.println("Number of students in course1: "
	      + course1.getNumberOfStudents());
	    String[] students = course1.getStudents();
	    for (int i = 0; i < course1.getNumberOfStudents(); i++)
	      System.out.print(students[i] + ", ");
	    String[] students2 = course2.getStudents();
	    System.out.println();
	    System.out.print("Number of students in course2: "
	      + course2.getNumberOfStudents());
	    System.out.println();
	    for (int i = 0; i < course2.getNumberOfStudents(); i++)
		      System.out.print(students2[i] + ", ");
	  }

}

/* Á÷Á¢ ÀÛ¼ºÇØ³õÀº°Å¶û °ãÄ§
     class Course {
	  private String courseName;
	  private String[] students = new String[4];
	  private int numberOfStudents;
	    
	  public Course(String courseName) {
	    this.courseName = courseName;
	  }
	  
	  public void addStudent(String student) {
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
*/