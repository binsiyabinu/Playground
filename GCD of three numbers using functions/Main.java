import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n1=sc.nextInt();
      int n2=sc.nextInt();
      int n3=sc.nextInt();
      n1=great(n1,n2);
      n1=great(n1,n3);
      System.out.println(n1);
	}
  public static int great(int n1,int n2)
  {
    int min;
   if(n1>n2)
     min=n1;
    else 
      min=n2;
    int flag=0;
    for(int i=min;i>0;i--)
    {
    if(n1%i==0 && n2%i==0)
    {
      flag=i;
      break;
    }
    }
    
    return flag;
  }
}