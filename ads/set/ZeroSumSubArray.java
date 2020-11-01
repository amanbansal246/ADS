package ads.set;

import java.util.HashSet;
import java.util.Set;

public class ZeroSumSubArray {

	public static void main(String[] args) {
		int[] a= {2,1,3,4,-2};
		int sum=0;
		boolean found=false;
		Set<Integer> st=new HashSet<>();
		for(int i:a) {
			sum+=i;
			st.add(sum);
			if(st.contains(sum)) {
				found=true;
				break;
			}
		}
		if(found==true)
				System.out.println("True");
		else
			System.out.println("False");
	}

}
