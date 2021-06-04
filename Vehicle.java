package Java;

// Parent Class
public class Vehicle {
    protected String brand = "Ford";
  public void honk() {
    System.out.println("Tuut, tuut!");
  }
    
}
// Child Class, see how it inherits from Parent using 'extends'
class Car extends Vehicle {
    private String modelName = "Mustang";
    public static void main(String[] args) {   //Entry Point of Java Program

     // Creating a new Object 'myFastCar' from the 'Car' class
      Car myFastCar = new Car();   
    
      //New myFastCar object calling a 'Method' 'Honk'
      myFastCar.honk();

      // Printing out to the screen the 'New myFastCar object calling a 'Method' 'brand', and also variable 'modelName'
      System.out.println(myFastCar.brand + " " + myFastCar.modelName);
    }
  }
  