
public class ThrowsKeyExample {

	public static void main(String[] args)
	{
		ThrowsKeyExample obj=new ThrowsKeyExample();
		try {
			obj.exceptionmethod();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally
		{
			System.out.println("Hello");
			
		}

	}

	public void exceptionmethod() throws Exception 
	
	{
	throw new Exception ();
	
	}
	
	
	
	
}
