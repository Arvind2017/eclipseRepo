package inheritance;

public class ParentChildBehaviour {
	
	public static void main(String [] arg){
		
		Parent ob= new Child();
		ob.displayBehaviour2();
		
		Child obj= new Child();
		obj.displayBehaviour2();
		
		Child obj1= (Child) new Parent();
		obj1.displayBehaviour();
		
	}

}
