import java.util.*;
class Sample{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n= s.nextInt(),cnt=0;
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        for(int i=1;i<n-1;i++){
            if(arr[i-1]%2==1 && arr[i+1]%2==1 && arr[i]%2==1){
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}