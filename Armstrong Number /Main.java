import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner sc=new Scanner(System.in);
      int num=sc.nextInt();
      int c=0,i;
      int n=num;
      double sum=0;
      while(num!=0)
      {
        c++;
        num=num/10;
      }
      num=n;
      while(num!=0)
      {
        double a=Math.pow((num%10),c);
        sum=sum+a;
        num=num/10;
      }
      if(sum==n)
        System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
      
	}
}