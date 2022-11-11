package CP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.StringTokenizer;

public class TheFestiveEvening {
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
        int g = scn.nextInt();
        String s = scn.nextLine();
        HashMap<Character , ArrayList<Integer>> map = new HashMap<>();
        for(int i = 0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(!map.containsKey(c))
            {
                ArrayList<Integer> a = new ArrayList<>();
                a.add(i);
                map.put(c,a);
            }
            else {
                ArrayList<Integer> a = map.get(c);
                a.add(i);
                map.put(c,a);
            }
        }
        HashSet<Character> set = new HashSet<>();
//        Enumeration e = keyset.nextElement();
        char currentchar = s.charAt(0);
        int currentguard = 0;
        boolean flag = true;
//        System.out.println(map);
        for(int i = 0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(c!=currentchar)
            {
                if(map.get(currentchar).size()>0)
                {

                    if(currentguard==g)
                    {

                        flag = false;
                        break;
                    }
                    else {
                        System.out.println(map);
                        currentguard++;
                        set.add(c);
                    }
                }
                else {
                    currentguard--;
                }
                currentchar = c;
            }
            else {
                System.out.println("Else"+map);
//                map.get(c).remove(0);
                currentchar = c;
                set.add(c);

                map.get(c).remove(0);
                if(map.get(c).size()==0)
                {
                    if(i<s.length()-1)
                    {
                        currentchar = s.charAt(i+1);
                    }

                }
            }


        }
        if(flag)
        {
            System.out.println("NO");

        }
        else {
            System.out.println("YES");
        }
    }
}
