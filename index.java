
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {
        //your code h
		Scanner sc =new  Scanner(System.in);
                        int n=sc.nextInt();
		int k=sc.nextInt();
               int  arr[]=new int[n];
                for(int i=0;i<n;i++)
                { arr[i]=sc.nextInt();
                  }
		int si=0;
		int hi=n-1;
		while(si<hi)
			{
				int mid=(hi+si)/2;
				if(arr[mid-1]<k && arr[mid+1]>k)
				{
					System.out.print(mid);
					return ;
				}
				else if(arr[mid]<k)
				{
					si=mid+1;
				}
				else
				{
					hi=mid-1;
				}
			}
	System.out.print("-1");
    }
}
