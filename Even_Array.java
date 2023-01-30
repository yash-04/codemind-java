import java.util.*;
class Sample{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        int cnt=0;
        for(int i:arr){
            if(i%2==0){
                cnt++;
            }
        }
        if(cnt==n){
            System.out.print("True");
        }else{
            System.out.print("False");
        }
        
    }
}