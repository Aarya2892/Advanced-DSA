import java.util.*;
public class MaxLengthChainPairs{
    public static int MaxLengthofChain(int n, int pairs[][]){
        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));

        // for(int i=0; i<pairs.length; i++){
        //     System.out.println(pairs[i][0] + " , " + pairs[i][1]);
        // }

        int MaxLength =1;
        int chainEnd = pairs[0][1];
        for(int i=1; i<pairs.length; i++){
            if(pairs[i][0] > chainEnd){
                MaxLength++;
                chainEnd = pairs[i][1];
            }
        }
        return MaxLength;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int pairs[][] = new int[n][2];

        for(int i=0; i<n; i++){
           pairs[i][0] = sc.nextInt();
           pairs[i][1] = sc.nextInt();
         } 
         int ans  = MaxLengthofChain(n, pairs);
         System.out.println(ans);
         sc.close();
    }
}