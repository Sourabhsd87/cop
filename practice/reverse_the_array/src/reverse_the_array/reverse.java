package reverse_the_array;

import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array :- ");
		int size = sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		int a[]=new int[size];
		int j=size-1;
		for(int i=0;i<size;i++)
		{
			a[j]=arr[i];
			j--;
		}
		System.out.println("Original array");
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("reversed array");
		for(int i=0;i<size;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
