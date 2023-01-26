import java.util.Scanner;
class Sample{
    static String Title(int n) 
    {
        StringBuilder ans= new StringBuilder();
        while(n>0)
        {
            --n;
            int d= n%26;
            n/=26;
            ans.append((char)('A'+d));            
        }
        ans.reverse();
        return ans.toString(); 
    }
    public static void main(String args[])
    {      
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(Title(n)) ;
    }
}