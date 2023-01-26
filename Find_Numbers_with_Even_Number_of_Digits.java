import java.util.Scanner;
class Sample
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            int d=(int)(Math.log10(a[i])+1);
            if(d%2==0){
                c=c+1;
            }
        }
    System.out.print(c);
    }
}