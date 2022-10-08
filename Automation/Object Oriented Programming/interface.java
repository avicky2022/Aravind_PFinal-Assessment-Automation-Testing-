package FinalWork;
interface Shiva
{
	void m1();
}
interface Ram 
{
	void m2();
}
public  class Interference implements Shiva,Ram{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Interference a = new Interference();
a.m1();
a.m2();
	}
	public void m1()
	{
		System.out.println("m1 method");
		
	}
	
	public void m2()
	{
		System.out.println("m2 method");
		
	}
	
	

}