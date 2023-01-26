import java.util.Scanner;
class Sample{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int da[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        int k=sc.nextInt();
        for(int i=0;i<n;i++){
            int j=(i+k)%n;
            da[j]=a[i];
        }
        for(int i=0;i<n;i++){
            System.out.print(da[i]+" ");
        }
        
    }
}