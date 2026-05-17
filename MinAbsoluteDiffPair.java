import java.util.*;
public class MinAbsoluteDiffPair {
    public static int MinimumSum(int n, int A[], int B[]){
        // sorting both the Array
        Arrays.sort(A);
        Arrays.sort(B);

        int minsum = 0;
        // for(int i=0; i<n; i++){
        //   if(A[i] >= B[i]){
        //     minsum += A[i] - B[i];
        //   }else{
        //     minsum += B[i] - A[i];
        //   }
        // }

        for(int i=0; i<A.length; i++){
            minsum += Math.abs(A[i] - B[i]);
        }
        return minsum;
    }
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();

      int A[] = new int[n];
      for(int i=0; i<n; i++){
        A[i] = sc.nextInt();
      }

      int B[] = new int[n];
      for(int i=0; i<n; i++){
        B[i] = sc.nextInt();
      }
      int ans = MinimumSum(n, A, B);
      System.out.println(ans);
      sc.close();
     }
}
