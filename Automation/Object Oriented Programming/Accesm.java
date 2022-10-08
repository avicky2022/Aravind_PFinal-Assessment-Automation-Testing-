package javaoops;

class Accesm {
     private int x=100;
     private void a(){
    	 System.out.println("i am private method");
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Accesm b = new Accesm();
    System.out.println( b.x);
    b.a();
	}

}





package javaoops;

class Defaulta {

	 int add(int x ,int y)
	{
		return (x+y);
	}
}
  
class  Def 
{
	public static void main(String[] args)
	{
		Def a =new Def();
		System.out.println(a.add(10,20));
	}
}





package pack1;

 public class Prota {
	 protected int x=100;
	 protected void m1()
	 {
		 System.out.println("i am pack1");
	 }

}
package pack2;
import pack1.Prota;
public class Protb extends Prota {
	protected void m2()
	{
		System.out.println("i am pack2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Protb a = new Protb();
		a.m1();
		a.m2();

	}

}