import java.util.Scanner;
class Sample{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int f=0;
        if(n%3==0){
            System.out.print("Pling");
            f=1;
        }
        if(n%5==0){
            f=1;
            System.out.print("Plang");
        }
        if(n%7==0){
            f=1;
            System.out.print("Plong");
        }
        if(f==0){
            System.out.print(n);
        }
        
    }
}
