package CP;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class KeyboardLayouts{
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
        String a= scn.nextLine();
        String b = scn.nextLine();
        String c = scn.nextLine();
        String ans = "";
        for(int i = 0;i<c.length();i++)
        {
            int ascii = (int) c.charAt(i);
            if(ascii>=48&&ascii<=57)
            {
                ans+=c.charAt(i);
                continue;
            }

            System.out.println((c.charAt(i)+"").toLowerCase());
            int idx = a.indexOf((c.charAt(i)+"").toLowerCase());
            int as = (int)b.charAt(idx);
            if(ascii<=90)
            {
                ans+=((char)as+"").toUpperCase();
                continue;
            }
            ans+=(char)as;
            System.out.println(ans);
        }
        System.out.println(ans);

    }
}