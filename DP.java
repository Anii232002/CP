package CP;
import java.util.* ;
import java.io.*;
import java.util.*;
public class DP {


        public static void main(String[] args)
        {
            ArrayList<Integer> a = new ArrayList<>();
            a.add(2);
            a.add(1);
            a.add(4);
            a.add(9);
            System.out.println(maximumNonAdjacentSum(a));
        }
        public static int maximumNonAdjacentSum(ArrayList<Integer> nums) {
            int dp[] = new int[nums.size()];
            return recurse(0,nums,dp);
        }
        public static int recurse(int i,ArrayList<Integer> nums,int[] dp)
        {

            if(i>nums.size()-1)
            {
                return 0;
            }
//            System.out.println(i +"-"+ dp[i]);
            if(dp[i]!=0)
            {
                return dp[i];
            }
            int in = recurse(i+2,nums,dp)+nums.get(i);
            int out = recurse(i+1,nums,dp);
            dp[i] = Math.max(in,out);

            return dp[i];

        }

}
