/*
You have n blocks. Blocks i has weight[i], height[i]. Stack then into a single tower each block placed
above another must have a strictly smaller width than the block below it

Example 1:
3
10
20
30
5
15
25
output: 5+15+15 = 45

Exmaple 2:
4
10
10
20
20
5
15
25
5
output: 40
*/

import java.util.*;

class Main{

    static class Block{
        int w,h;

        Block(int w, int h){
            this.w = w;
            this.h = h;
        }
    }
    public static int solve(int n, int[] w, int[] h){
        Block[] blocks = new Block[n];

        for(int i=0; i<n; i++){
            blocks[i] = new Block(w[i], h[i]);
        }

        // sort by width descending order
        Arrays.sort(blocks,(a,b)->{
            if(b.w != a.w) return b.w -a.w;
            return b.h -a.h;
        });
        int totalheight = 0;
        int prevWidth = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            if(blocks[i].w != prevWidth){
                totalheight += blocks[i].h;
                prevWidth = blocks[i].w;
            }
        }
        return totalheight;
    }

    public static void main(String[] arg){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();

        int[] w = new int[n];
        for(int i=0; i<n; i++){
            w[i]= sc.nextInt();
        }

        int[] h = new int[n];
        for(int i=0; i<n; i++){
            h[i]=sc.nextInt();
        }

        int result = solve(n, w, h);
        System.out.println(result);
        sc.close();
    }
}