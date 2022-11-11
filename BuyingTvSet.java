package CP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BuyingTvSet {

    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        long a = scn.nextInt();
        long b = scn.nextInt();
        long x = scn.nextInt();
        long y = scn.nextInt();
        long count = 0;
        while(x%2==0&&y%2==0)
        {
            x/=2;
            y/=2;
        }
        long ogx = x;
        long ogy = y;
        while(x<a&&y<=b)
        {
            x+=ogx;
            y+=ogy;
            count++;
        }
        System.out.println(count);

    }
}
