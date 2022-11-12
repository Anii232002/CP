package CP;

import java.util.*;
public class WierdRounding{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int n = scn.nextInt();
        int ten = (int)Math.pow(10,n);
        String s = String.valueOf(num);
        int count = 0;
        StringBuilder sb = new StringBuilder(s);
        int j = sb.length()-1;
        if(num>=ten)
        {
            while(j>=0&&Integer.valueOf(sb.toString())%ten!=0)
            {
                if(sb.charAt(j)!='0')
                {
                    sb.deleteCharAt(j);

                    count++;
                }

                j--;

            }
            if(Integer.valueOf(sb.toString())==0)
            {
                System.out.println(s.length()-1);
            }
            else {
                System.out.println(count);
            }

        }
        else
        {
            System.out.println(s.length()-1);
        }
    }
}