import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      String str1=sc.nextLine();
     String str2=sc.nextLine();
      String replaceString=str1.replace(str1,str2);
//System.out.println(replaceString); 
      String str=replaceString;
      String[] words=str.split("\\s"); 
for(String w:words){  
System.out.println(w);  }
      //Try your code here
    }
}