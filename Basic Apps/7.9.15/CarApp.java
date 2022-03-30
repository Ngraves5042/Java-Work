public class CarApp
{
   public static void main(String [] args)
   {
      Car myCar = new Car();

      myCar.setModel("Prius");
      
      myCar.setOwner("Ms Summer");
      
      System.out.printf("Model: %s\nOwner: %s\n", myCar.getModel(), myCar.getOwner());
      
      myCar.setOwner("Mr. Smith");
      
      System.out.printf("New owner: %s\n", myCar.getOwner());
      
      myCar.drive();
      
      
   }
   
}
