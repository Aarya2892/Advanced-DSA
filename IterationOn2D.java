import java.util.Scanner;

public class IterationOn2D {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] value = new int[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                value[i][j] = sc.nextInt();
            }
        }
        System.out.println("Array elements are");
        for(int i=0; i<n; i++){
           for(int j=0; j<n; j++){
            System.out.println(value[i][j]);
           }
        }
        sc.close();
    }
}
