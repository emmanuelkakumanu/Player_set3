import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int l=s.nextInt();
		int r=s.nextInt();int ps=0;
		for(int i=l;i<=r;i++)
		{
			int cnt=0;
			for(int j=1;j<i;j++)
			{
				if(j*j==i)
				cnt=1;
			}
			if(cnt==1)
			ps++;
		}
		System.out.print(ps);
	}
}
