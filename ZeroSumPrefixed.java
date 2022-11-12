package CP;
import java.util.*;

public class ZeroSumPrefixed{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int t= scn.nextInt();

        while(t-->0)
        {
            int n = scn.nextInt();
            int[] arr = new int[n];
            int zero = 0;
            boolean flag = true;
            int sum = 0;
            for(int i = 0;i<n;i++)
            {
                arr[i] = scn.nextInt();
                if(arr[i]==0&&flag)
                {
                    zero = i;
                    flag = false;
                }
                sum+=arr[i];
            }
            System.out.println(zero);
            arr[zero] = -sum;
            int newsum =0;
            int count = 0;
            for(int i = 0;i<n;i++)
            {
                newsum+=arr[i];
                if(newsum==0)
                {
                    count++;
                }
            }
            System.out.println(count);

        }
    }
}