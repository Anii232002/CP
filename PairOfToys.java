package CP;

import java.util.*;

public class PairOfToys{

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        long n = scn.nextLong();
        long m = scn.nextLong();
        long ans = 0;
        if(n>=m)
            n=m-1;
        ans=n-m/2;
        if(ans<=0)
            ans=0;
        System.out.println(ans);

    }
}