package classandobject;

public class objectcreation {
	public  void substraction(int a , int b) 
	{  System.out.println(a-b);}
	public void star ()
	{for(int x=1;x<=5;x++) {
		for(int j=1;j<=x;j++) {
			System.out.print(" *");
		}
		System.out.println();
	}}
	
	public void inverse() 
	{for(int i=1;i<=5;i++) {    
		for(int a=5;a>=i;a--) {
			System.out.print(" *");
		}
		System.out.println();
	}}
	public void trangle() 
	{
		for(int i=1;i<=5;i++) {    
			for(int b=1;b<=i;b++) 
			{System.out.print(" ");}
			for(int a=5;a>=i;a--) 
				System.out.print(" *");
			System.out.println();
			}
		
	}
	public void triangle() 
	{for(int i=1;i<=5;i++) {    //1
		for(int b=5;b>=i;b--) //5,4,3,2,1,
		{System.out.print(" ");}
		for(int a=1;a<=i;a++) 
			System.out.print(" *");
		System.out.println();}
		}
	public   static void main(String[] args) {
	objectcreation jam = new objectcreation ();
	//jam.star();
	//jam.inverse();
	//jam.star();
	//jam.inverse();
	//jam.trangle();
	jam.triangle();
        //System.out.println(jam.substraction(10, 5);
		
	}

}
