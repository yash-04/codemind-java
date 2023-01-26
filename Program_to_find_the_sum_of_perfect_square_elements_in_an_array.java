import java.util.Scanner;
class Sample{
    static Boolean square(int e){
        for(int i=1;i<=e;i++){
            if(i*i==e){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=0;
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(square(a[i])){
                s=s+a[i];
            }
        }
        System.out.print(s);
    }
}
