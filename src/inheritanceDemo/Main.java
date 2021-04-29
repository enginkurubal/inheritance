package inheritanceDemo;

public class Main {

	public static void main(String[] args) {
		
		UserManager instructor = new UserManager();
		instructor.log(new InstructorManager());
		
		UserManager student = new UserManager();
		student.log(new StudentManager());
	}

}
