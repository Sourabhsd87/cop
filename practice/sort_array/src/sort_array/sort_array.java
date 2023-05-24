package sort_array;

import java.util.Scanner;

public class sort_array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array :-");
		int size = sc.nextInt();
		//creating array of given size
		int arr[]=new int[size];
		System.out.println("Enter elements of array :-");
		//accepting elements of array
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		//sorting array
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		//printing the sorted array.
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
	}

}
