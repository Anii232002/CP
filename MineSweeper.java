package CP;

import java.util.*;
public class MineSweeper{
    public static int[][] dirs = {{0,1},{1,0},{0,-1},{-1,0},{1,1},{-1,-1},{-1,1},{1,-1}};
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        int n = scn.nextInt();
        int[][] grid = new int[m][n];


        for (int i = 0; i < m; i++) {
            String data = "";
            if (scn.hasNext()) { // input from user
                data = scn.next();
            } else {
                break;
            }
            for (int j = 0; j < n; j++)
            {
                char k = data.charAt(j);
                if(k=='*')
                {
                    grid[i][j] = -2;
                }
                else if(k=='.')
                {
                    grid[i][j] = 0;
                }
                else
                {
                    grid[i][j] = Integer.parseInt(k+"");
                }

            }
        }


        for(int i = 0;i<m;i++)
        {
            for(int j = 0;j<n;j++)
            {
                if(grid[i][j] == -2)
                {
//                    System.out.println("Call fn");
                    if(!markpresence(grid,i,j))
                    {
                        System.out.println("NO");
                        return;
                    }
                }
            }
        }
        for(int i = 0;i<m;i++)
        {
            System.out.println();
            for(int j = 0;j<n;j++)
            {
//                System.out.print(grid[i][j]+" ");
                if(grid[i][j]!=-2&&grid[i][j] !=0)
                {

                        System.out.println("NO");
                        return;

                }
            }
        }
        System.out.println("YES");
    }
    public static boolean markpresence(int[][] grid,int i,int j)
    {
        for(int k = 0;k<dirs.length;k++)
        {
            int x = i+dirs[k][0];
            int y = j+dirs[k][1];
//            System.out.println("dirs"+ x+"-"+y);
            if(x<0||x>grid.length-1||y<0||y>grid[0].length-1)
            {
                continue;
            }

            if(grid[x][y]==-2)
            {
                continue;
            }
            grid[x][y]--;
            if(grid[x][y]==-1)
            {
                return false;
            }
        }
        return true;
    }
}