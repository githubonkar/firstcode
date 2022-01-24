package loop;

public class Forpractice {
	public void single() {
   for (int i=1;i<=3;i++) 
	{for(int j=3;j>=i;j--) 
	{System.out.print("*");}
	}
	System.out.println();
	}
	public void second() {
		   for (int i=1;i<=3;i++) 
			{for(int j=1;j<=i;j++)
			{System.out.println("");
			System.out.print("*");}
			}
			System.out.println();
			}
	public static void main(String[] args) {
	Forpractice omi = new Forpractice ();
	omi.single();
	}
