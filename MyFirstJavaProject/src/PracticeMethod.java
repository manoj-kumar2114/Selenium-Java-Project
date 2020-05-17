
public class PracticeMethod {

	public static void main(String[] args) {
		PracticeMethod Obj2=new PracticeMethod ();
		 Obj2.print();
		int result = Obj2.printhello();
		System.out.println("Printer Job" +result);
		Obj2.add(2, 4);
		Obj2.sub(23, 16);
		Obj2.sub(15, 5);
		int res=Obj2.divide();
		System.out.println("divide =" +res);
		

	}
	
	public void print()
	{
		System.out.println("Printer Initiated");
	}
	
	public int printhello() 
	{
	
		int j=80;
		return j;
	
	}
	
	public void add(int a, int b)
	{
		int c=a+b;
		System.out.println("C: " +c);
		

	}
	
	public void sub(int e, int f)
	{
		
		int g=e-f;
		System.out.println("e: " +g);
	
	}
	
	
	public int divide()
	
	{
		
		int d=95;
		return d;
		
	}
}
	

