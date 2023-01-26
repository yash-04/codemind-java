import java.util.*;

class Sample {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();
        int cnt=0;
        for(int i=m;i<=n;i++){
            int count=0;
            if(i==1 || i==0){
                continue;
            }
            else{ 
                for(int j=2;j*j<=i;j++){
                    if(i%j==0){
                        count++;
                    }
                }
                
            }
            if(count==0){
                    cnt++;
                }
        }
        System.out.print(cnt);
        
    }
}