import java.util.Scanner;
class Sample{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k1=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        int c=0;
        for(int i=0;i<n;i++)                          
        {
            for(int j=i;j<n;j++){ 
                int s=0;
                for(int k=i;k<=j;k++){
                s=s+a[k];
                }
                if(s==k1){
                    c=c+1;
                }
            }
        }

    System.out.print(c);
    }
}
