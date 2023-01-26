import java.util.Scanner;
class Sample{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int c=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            if(a[i]==0){
                c=c+1;
            }
        }
        for(int i=0;i<n;i++){
            if(i<c){
                a[i]=0;
                System.out.print(a[i]+" ");
            }
            else{
                a[i]=1;
                System.out.print(a[i]+" ");
            }
        }
        
    }
}
