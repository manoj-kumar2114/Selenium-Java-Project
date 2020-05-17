public class ClassOne {

	public static void main(String[] args) {
		ClassOne Name=new ClassOne ();
		Name.schoolclass();
		String res=Name.SchoolName();
		System.out.println("Ryde " +res);
	    Name.add (10, 15);
	
		
	
	
	}
	
	public void schoolclass () 
	{
		System.out.println("School has 19 Classes");
		
	}
	
	public String SchoolName () 
	{
		String sname = "School Name is Ryde";
		return sname;
		
	}
	
	public void add (int a, int b) 
	{
		int c=a+b;
		System.out.println("="  +c);
		
	}
	
	}
