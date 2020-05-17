package Inheretance;

public class Animal {

	
	String animal_name;
	String animal_Colour;
	
	public static void main(String[] args) 
	{
		
		Animal obj=new Animal ();
		obj.eating();
		obj.sleeping();
		System.out.println(obj.animal_name);
		
		
	}
	
	public void eating () 
	{
	
		System.out.println("Animal Eating");
	}
	
	public void sleeping () 
	{

		System.out.println ("Animal is sleeing");
	}
	
	public Animal() 
	{
		animal_name="John";
		
	}
}
