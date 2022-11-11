package CP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Decode {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                if (st != null && st.hasMoreTokens()) {
                    str = st.nextToken("\n");
                } else {
                    str = br.readLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    public static void main(String args[])
    {
        FastReader fr = new FastReader();
    int n = fr.nextInt();
    String s = fr.nextLine();
    int sw = 1;
    if(n%2==0)
    {
        sw  = 0;
    }
    int i = 0;
    String ans = "";
    while(i<s.length())
    {
        if(sw==0)
        {
            ans = s.charAt(i)+ans;
        }
        else {
            ans+=s.charAt(i);
        }
        i++;
        if(sw==0)
        {
            sw= 1;
        }
        else {
            sw = 0;
        }
    }
    System.out.println(ans);
    }

}
