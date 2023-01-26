import java.util.Scanner;
class Sample
{
    public char ret(char i)
    {
        int k=(int)i;
        int j=64+k;
        char c=(char)j;
        return c;
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                Sample obj=new Sample();
                char r1=obj.ret((char)i);
                System.out.print(r1+" ");
            }
            System.out.println();
        }        
    }
}