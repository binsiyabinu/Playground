import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
      Scanner sc=new Scanner(System.in);
      int num=sc.nextInt();
      // System.out.println(num);
      int b=num;
      for(int i=1;i<num;i++)
      {
         //System.out.println(num);
        b=b*i;
      }
      System.out.println(b);
	}
}