import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   //Type your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=1;i<=n;i++)
    {
      if(i%3==0)
        System.out.print(i+",");
      else
        System.out.print(i);
    }
  }
}