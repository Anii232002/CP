package CP;


import java.util.*;

public class DiverseSubstrings{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();

        while(t-->0)
        {
            int n = scn.nextInt();
            String s = scn.next();
            int count = 0;

            for(int i = 0; i < n; i++)
            {
                StringBuilder sb = new StringBuilder();
                int tempindex = 0;

                for(int j = i; j < n; j++)
                {
                    sb.append(s.charAt(j));

                    boolean bool = check(sb.toString());
//                    System.out.println(sb.toString()+"-"+bool);
//                    if(!bool)
//                    {
//                        break;
//                    }
                    if(bool)
                    {
                        count++;
                    }

                }
            }
            System.out.println(count);
        }
    }
    public static boolean check(String temp)
    {
        int distinct = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0;i<temp.length();i++)
        {
            if(!map.containsKey(temp.charAt(i)))
            {
                map.put(temp.charAt(i),0);
                distinct++;
            }
            map.put(temp.charAt(i),map.get(temp.charAt(i))+1);
            if(map.get(temp.charAt(i))>distinct)
            {
                return false;
            }
        }
//        System.out.println(distinct);
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if(entry.getValue()>distinct)
            {
                return false;
            }
        }

        return true;
    }
}