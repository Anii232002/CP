package CP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MisloveHasAnArray {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() { return Integer.parseInt(next()); }

        long nextLong() { return Long.parseLong(next()); }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try {
                if(st!=null&&st.hasMoreTokens()){
                    str = st.nextToken("\n");
                }
                else{
                    str = br.readLine();
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    public static void main(String[] args)
    {
        FastReader scn = new FastReader();
        int n = scn.nextInt();
        int l = scn.nextInt();
        int r = scn.nextInt();

        int max = 0;
        int distinct = 1;
        int number = 1;
        int i = 0;
        int min = 0;
        while(distinct<=r)
        {
            if(distinct<=l)
            {
                min+=number;
                System.out.println(number+"-"+min);
            }
            i++;

            max+=number;
            number*=2;
            distinct++;
        }


      if(n>r)
      {
          max+=(number/2)*(n-r);
      }
     if(n>l)
     {
        min+=(n-l);
     }

        System.out.println(min);

        System.out.println(max);
    }
}
