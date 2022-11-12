package CP;


import java.util.*;

public class TheUltimateSquare{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-->0)
        {
            long n = scn.nextLong();
//            System.out.println(n/2.0);
            System.out.println(Math.round(n/2.0));
        }
    }
}