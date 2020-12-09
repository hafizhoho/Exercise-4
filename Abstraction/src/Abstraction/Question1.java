
/* MUHAMMAD HAFIZ BIN SUKHRI   
275414 */

package Abstraction;


abstract class Parent {
	abstract void message();

}

class A extends Parent {
	public void message() {
		System.out.println("This is first subclass");
		
	}
}

class B extends Parent {
	public void message() {
		System.out.println ("This is second subclass");
		
	}
}


public class Question1 {
	public static void main (String []args) {
		A a = new A();
		B b = new B();
		
		a.message();
		b.message();
		
	}
}