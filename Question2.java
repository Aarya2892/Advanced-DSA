import java.util.Scanner;

public class Question2 {
    public static int solve(int n, int q, int[][] cost){
        int totalStreakBonus = n*q;
        int MinimizeTotalPaintingCost = 0;

        for(int i=0; i<n; i++){
            int mincellcost = Math.min(cost[i][0], Math.min(cost[i][1], cost[i][2]));
            MinimizeTotalPaintingCost += mincellcost;
        }
        return MinimizeTotalPaintingCost - totalStreakBonus; 
    }
    public static void main(String args[]){
     Scanner sc= new Scanner(System.in);

     int n = sc.nextInt();
     int q = sc.nextInt();

     int[][] cost = new int[n][3];
     for(int i=0; i<n; i++){
        for(int j=0; j<3; j++){
            cost[i][j] = sc.nextInt();
        }
     }
     int result = solve( n, q, cost);
     System.out.println(result);
     sc.close();
    }
}
