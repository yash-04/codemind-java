import java.util.*;
class Sample{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        int a = s.nextInt();
        int sum=0;
        for(int i=0;i<a;i++){
            sum+=arr[i];
        }
        System.out.print(sum);
    }
}
