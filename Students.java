package week3;

public class Students {
	
	public void getStudentInfo(int id)
	{
	System.out.println(id);	
	}
	public void getStudentInfo(int id , String name)
	{
		System.out.println(id +   name);	
	}
	public void getStudentInfo(String email , long phonenumber)
	{
		System.out.println(email +   phonenumber);	
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Students st = new Students();
		st.getStudentInfo(84);
		st.getStudentInfo(84, " Ramya");
		st.getStudentInfo("ramya@gmail.com ",  987896666);
	}

}
