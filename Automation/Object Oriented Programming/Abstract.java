package FinalWork;
abstract class Xyz
{
	abstract void m1();
	void m2()
	{
		System.out.println("m2 method ");
	}
}
public class Abstract extends Xyz{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Abstract a= new Abstract();
a.m1();
a.m2();
	}
	void m1() 
	{
		System.out.println("m1 method");
	}
}