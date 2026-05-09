import java.util.Scanner;

public class FindMaximumIn2DArray {
    public static int solve(int n, int[][] array){
        int maxCost = 0;
        for(int i=0; i<n; i++){
            int maxnum = Math.max(array[i][0], Math.max(array[i][1], array[i][2]));
            maxCost +=maxnum;
        }
        return maxCost;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();

        int[][] array = new int[n][3];

        for(int i=0; i<n; i++){
            for(int j=0; j<3; j++){
                array[i][j] = sc.nextInt();
            }
        }
        int result = solve(n, array);
        System.out.println(result);
        sc.close();
    }
}
