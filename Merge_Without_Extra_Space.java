import java.util.Scanner;
import java.io.*;
import java.util.Arrays;
class Sample{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
        for(int i=1;i<=tc;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
           // System.out.println(a+" "+b);
            int a1[]=new int[a+b];
            for(int k=0;k<(a+b);k++){
                a1[k]=sc.nextInt();
            }
            Arrays.sort(a1);
            for(int j=0;j<(a+b);j++){
                if(j==(a+b)-1)
                System.out.print(a1[j]);
                else
                System.out.print(a1[j]+" ");
            }
            System.out.print("
");
        }
    }
}



