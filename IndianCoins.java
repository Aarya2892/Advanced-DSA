import java.util.*;
public class IndianCoins {
    public static int CoinCount(int Amount, int Coins[]){
       Arrays.sort(Coins);

    //    for(int i=Coins.length-1; i>=0; i--){
    //     System.out.print(Coins[i]+ " ");
    //    }

        int countcoin = 0;
        for(int i=Coins.length-1; i>=0; i--){
            if(Coins[i] <= Amount){
                countcoin++;
                Amount = Amount - Coins[i];
                System.out.println();
            }
        }
        return countcoin;
    }
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       int Amount = sc.nextInt();
       int n = sc.nextInt();

       int Coins[] = new int[n];
       for(int i=0; i<n; i++){
          Coins[i] = sc.nextInt();
       }
       int ans = CoinCount(Amount, Coins);
       System.out.println(ans);
       sc.close();
    }
}
