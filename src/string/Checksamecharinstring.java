package string;

public class Checksamecharinstring {
	
	public static void main(String[] args) {
		String a= "expres";
		String b = "example";
		int x = a.length();//4
		int y = b.length();//3
		
		for(int i=1;i<=x;i++) //3
		{
		for(int j=1;j<=y;j++) {
	      char m= a.charAt(i-1);
		char n = b.charAt(j-1);
		if
		( m == n) {System.out.print(" "+ n);}
		
		} 

 
		}//2
		
	
		
		//String n= b.charAt(j);
		//}System.out.println(a.charAt(i));}}
		//Checksamecharinstring obj2= new Checksamecharinstring();
		//obj2.amma();
	}

}
