package CP;

import java.util.*;

public class MahmoudAndTriangle{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        if(n<3)
        {
            System.out.println("NO");
            return;
        }
        int[] arr = new int[n];

        for(int i = 0;i<n;i++)
        {
            arr[i] = scn.nextInt();

        }
        Arrays.sort(arr);





  for(int i = 2;i<n;i++) {
      if (arr[i-1] + arr[i-2] > arr[i]) {
          System.out.println("YES");
          return;
      }

  }

     System.out.println("NO");
}
}