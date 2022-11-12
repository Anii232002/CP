package CP;

import java.util.*;
public class SportsMafia{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int moves = scn.nextInt();
        int avail = scn.nextInt();

        int poss = (moves*(moves+1))/2;

        if(poss==avail)
        {
            System.out.println(0);
            return;
        }



        int count = 0;

        System.out.println(count);

    }
}