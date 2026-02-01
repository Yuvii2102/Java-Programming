public class HelloWorld
{
    public static void main(String args[])
{

  int originalPrice = 60;
  int Discount = 20;              

  // Apply discount
  int finalPrice = originalPrice - (originalPrice * Discount) / 100;   // You can use either Price or finalPrice

  System.out.println(finalPrice);
  
}
}
