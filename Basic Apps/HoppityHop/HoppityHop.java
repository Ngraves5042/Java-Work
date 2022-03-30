public class HoppityHop
{
   public static void main(String[] args)
   {
      for(int i = 1; i <= 25; i++)
      {
         
            if((i%3) == 0 || (i%5) == 0)
            {
               if(i%3 == 0)
               {
                  System.out.println("Hoppity");
               }
               else
               {
                  System.out.println("Hop");
               }
            }
            
              
            else
            {
               System.out.printf("%d\n", i);
            }
            
      }
   }
}