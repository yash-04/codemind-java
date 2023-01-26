import java.util.Scanner;
class Sample{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int r=sc.nextInt();
        int o=0;
            for(int i=l;i<=r;i++)                         
            {
                for(int j=i;j<=r;j++){ 
                    int s=0;
                    for(int k=i;k<=j;k++){          
                        s=s+k;
                    }
                    if(s%2==1){
                        o=o+1;
                    }
                }
            }
        System.out.print(o);
    }
}

