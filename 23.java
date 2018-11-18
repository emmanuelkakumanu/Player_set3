import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
      PriorityQueue<Integer>a=new PriorityQueue<Integer>();
      PriorityQueue<Integer>b=new PriorityQueue<Integer>();
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int k=s.nextInt();
      for(int i=0;i<n;i++){
          int u=s.nextInt();
          a.add(u);
      }
       for(int i=0;i<k;i++){
          int pp=s.nextInt();
          b.add(pp);
      }
      for(int i=0;i<k;i++){

          a.add(b.peek());
          b.poll();
      }
      System.out.println(Collections.max(a));

	}
}
