package CP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FafaAndGates {
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
        String s = scn.nextLine();
        int state = 0;
        int count =0;
        int coins = 0;
        if(s.charAt(0)=='U')
        {
            state = 1;
            count = 1;
        }
        else {
            state = 0;
            count = -1;
        }
        for(int i = 1;i<n;i++)
        {
            if(s.charAt(i)=='U')
            {
                count++;
            }
            else {
                count--;
            }
            if(state==0&&count>0)
            {

                coins++;
                state = 1;
            }
            else if(state ==1 &&count<0)
            {
                coins++;
                state = 0;
            }
        }
        System.out.println(coins);
    }
}
