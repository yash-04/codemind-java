import java.util.*;
class Sample {
   public static void main(String[] args) {
      int x,y;
      Scanner s=new Scanner(System.in);
      x=s.nextInt();
      y=s.nextInt();
      if(x>0 && (x+2*y)%2==0)
      {
         System.out.println("YES");
      }
      else if((x+2*y)%4==0)
      {
         System.out.println("YES");
      }
      else 
      {
          System.out.println("NO");
      }
   }
}



