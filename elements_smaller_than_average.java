import java.util.*;
class Sample{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        int sum=0;
        for(int i:arr){
            sum+=i;
        }
        double avg = sum/n;
        int cnt=0;
        for(int i:arr){
            if(i<=avg){
                cnt++;
            }
        } 
        System.out.print(cnt);
    }
}

