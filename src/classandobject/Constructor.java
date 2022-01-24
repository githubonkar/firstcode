package classandobject;

public class Constructor {
 Constructor ()// zero argument  
 {System.out.println(" zero argument");}
 Constructor(int a ,int b)
 {System.out.println(a+b);}
 Constructor (int b) 
 {System.out.println(" from b int"+" "+b);}

 public static void main(String[] args) {
	 Constructor omi = new Constructor(10,10);
	 Constructor om = new Constructor(10);// to call constructor use different object name 
	// Constructor oni = new Constructor();// to call constructor use different object name 
	 
	 
}

}
