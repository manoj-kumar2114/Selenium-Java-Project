package Inheretance;

public class Cat extends Animal {

	public static void main(String[] args) 
	{
		Cat obj=new Cat ();
		obj.eating();
		obj.sound();
		System.out.println(obj.animal_name);
		

		
	}
	
	public void sound()
	{
		System.out.println ("Cat makes sounds");
		
    }
	
	
}
