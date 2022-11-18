package CP;

import java.util.*;

class HamstersFarm{

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        long mod = (long)Math.pow(10,9)+7;
        long n = scn.nextLong();
        long k = scn.nextLong();
        n = n%mod;
        k = k%mod;
        long boxid = 1;
//        long boxcap = Integer.MAX_VALUE;
//        long noofbox = 0;
        int small = Integer.MAX_VALUE;
        for(long i = 1;i<=k;i++)
        {
            int box = scn.nextInt();

//            if(n%box<boxcap)
//            {
//                boxid = i;
//                boxcap = n%box;
//                noofbox = n/box;
//            }
            if(n%box==0)
            {
                small = box;
                boxid = i;
                break;
            }
            if(box<small)
            {
                small = box;
                boxid = i;
            }



        }
        System.out.println(boxid%mod+" "+n/small);
    }
}