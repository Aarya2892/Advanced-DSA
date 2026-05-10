import java.util.Scanner;

public class MSSWithSwap {
    public static int solve(int n, int m, int arr[]){
        for(int i=0; i<n && m>0; i++){
            int small = arr[i];
           for(int j=i+1; j<n; j++){
            if(arr[j] < small){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
           }
        }
        m--;
 
        for(int i=0; i<arr.length; i++){
        System.out.println(" Array element: " + arr[i]);
        }

        int totalSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for(int i=0; i<arr.length; i++){
           int start = i;
           for(int j=i; j<arr.length; j++){
            int end=j;
            currentSum=0;
            for(int k=start; k<=end; k++){
               currentSum += arr[k];
            }
            System.out.println(currentSum);
            if(totalSum < currentSum){
                totalSum = currentSum;
            }
           }
        }
        return totalSum;

    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int arr[] = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int ans = solve(n, m, arr);
        System.out.println(ans);
        sc.close();
    }
}
