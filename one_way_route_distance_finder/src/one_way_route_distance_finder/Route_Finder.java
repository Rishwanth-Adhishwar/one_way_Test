package one_way_route_distance_finder;

import java.util.Arrays;
import java.util.Scanner;

public class Route_Finder {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int ab=sc.nextInt();
		int bc=sc.nextInt();
	    int cd=sc.nextInt();
	    int de=sc.nextInt();

		String r=sc.nextLine().toLowerCase();
		char a[]=r.toCharArray();
		int sum=0;
		
		
		
		for(int i=0;i<a.length-1;i++)
		{
			
				if(a[i]=='a' && a[i+1]=='b')
				{
					sum=sum+ab;
				}
				else if(a[i]=='b' && a[i+1]=='c')
				{
					sum=sum+bc;
				}
				else if(a[i]=='c' && a[i+1]=='d')
				{
					sum=sum+cd;
				}
				else if(a[i]=='d' && a[i+1]=='e')
				{
					sum=sum+de;
				}
				else
				{
					System.out.println("No Route Exists");
					return;
				}
		}
		
		System.out.println("Total Distance: "+sum);
		
	}

}
