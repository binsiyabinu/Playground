import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
       Scanner sc=new Scanner(System.in);
      int num=sc.nextInt();
      int n=num,sum=0;
      while(n!=0)
      {
      int b=n%10;
      for(int i=1;i<n%10;i++)
      {
        b=b*i;
      }
        sum=sum+b;
        n=n/10;
      }
      //System.out.println(b);
      if(sum==num)
        System.out.println("Yes");
      else
        System.out.println("No");
	}
}