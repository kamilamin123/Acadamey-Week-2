interface DogInterface{
	void bark();
	void poop();
}
abstract class Dog {
	public void bark() {
		System.out.println("Bark!");
		}
	public abstract void poop();
}
class Chihuahua implements DogInterface {

	@Override
	public void bark() {
		// TODO Auto-generated method stub
		System.out.println("Bark!");
	}

	@Override
	public void poop() {
		// TODO Auto-generated method stub
		System.out.println("chi poop");
	}

}
public class Abstraction {

	public static void main(String[] args) {
		Chihuahua d = new Chihuahua();
		d.bark() ;
		d.poop();
	}


}
