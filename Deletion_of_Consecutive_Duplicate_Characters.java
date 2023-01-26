import java.util.Scanner;
import java.io.*;
class Sample{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            int count=0;
            String s=sc.nextLine();
            char[] ch=s.toCharArray();
            for(int j=0;j<(ch.length)-1;j++){
                if(ch[j]=='A'){
                    if(ch[j+1]=='A'){
                        count++;
                    }
                }
                else{
                    if(ch[j+1]=='B'){
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
