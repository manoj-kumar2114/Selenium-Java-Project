public class MethodClass {

	public static void main(String[] args){
		
		MethodClass obj=new MethodClass();
		obj.Printhello();
		String result = obj.printer();
		System.out.print("Method is completed  : "+result);
   
}

	public void Printhello() 
	{
		System.out.println("Hello");
	}
	
	public String printer() 
	{
		System.out.println("Hi");
		String PRNT="Print";
		return PRNT;
	}
}
