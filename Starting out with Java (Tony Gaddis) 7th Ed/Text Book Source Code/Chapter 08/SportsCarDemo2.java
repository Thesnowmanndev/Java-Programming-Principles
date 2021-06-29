/**
   This program shows that you can switch on an
   enumerated type.
*/

public class SportsCarDemo2
{
   public static void main(String[] args)
   {
      // Create a SportsCar object.
      SportsCar yourNewCar = new SportsCar(CarType.PORSCHE, 
                                    CarColor.RED, 100000);

      // Get the car make and switch on it.
      switch (yourNewCar.getMake())
      {
         case PORSCHE :
            System.out.println("Your car was made in Germany.");
            break;
         case FERRARI :
            System.out.println("Your car was made in Italy.");
            break;
         case JAGUAR :
            System.out.println("Your car was made in England.");
            break;
         default:
            System.out.println("I'm not sure where that car " +
                               "was made.");
      }
   }
}