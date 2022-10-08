package FinalWork;

public class Exception_pro{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[]=new int[5];
        try {
        	x[6]=4;
        	
        }
       
        catch(ArithmeticException e)
        {
        	System.out.println("Exception 1");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
        	System.out.println("Exception 2");
        }
       
        finally {
        	System.out.println("final exception");
        }
	}

}