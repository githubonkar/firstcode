package loop;

public class Mirrorb {
	
	public void first ()
	{for(int x=1;x<=5;x++) {
		for(int j=5;j>=x;j--)
		{System.out.print(" ");}
		for(int m=1;m<=x;m++)
			{System.out.print("*");
		}
		
		System.out.println();
		}}
	public void second ()
	{for(int x=1;x<=5;x++) {
		for(int j=1;j<=x;j++)
		{System.out.print(" ");}
		for(int m=5;m>=x;m--)
			{System.out.print("*");
		}
		System.out.println();
	}}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Mirrorb mine = new Mirrorb ();
	mine.first();
	mine.second();
	mine.first();
	mine.second();
	}

}
