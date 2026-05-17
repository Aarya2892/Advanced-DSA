import java.util.*;
public class FractionalKnapsack {

    public static int MaxTotalvalue(int n, int w, int val[], int weight[]){
 
        double ratio[][] = new double[val.length][2];
        for(int i=0; i<ratio.length; i++){
            ratio[i][0]= i;
            ratio[i][1]= val[i]/(double)weight[i]; //we have to select max value 
        }

        // Sorting in ascending order
        // we are sorting this ratio on basis of val
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1])); 

        // we have to select high ratio value because it will give us maximum value to store, array is sorted in ascending order
        // so we will apply for loop in descending order

        int capacity = w;
        int FinalVal =0;
        for(int i=ratio.length-1; i>=0; i--){
            int idx = (int)ratio[i][0];
            if(capacity >= weight[idx]){
                FinalVal += val[idx];
                capacity -= weight[idx];
            }else{
                FinalVal += ratio[i][1]*capacity;
                capacity =0;
                break;
            }
        }
      return FinalVal;
    }
    public static void main(String args[]){
       Scanner sc= new Scanner(System.in);
       int n = sc.nextInt();
       int w = sc.nextInt();

       int val[] = new int[n];
       for(int i=0; i<n; i++){
        val[i] = sc.nextInt();
       }
        int weight[] = new int[n];
        for(int i=0; i<n; i++){
            weight[i] = sc.nextInt();
        }
        int ans = MaxTotalvalue(n, w, val, weight);
        System.out.println(ans);
        sc.close();
  
      }  
} 
