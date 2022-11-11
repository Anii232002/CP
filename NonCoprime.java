package CP;

import java.util.*;
public class NonCoprime{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int tot = (n*(n+1))/2;
        int mem = 1;
        for(int i = 2;i<=n;i++)
        {
            if((tot-i)%i==0)
            {
                mem = i;
                break;
            }
        }
        if(mem==1)
        {
            System.out.println("No");
            return;
        }
        System.out.println("YES");
        System.out.println("1 "+mem);
        System.out.print(n-1+" ");
        for(int i = 1;i<=n;i++)
        {
            if(i!=mem)
            {
                System.out.print(i+ " ");
            }

        }

    }
}