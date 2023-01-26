import java.util.*;
class Sample {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        if(n%2==1)
        {
        for(int i=0;i<n/2;i++){
            System.out.print(arr[i]  +" " + arr[(n-1)-i] +" ");
        }
        System.out.print(arr[(n)/2] + " " + 0);
        }
        else{
            for(int i=0;i<n/2;i++){
            System.out.print(arr[i]  +" " + arr[(n-1)-i] +" ");
        }
        }
        
    }
}
