import java.util.Scanner;
public class MaxAndMin 
{
	public static void main(String[] args)

	{
		Scanner scanner = new Scanner(System.in);
		int[] a=new int[10];
		
		System.out.println("enter the elements");
		
		for(int i=0;i<a.length;i++)
		{
			
			a[i]=scanner.nextInt();
			
		}
		
		maxAndMin(a);
	}
	public static void maxAndMin(int[] a)
	{
		int max=a[0];
		int min=a[0];
		for (int i = 0; i <a.length; i++)
	    {
	      if (a[i] > max)
	        {
	          max = a[i];
	        }
	      else if (a[i] < min)
	        {
	          min = a[i];
	        }
	    }
	  System.out.println("min:"+min);
	  System.out.println("max:"+max);
	  
	  
	}

	
}

result:
enter the elements
1
2
3
4
5
6
8
9
88
100
min:1
max:100
