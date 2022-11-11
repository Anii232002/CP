package CP;
import java.util.*;
public class NouuoAndChess{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);


        int n = scn.nextInt();
        int k = n;
        System.out.println((n+2)/2);
        System.out.println((k+2)/2);
        for(int i = 1;i<=(k+2)/2;i++)
        {

            System.out.println("1 "+i);
            n--;

        }
        int j = 1;
        while(n!=0)
        {
            System.out.println(j+++" "+(k+2)/2);
            n--;

        }

    }
}