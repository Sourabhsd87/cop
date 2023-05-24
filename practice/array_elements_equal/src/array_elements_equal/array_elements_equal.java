package array_elements_equal;

import java.util.Arrays;
import java.util.Scanner;

public class array_elements_equal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size:");
		int size=sc.nextInt();
		int a[]=new int[size];
		int b[]=new int[size];
		long count=0;
		int min=0;
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
		}
		while(Arrays.stream(a).min().getAsInt()>=0)
		{
		min=Arrays.stream(a).min().getAsInt();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=min)
			{
				a[i]=a[i]-b[i];
				count++;
			}
		}
		}
		System.out.println(count);
	 
	}

}
//int min = Arrays.stream(a)
//.min()
//.getAsInt();