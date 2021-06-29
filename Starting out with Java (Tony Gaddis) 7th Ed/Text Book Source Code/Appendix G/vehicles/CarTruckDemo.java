import vehicles.*;

/**
   This program demonstrates the Car and Truck
   classes which are part of the vehicles package.
*/

public class CarTruckDemo
{
   public static void main(String[] args)
   {
      Car roadster = new Car(2, 155);
      Truck pickUp = new Truck(18, 2);

      System.out.println("Here's information " +
                               "about the car:");
      System.out.println(roadster);
      System.out.println();
      System.out.println("Here's information " +
                             "about the truck:");
      System.out.println(pickUp);
   }
}