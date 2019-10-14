import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        //Try your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      switch(n)
      {
        case 1:
          {
            int s=sc.nextInt();
            int a=s*s;
            System.out.println(a);
          }break;
          case 2:
          {
            int l=sc.nextInt();
             int b=sc.nextInt();
            int a=l*b;
            System.out.println(a);
          }break;
          case 3:
          {
            int l=sc.nextInt();
             int b=sc.nextInt();
            int a=(l*b)/2;
            System.out.println(a);
          }break;
          case 4:
          {
            double r=sc.nextInt();
            double pi=3.14;
           double a=pi*r*r;
            System.out.println(a);
          }break;
        default:System.out.println("Invalid input");
      }
    }
}