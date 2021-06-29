/**
   This program demonstrates the Car and Truck
   classes by using their fully-qualified names
   instead of an import statement.
*/

public class CarTruckDemo2
{
   public static void main(String[] args)
   {
      vehicles.Car roadster =
                 new vehicles.Car(2, 155);
      vehicles.Truck pickUp =
                 new vehicles.Truck(18, 2);

      System.out.println("Here's information " +
                               "about the car:");
      System.out.println(roadster);
      System.out.println();
      System.out.println("Here's information " +
                             "about the truck:");
      System.out.println(pickUp);
   }
}