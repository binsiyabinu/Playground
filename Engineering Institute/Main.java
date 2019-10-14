//import required packages
import java.util.Scanner;
class Faculty
{
  public void salary(int sal)
  {
    System.out.println("Base Salary: "+sal);
    //write your Faculty class statements
  }
}
class CSE
{
  public void salary(int sal)
  {
    System.out.println("CSE Faculty: "+(sal+3000));
    //write your CSE class statements
  }
}
class IT
{
  public void salary(int sal)
  {
    System.out.println("IT Faculty: "+(sal+5000));
    //write your IT class statements
  }
}
class ECE
{
  public void salary(int sal)
  {
    System.out.println("ECE Faculty: "+(sal+4500));
    //write your ECE class statements
  }
}

class Main
{
  public static void main(String[] args)
  {
    Scanner sc= new Scanner(System.in);
    int sal=sc.nextInt();
    Faculty f1=new Faculty();
    f1.salary(sal);
    CSE c1=new CSE();
    c1.salary(sal);
    IT i1=new IT();
    i1.salary(sal);
    ECE obj = new ECE();
    obj.salary(sal);
    //implement your required concept here
  }
}