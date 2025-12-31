class Vehicle
{
void drive()
{
System.out.println("vehicle is moving.");
}
}
class Car extends Vehicle
{
void drive()
{
System.out.println("car is running on petrol.");
}
}
class ElectricCar extends Car{
void drive()
{
super.drive();
System.out.println("electric car runs sliently on battery.");
}
}
public class Inherit
{
public static void main(String[] args)
{
ElectricCar e=new ElectricCar();
e.drive();
}
}