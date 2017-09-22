import java.util.Scanner;


public class SortOfArray 
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
		sort(a);
		System.out.println("The numbers arranged in ascending order are given below \n");
	    for (int i = 0; i < a.length; ++i)
	        System.out.println(a[i]);
		

}
	public static void sort(int[] a)
	{
		for (int i = 0; i < a.length; ++i)
	    {
	        for (int j = i + 1; j < a.length; ++j)
	        {
	            if (a[i] > a[j])
	            {
	                int tmp =  a[i];
	                a[i] = a[j];
	                a[j] = tmp;
	            }
	        }
	    }
	}

	}

result
enter the elements
1234
12
1
10
1456
789
1000
15
15
19
The numbers arranged in ascending order are given below 

1
10
12
15
15
19
789
1000
1234
1456
