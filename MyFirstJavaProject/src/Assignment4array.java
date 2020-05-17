
public class Assignment4array {

	public static void main(String[] args) {
		int[] empid=new int[5];
		empid[0]=1789;
		empid[1]=2035;
		empid[2]=1899;
		empid[3]=1456;
		empid[4]=2013;
		int searchinput=1899;
		
		System.out.println("Length of the array is " +empid.length);
		System.out.println(empid[2]);
		System.out.println(empid[4]);
		

		for(int i=0;i<empid.length;i++) {
			if(empid[i]==searchinput) {
				System.out.println("Element is present");
			}
		}
	
	

}
}
	

