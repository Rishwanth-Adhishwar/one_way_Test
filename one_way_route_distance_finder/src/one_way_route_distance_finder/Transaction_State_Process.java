package one_way_route_distance_finder;

import java.util.*;

public class Transaction_State_Process {


	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		int c1=0,c2=0,c3=0,c4=0;
		List<Integer> l= new ArrayList<>();
		List<Integer> l1= new ArrayList<>();
		boolean go=true;		
		System.out.println("********************************************");
		System.out.println("WELCOME TO TRANSACTION STATE PROCESSOR");
		System.out.println("1.CREATE");
		System.out.println("2.UPDATE");
		System.out.println("3.CANCEL");
		System.out.println("4.EXIT");
		System.out.println("********************************************");
		while(go)
		{
			

			System.out.println("Enter the Choice: ");
			int choice=sc.nextInt();
			if(choice==1)
			{
				System.out.print("Enter the Transaction name:");
				int name=sc.nextInt();
				l.add(name);
				System.out.println("T"+name+" Created");
				c1++;
			}	
			else if(choice==2)
			{
				System.out.println("Enter the Transaction to update: ");
				int update=sc.nextInt();
				if(l.contains(update))
				{
					int a=l.indexOf(update);
					System.out.println("T"+update+" updated");
					c2++;
				}
				else
				{
					System.out.println("Update attempted on non-existing transaction: T"+update);
					c4++;
				}
				
			}
			else if(choice==3)
			{
				System.out.println("Enter the transaction to remove: ");
				int r=sc.nextInt();
				if(l.contains(r))
				{
					int a=l.indexOf(r);
					l.remove(a);
					l1.add(r);
					System.out.println("T"+r+" Cancelled");
					c3++;
				}
			}
			else
			{
				go=false;
			}
		}
		
		System.out.println("ACTIVE TRANSACTIONS :");
		for(int v:l)
		{
			System.out.println("T"+v);
		}
		System.out.println("CANCELLED TRANSACTIONS :");
		for(int v:l1)
		{
			System.out.println("T"+v);
		}
		System.out.println("Total Creates: "+c1);
		System.out.println("Total Updates: "+c2);
		System.out.println("Total Cancels: "+c3);
		System.out.println("Total Errors: "+c4);
		

	}

}
