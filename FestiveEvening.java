package CP;

import java.util.*;

public class FestiveEvening{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        String s = scn.next();
        HashMap<Character,Integer> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();

        for(int i = 0;i<n;i++)
        {
            int x = map.getOrDefault(s.charAt(i), 0);
            map.put(s.charAt(i),x+1);

        }
        System.out.println(map);
        for(int i = 0;i<n;i++)
        {
            if(!set.contains(s.charAt(i)))
            {
                set.add(s.charAt(i));
                k--;

            }

                map.put(s.charAt(i),map.get(s.charAt(i))-1);


            System.out.println(i+" - "+k+" - "+"-"+map);

            if(k<0)
            {
                System.out.println("YES");
                return;
            }
            if(map.get(s.charAt(i))==0)
            {
                k++;
            }
        }
        System.out.println("NO");

    }
}