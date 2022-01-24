package string;

public class Emptystrin {
	public void name() 
	{String a ="onkar";
	int b = a.trim().length();
	 boolean s =a.trim().isEmpty();
	 
	if(b==0|| s==true ) 
	{System.out.println("please enter name");}
	else {System.out.println("name="+a);}}
	public void gmai() 
	{String a ="on@gmail.com";
	int b = a.trim().length();
	 boolean s =a.trim().isEmpty();
	 
	if(b==0|| s==true ) {System.out.println("please enter name");}
	else {System.out.println("Gmail="+a);}}
	public void mobile() 
	{String a ="abcdefghij";
	
	int b = a.trim().length();
	 if(b==10) {
	if(b==0 ) {System.out.println("please enter number");}
	else {System.out.println("mobile="+a);} }
	else 
	{System.out.println("enter valid phone number");}}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emptystrin obj = new Emptystrin();
		obj.name();
		obj.gmai();
		obj.mobile();

	}

}
