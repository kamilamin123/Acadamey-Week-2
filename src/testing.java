import java.util.ArrayList;
import java.util.List;
/*
 * Is a contract that must be accomplished by a class.
 */
interface MyInterface {
	
	// Declaration of the method - Signature of the Method.
	public abstract void myMethod(); // Abstract Method because it doesn’t have a body (definition)
	
	// Java 8
	default int myNewMethod() {
		int a = 2;
		int b = 3;
		MyInterface.myNewMethod2();
		return a + b;
	};
	static int myNewMethod2() {
		int a = 2;
		int b = 3;
		
		return a + b;
	};
}
class MyClass implements MyInterface{
	// Java Annotation - Metadata: additional information that describes the information
	@Override
	public void myMethod() {
    System.out.println("This is myMethod()");		
	}
	
  void myClassMethod() {
		System.out.println("This is myClassMethod()");
	}
}
public class testing {
	public static void main(String[] args) {
		MyClass objA = new MyClass();
		
		objA.myMethod();
		objA.myClassMethod();
		objA.myNewMethod();
		
		int a = objA.myNewMethod();
    System.out.println(a);
		
		MyInterface objB = new MyClass();
		
		objB.myMethod();
		//objB.myClassMethod();
		int b = objB.myNewMethod();
	    System.out.println(b);
		
		((MyClass)objB).myClassMethod();
		//objC.myClassMethod();
		
		System.out.println(objB);
		
		
	}
}