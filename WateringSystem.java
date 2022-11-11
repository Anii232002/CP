package CP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class WateringSystem {
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
        int a = scn.nextInt();
        int b = scn.nextInt();
        int first = scn.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        int tot = first;
        for(int i = 1;i<n;i++)
        {
            int ele = scn.nextInt();
            tot+=ele;
            pq.add(ele);
        }
        int rholes = 0;

        while(pq.size()>0&&((float)(a*first)/(float)tot)<b)
        {
            int removed = pq.remove();
            tot-=removed;

            rholes++;

        }
        System.out.println(rholes);
    }
}
