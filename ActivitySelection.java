import java.util.Scanner;

public class ActivitySelection {
    static class Acivity{
        int start, end;
        Acivity(int start, int end){
            this.start = start;
            this.end = end;
        }
    }
    public static int MaxTotalNumberActivity(int n, int start[], int end[]){
        Acivity acivity[] = new Acivity[n];

        for(int i=0; i<n; i++){
            acivity[i] = new Acivity(start[i], end[i]);
        }

        int MaxTotal = 0;
        int last = acivity[0].end;
            
        for(int i=0; i<acivity.length; i++){
            if(acivity[i].end >0 && i==0){
                MaxTotal++;
            } else if(acivity[i].start >= last){
                MaxTotal++;
                last = acivity[i].end;
            }
        }return MaxTotal;
    }
    public static void main(String arg[]){
         Scanner sc= new Scanner(System.in);
         int n = sc.nextInt();

    int start[] = new int[n];
    for(int i=0; i<n; i++){
        start[i] = sc.nextInt();
    }

    int end[] = new int[n];
    for(int i=0; i<n; i++){
        end[i] = sc.nextInt();
    }
    int ans = MaxTotalNumberActivity(n, start, end);
    System.out.println(ans);
    sc.close();
}
}
