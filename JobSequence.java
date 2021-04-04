
import java.util.*;
public class JobSequence {
	public static void main(String[] args)
	{   

         Scanner sc=new Scanner(System.in);
         System.out.println("enter no. of employee");
         int x=sc.nextInt();
         int profit[] = new int[x];
         int deadlines[]=new int[x];
         System.out.println("enter profit");
         for(int i=0;i<profit.length;i++)
         {
            profit[i]=sc.nextInt();
         }
         System.out.println("enter deadlines");
         for(int i=0;i<profit.length;i++)
         {
            deadlines[i]=sc.nextInt();
         }

		// int[] profit = {35,30,25,20,15,12,5};
		// int[] deadlines= {3,4,4,2,3,1,2};  
		int temp=Integer.MIN_VALUE;
		for(int i=0;i<deadlines.length;i++)
		{
 			if(deadlines[i]>temp)
			{
				temp=deadlines[i];
			}
		}
		int[] ratio = new int[temp];
		for(int i=0;i<ratio.length;i++)
		{
			ratio[i]=-1;
		}
		for(int i=0 ; i<deadlines.length ;i++)
		{
			for(int j=deadlines[i]-1;j>=0;j--)
			{
				if(ratio[j]==-1)
				{
					ratio[j]=i;
					break;
				}
			}
			
		}
		int sum=0;
		for(int i=0;i<ratio.length-1;i++)
		{
			sum=sum+profit[ratio[i]];

		}
		System.out.println(" Total Profit = " +sum);
				
	}

}