package one_way_route_distance_finder;

import java.util.ArrayList;
import java.util.Scanner;

public class Highest_Score {
	
	
	public static int processScores(int scores)
	{
		int res=-1;
		
		if(scores%2==0)
		{
			res=Math.max(res, 0);
		}
		
		if(scores%2!=0)
		{
			res=Math.max(res, 1);
		}
		
		if(scores%8==0)
		{
			res=Math.max(res, 2);
		}
		
		if(scores%10==3)
		{
			res=Math.max(res, 3);
		}
		
		if(scores%9==0)
		{
			res=Math.max(res, 4);
		}
		
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> ns=new ArrayList<>();
		ArrayList<Integer> ms=new ArrayList<>();
		
		
		System.out.print("Enter the Scores: ");
		while(true)
		{
			int scores=sc.nextInt();
			
			if(scores<0)
			{
				break;
			}
			ns.add(scores);
			
			ms.add(processScores(scores));
		}
		
		for(int a:ns)
		{
			System.out.print(a+" ");
		}
		for(int a:ms)
		{
			System.out.print(a+" ");
		}

	}

}
