
public class MethodOverload {

	public static void main(String[] args) {
	MethodOverload obj=new MethodOverload();
	obj.average(25, 45, 65);
	obj.addition (11, 25);
	obj.addition(10, 15, 5);
	obj.addition (45, 15.25);
	String result= obj.Name();
	System.out.println("Student Name " +result);
	int intres=obj.Sub();
	System.out.println ("intres result = " +intres);
		}
	
	public void average (int a, int b, int c) 
	{
		int i=a+b+c;
		int z=i/3;
		System.out.println("Average is " +z );
		
	}
	
	public void addition (int a, int b)
	{ 
		int c=a+b;
		System.out.println("C =" +c);
		
	}
	public void addition (int a, int b, int c) 
	
	{
		int d=a/c;
		System.out.println("C equal to" +c);
		
	}
	
	
	
	
	public void addition (int a, double b) 
	{
	double c=a+b;
	
	System.out.println("C equall to " +c);
			
		
	}
	
	public String Name()
	
	{
		String Student="Manoj";
		return Student;
		
	}



public int Sub () 
{
	int i=80;
	return i;
	
}


}

