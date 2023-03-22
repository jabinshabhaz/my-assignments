package assignment2.day4;

	public class Student extends Department {
	    public void studentName(){
	        System.out.println("jabin");
	    }
	    public void studentDept(){
	        System.out.println("computer science");
	    }
	    public void studentId(){
	        System.out.println("013");
	    }

	    public static void main(String[] args) {
	        Student student = new Student();
	        student.studentName();
	        student.studentDept();
	        student.studentId();
	        //Single inheritance
	        student.deptNmae();
	        //Multilevel Inheritance
	        student.collegeName();
	        student.collegeCode();
	           student.collegeRank();

}}
