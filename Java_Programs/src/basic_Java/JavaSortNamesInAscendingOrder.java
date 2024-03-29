package basic_Java;

import java.util.Scanner;

public class JavaSortNamesInAscendingOrder {

	public static void main(String[] args) {
		String temp;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of N");
		int N = scan.nextInt();
		scan.nextLine();
		String[] names = new String[N];
		System.out.println("Enter names:");
		for(int i=0;i<N;i++)
		{
			System.out.print("Enter name [ " + ( i + 1 ) + " ]: ");
			names[i] = scan.nextLine();
		}
		
		for(int i=0;i<N;i++)
		{
			for(int j=1;j<N;j++)
			{
				if(names[j-1].compareTo(names[j]) > 0)
				{
					temp = names[j-1];
					names[j-1]=names[j];
					names[j]=temp;
				}
			}
		}
		
		System.out.println("\nSorted names in an ascending order");
		for(int i=0;i<N;i++)
		{
			System.out.println(names[i]);
		}

	}

}
