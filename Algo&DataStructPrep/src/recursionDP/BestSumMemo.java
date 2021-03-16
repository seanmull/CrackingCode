package recursionDP;

import java.util.Arrays;
import java.util.HashMap;

public class BestSumMemo {

public static HashMap<Integer,int[]> memo = new HashMap<>();
	
	public static void main(String[] args){
	        System.out.println(Arrays.toString(bestSum(7, new int[]{2,1,3})));
	 }
	
	public static int[] bestSum(int n, int[] arr){
	      if(memo.containsKey(n)){
	            //System.out.printf("From memo: %d->"+ Arrays.toString(memo.get(n)) +"%n",n);
	            return memo.get(n);
	        }

	        if(n==0)return new int[0];

	        if(n<0)return null;

	        int[] minn = null;

	        for(int i = 0;i<arr.length;i++){
	            
	            //recursion
	            int[] temp = bestSum(n-arr[i],arr);

	            if(temp!=null){

	                // ttemp is used to add arr[i] to the initial arr <<temp>>
	                int[] ttemp = new int[temp.length+1];
	                System.arraycopy(temp,0,ttemp,0,temp.length);
	                ttemp[temp.length] = arr[i];
	                temp = ttemp;

	                if(minn==null||temp.length<minn.length){
	                    minn = temp;
	                }
	            }
	        }
	        //System.out.println(n+": "+minn);
	        memo.put(n,minn);
	        //System.out.println(memo.get(n));
	        return minn;
	    } 

}


