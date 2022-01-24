package firstcode;

public class omi {
	static int a = 20;
	public void impicit () 
	{int a = 10;
	System.out.println(" implicit"+a);
	double b = (double) a ;
	System.out.println(b);}
	
	public void expicit () 
	{double a = 10.25;
	System.out.println(a);
	int b = (int) a ;
	System.out.println(" expicit"+b);}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		omi obj= new omi();
		obj.expicit();
		obj.impicit();
		omi.a=10;
		System.out.println(a);
		
		
		
		

		
		//int a = 100;
		//int b = a%3;
		
		
		//System.out.println(obj.a);
	}

}
