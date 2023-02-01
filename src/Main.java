class Vehicle {
	String color;
	String brand;
   // Fill in the code below


   Vehicle() {
       this("Black", "Tesla");
   }
   Vehicle(String color, String brand) {
       this.color= color;
       this.brand= brand;
   }

   // Fill in the code
}

class Car extends Vehicle {
   String steeringWheel;
   
   Car(String color, String brand, String steeringWheel){
	   super(color,brand);
	   this.steeringWheel= steeringWheel;
   }

   // Fill in the code

}

class Bike extends Vehicle {
   String bikeHandle;

   public Bike(String colour, String brand, String bikeHandle) {
       super(colour, brand);
       this.bikeHandle = bikeHandle;
   }

}
public class Main {

   public static void main(String args[]) {
       Car car = new Car("White", "Audi", "Chromecoloured");
       Bike bike = new Bike("Grey", "BMW", "Silvercoloured");
       System.out.println(car.color + " " + car.brand + " " + car.steeringWheel);
       System.out.println(bike.color + " " + bike.brand + " " + bike.bikeHandle);

   }
}