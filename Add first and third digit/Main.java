import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int b=(a%10)+(a/100);
      System.out.print(b);
	}
}