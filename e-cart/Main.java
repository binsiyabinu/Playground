//import required packages here
import java.util.Scanner;
class Item
{
  private int price;
  
  //create various method to return attribute value(s)
}
   
class Customer
{
  private String product;
  private int quantity;
  //create various method to return attribute value(s)
}

class Bill
{
  //implement your logic to calculate total price
}
class Main
{
  public static void main(String[] args)
  {
    Item i = new Item();
    Customer c = new Customer();
    Bill obj = new Bill();
    Scanner sc=new Scanner(System.in);
    String pro=sc.nextLine();
    int quan=sc.nextInt();
    int pri=sc.nextInt();
    System.out.println("Total Price is : "+(quan*pri));
    //write the logic here
  }
}