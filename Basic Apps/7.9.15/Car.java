public class Car
{
   private String model;
   private String owner;
   
   public String getModel()
   {
      return model;
   }

   public String getOwner()
   {
      return owner;
   }

   public void setModel(String newModel)
   {
      model = newModel;
   }
   
   public void setOwner(String newOwner)
   {
      owner = newOwner;
   }
   
   public void drive()
   {
      System.out.print("vroom");
   }
}