package intro2java;
public class Student {
	protected String name;
	protected int grade;
	public static String principalName= "Ms. McKoy";
	protected String studentID;
	public static int nextID =100;
	
	 public Student(String name, int grade) {
		 this.name= name;
		 this.grade= grade;
		 String x = name.toUpperCase();
		 this.studentID=(x.charAt(0)+(String.valueOf(nextID++)));		
	}
	 public static void newPrincipal(String princ ) {
		 principalName= princ;
	 }
	 public static void resetID( ) {
		 nextID =100;
	 }
	public String toString() {
		return name+ " " +studentID;
	}
	
    // declare the instance variables 
    //constructor 
    //create static method newPrincipal
    // create static method resetID 
    //create toString() method 
    
    //Dont modify this code
    public static void main(String[] args) {
        Student s1 = new Student("Muhammed", 11);
        Student s2 = new Student("Alan", 11);
        Student s3 = new Student("Sophie", 11);

        System.out.println("Principal Name for student 1: " + Student.principalName);
        System.out.println("Student ID for student 1: " + s1.studentID);
        System.out.println("Student ID for student 2: " + s2.studentID);
        System.out.println("Student ID for student 3: " + s3.studentID);

        Student.newPrincipal("Mr. McKoy");
        System.out.println("New principal name: " + Student.principalName);

        Student.resetID();
        Student s4 = new Student("kevin", 11);
        System.out.println("Student ID for student 4: " + s4.studentID);
        System.out.println("String representation of student 4: " + s4.toString());
    }
}
