package inheritance;

public class Parent {
	
	public void displayBehaviour()
	{
		System.out.println("Parent class displayBehaviour");
	}

	public void displayBehaviour2()
	{
		System.out.println("Parent class displayBehaviour...2");
	}
}

class Child extends Parent
{
	public void displayBehaviour()
	{
		System.out.println("Child class displayBehaviour");
	}
	
	public void displayBehaviourExtended()
	{
		System.out.println("Child class extended displayBehaviour");
	}
}

