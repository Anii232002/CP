package CP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//STRING BUILDER i.e s.append >>>>>>> S+="A"
//STRING BUILDER = 186 ms || s+= --> 1000 TLE!!
public class threePalindrome {
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
        if(n==1)
        {
            System.out.println("a");
            return;
        }
        else if(n==2)
        {
            System.out.println("ab");
            return;
        }
        StringBuilder s = new StringBuilder("ab");
        int j = 0;
        for(int i = 2;i<n;i++)
        {
            if(s.charAt(j)=='a')
            {
                s.append("b");
            }
            else {
                s.append("a");
            }
            j++;
        }
        System.out.println(s);
    }
}
