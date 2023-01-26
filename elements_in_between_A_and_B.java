import java.util.*;
class Sample{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        int a= s.nextInt();
        int b= s.nextInt();
        int cnt=0;
        for(int i:arr){
            if(i>=a && i<=b){
                System.out.print(i + " ");
                cnt++;
            }
        }
        if(cnt==0){
            System.out.print(-1);
        }
        
    }
}