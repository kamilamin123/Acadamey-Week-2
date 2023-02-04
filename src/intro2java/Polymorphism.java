package intro2java;
class Bird {
	public void sing() {
		System.out.println("tweet tweet tweet tweet");
	}
}
class Robin extends Bird {
	public void sing() {
		System.out.println("tweet tweet tweet ");
	}
	
}
class Pelican  extends Bird {
	public void sing() {
		System.out.println("tweet tweet ");
	}
	
}
public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pelican tweeter = new Pelican();
		tweeter.sing();
		Robin tweeter1 = new Robin();
		tweeter1.sing();
		Bird tweeter2 = new Bird();
		tweeter2.sing();

	}

}
