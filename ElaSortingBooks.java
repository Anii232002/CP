package CP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class ElaSortingBooks {
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
    public static void main(String[] args)
    {
        FastReader scn = new FastReader();
        int t = scn.nextInt();
        while(t-->0)
        {
            int n = scn.nextInt();
            int k = scn.nextInt();

            int times = k;
            int books = n/k;
            String s = scn.nextLine();
            HashMap<Character,Integer> map = new HashMap<>();
            ArrayList<Character> list = new ArrayList<>();
            for(int i = 0;i<s.length();i++)
            {
                char c= s.charAt(i);
                if(!map.containsKey(c))
                {
                    map.put(c,0);
                }
                map.put(c,map.get(c)+1);
                if(!list.contains(c))
                {
                    list.add(c);
                }
            }
            Collections.sort(list);
            String ans ="";
            while(times-->0)
            {
                for(int i = list.size()-1;i>=0;i--)
                {
                    if(map.get(list.get(i))>0)
                    {
                        map.put(list.get(i),map.get(list.get(i))-1);
                    }
                }
            }



        }
    }

}
