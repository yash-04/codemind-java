import java.util.*;
class mun{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        int m=s.nextInt();
        int N=s.nextInt();
         int min=N;
        for(int j=0;j<n;j++){
            if(a[j]>=m&&a[j]<=N){
                if(a[j]<min){
                    min=a[j];
                }
            }
        }
        if(min==N){
            System.out.print(-1);
        }
        else{
        System.out.print(min);
        }
    }
}
