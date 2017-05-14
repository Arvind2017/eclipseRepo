package collectionPractice;

public class TestClass {
	
	public int hashCode()
	{
		System.out.println("HashCode Method");
		return 1;
	}

	public static void main(String arg[])
	{
		String arg1="Arvind";
		char arg2[]= arg1.toCharArray();
		System.out.println(arg2[0]);
		TestClass ob=new TestClass();
		ob.hashCode();
	}
	
}
