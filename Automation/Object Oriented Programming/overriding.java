package FinalWork;
 class Person1
 {
	 void Person()
	 {
		 System.out.println("HI everyone");
	 }
 }
public class MethodOver extends Person1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   MethodOver a = new MethodOver();
   a.Person();
	}
	 void Person()
	 {   super.Person();
		 System.out.println("Good morning");
	 }
}