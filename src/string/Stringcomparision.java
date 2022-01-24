
package string;

public class Stringcomparision {
String x = "    ";
String y = "ONKAAR";
public void Methods() 
{System.out.println(x.equals(y));
System.out.println(x.trim().isEmpty());
System.out.println(x.equalsIgnoreCase(y));
System.out.println(x.concat(y));
System.out.println(String.join(" ",y,x));}
  
public void loop() {
	for (int i= 0; i<=y.length();i++) {
		   for (int j=i+1;j<=y.length()-1;j++)
			   if(y.charAt(i)==y.charAt(j)){
				   System.out.println(y.charAt(j));
				  ;}
		  
		   
		 
				 
					   
				   
			 
	}
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stringcomparision obj = new Stringcomparision();
		obj.loop();
	}

}
