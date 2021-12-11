package week3;

public class Student extends Department  {
	
	public void studentName()
	{
		System.out.println("Ramya");
	}
	public void studentDept()
	{
		System.out.println("Info tech");
	}
	public void studentId()
	{
		System.out.println("310616205084");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Student stu = new Student ();
       stu.collegeCode();
       stu.collegeName();
       stu.collegeRank();
       stu.deptName();
       stu.studentDept();
       stu.studentId();
       stu.studentName();
	}

}
