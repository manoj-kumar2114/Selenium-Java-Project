
public class Construction {

	int cons;
	String cons1;
	int empid;
	public static void main(String[] args) {
		
		Construction obj=new Construction();
		Construction obj1=new Construction(20);
		System.out.println(obj.cons);
		System.out.println(obj.cons1);
		System.out.println(obj1.cons);
		
		
	

	}
	
	public Construction()
	{
		cons=80;
		cons1="Manoj";
	}
	
	public Construction (int a)
	{
		cons=20;
		
	}
	

	
}
