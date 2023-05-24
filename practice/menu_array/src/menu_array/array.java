package menu_array;

import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Enter array\n2.Print array\n3.search element\n4.reverse array\n5.even numbers from array.\n6.sum of array elements.\n7.exit");
		int choice = 0;
		boolean flag=false;
		int arr[]=null;
		int size=0;
		do {
			System.out.println("Enter your choice");
			choice = sc.nextInt();
			switch (choice)
			{
			case 1:
				System.out.println("Enter size of array:");
				size = sc.nextInt();
				arr = new int[size];
				for(int i=0;i<size;i++)
				{
					System.out.println("Enter element no "+i+":");
					arr[i]=sc.nextInt();
				}
				break;
			case 2:
				if(size!=0)
				{
				System.out.println("Elements in the array :");
				for(int i=0;i<size;i++)
				{
					System.out.print(arr[i]+" ");
				}
				System.out.println();
				}
				else
				{
					System.out.println("Enter array first.");
					
				}
					break;
			case 3:
				if(size!=0)
				{
					System.out.println("Enter the element you want to search:");
					int a=sc.nextInt();
					for(int i=0;i<size;i++)
					{
						if(arr[i]==a)
						{
							flag=true;
							break;
						}
						
					}
					if(flag==true)
					{
						System.out.println("Element found");
					}
					else
					{
						System.out.println("Element not found.");
					}
				}
				else 
				{
					System.out.println("Enter array first.");
				}
				flag=false;
				break;
			case 4:
				if(size!=0)
				{
					for(int i=size-1;i>=0;i--)
					{
						System.out.print(arr[i]+" ");
					}
				}
				else
				{
					System.out.println("Enter array first.");
				}
				System.out.println();
				break;
			case 5:
				for(int i=0;i<size;i++)
				{
					if(arr[i]%2==0)
					{
						System.out.println(arr[i]+" ");
					}
				}
				break;
			case 6:
				int sum=0;
				for(int i=0;i<size;i++)
				{
					sum=sum+arr[i];
				}
				System.out.println(sum);
				break;
			case 7:
				System.out.println("-----end----");
				break;
			}
		}while(choice<7);
	}

}
