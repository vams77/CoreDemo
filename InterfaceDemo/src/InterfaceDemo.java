interface Vehicle
   {
// all are the abstract methods.
     void changeGear(int a);
     void speedUp(int a);
     void applyBrakes(int a);
   }
class Bicycle implements Vehicle
    {
       int speed;
       int gear;
// to change gear
@Override
public void changeGear(int newGear)
     {
        gear = newGear;
     }
// to increase speed
@Override
public void speedUp(int increment)
     {
        speed = speed + increment;
     }
// to decrease speed
@Override
public void applyBrakes(int decrement)
     {
        speed = speed - decrement;
     }
public void printStates()
     {
         System.out.println("speed: " + speed
         + " gear: " + gear);
     }
 }
class Bike implements Vehicle
   {
       int speed;
       int gear;
// to change gear
@Override
public void changeGear(int newGear)
     {
        gear = newGear;
     }
// to increase speed
@Override
public void speedUp(int increment)
     {
         speed = speed + increment;
     }
// to decrease speed
@Override
public void applyBrakes(int decrement)
     {
        speed = speed - decrement;
     }
public void printStates()
     {
         System.out.println("speed: " + speed
         + " gear: " + gear);
     }
  }
class InterfaceDemo
   {
       public static void main (String[] args)
         {
// creating an instance of Bicycle doing some operations
           Bicycle bicycle = new Bicycle();
           bicycle.changeGear(2);
           bicycle.speedUp(3);
           bicycle.applyBrakes(1);
           System.out.println(" present state of bicycle  :");
           bicycle.printStates();
// creating instance of bike.
           Bike bike = new Bike();
           bike.changeGear(1);
           bike.speedUp(4);
           bike.applyBrakes(3);
           System.out.println(" present state of bike :");
           bike.printStates();
       }
  }