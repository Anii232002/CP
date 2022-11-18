package CP;

import java.util.*;

public class PolycarpAndLetters{

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String s = scn.next();

        HashSet<Character> currset = new HashSet<>();

        int max = 0;
        for(int i = 0;i<n;i++)
        {
            if((Character.isUpperCase(s.charAt(i))))
            {
                max = Math.max(max,currset.size());
                currset = new HashSet<>();
                continue;
            }
            if(!currset.contains(s.charAt(i)))
            {

                currset.add(s.charAt(i));
            }

        }
        max = Math.max(max, currset.size());

        System.out.println(max);
        //polycarp
    }
}