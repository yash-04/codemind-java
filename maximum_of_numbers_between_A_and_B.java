import java.util.*;
class Sample {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        int max=0;
        int a=s.nextInt();
        int b=s.nextInt();
        for(int i:arr){
            if(i>=a && i<=b){
                if(i>max){
                    max=i;
                }
            }
        }
        if(max==0){
            System.out.print(-1);
        }
        else{
            System.out.print(max);
        }
    }
}

