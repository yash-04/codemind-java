import java.util.Scanner;
class Sample{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int count=0;
        int min=0;
        for(int i=0;i<n;i++){
            if(a[i]==1){
                count++;
                if(i==(n-1)){
                    if(count>min){
                        min=count;
                    }
                }
            }
            else{
                if(count>min){
                    min=count;
                    count=0;
                }
            }
        }
        System.out.print(min);
    }
}