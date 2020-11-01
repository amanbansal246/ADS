package ads.queue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class K_LargestElement_In_Des_Order {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt(); //test case
		while(t-- !=0)
		{
			int n=sc.nextInt(); //array size
			int k=sc.nextInt(); //k element 
			int a[]=new int[n];
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt(); //insertion in array
			}
			
			PriorityQueue<Integer> pq=new PriorityQueue<>();
			for(int i=0;i<n;i++) {
				if(i<k-1) { //k-1 because i start form 0 ..if we want k=3 then k=3-1 and i=0,1,2
					pq.add(a[i]);
				}else {
					if(pq.peek()<a[i])
						pq.poll();
						pq.add(a[i]);
				}
			}
			ArrayList<Integer> ans=new ArrayList<>(pq);
			Collections.sort(ans,Collections.reverseOrder());
			for(int x:ans) {
				System.out.println(x+" ");
				
			}
			System.out.println();
		}
		sc.close();
	}

}
