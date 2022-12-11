package CP;

import java.util.*;

public class Chocolates{

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++)
        {
            arr[i] = scn.nextInt();

        }
        int prev = arr[0];
        int chocolates = 0;
        int ans = Integer.MIN_VALUE;
     int i = 0;
        while(i<n)
        {
            System.out.println(i);
            if(prev<=arr[i])
            {
                System.out.println("One");
                chocolates+=arr[i];
                prev = arr[i]+1;

            }
            else if(arr[i]<prev)
            {
                System.out.println("Three");
                ans = Math.max(ans,chocolates);
                chocolates = 0;
                prev = arr[i-1];
                i = i-1;
            }
            System.out.println(i+"-"+chocolates);
        }

        ans = Math.max(ans,chocolates);
        System.out.println(ans);
    }
}