package C7_Object2;

public class DefaultMethodTest {
	public static void main(String[] args) {
		Ch c = new Ch();
		c.method1();
		c.method2();
		MyInterface.staticMethod();
		MyInterface2.staticMethod();
	}
}

class Ch extends Pa implements MyInterface, MyInterface2{
	public void method1() {
		System.out.println("method1() in Ch");
	}
}

class Pa{
	public void method2() {
		System.out.println("method2() in Pa");
	}
}

interface MyInterface{
	default void method1() {
		System.out.println("method1() in MyInterface");
	}
	
	default void method2() {
		System.out.println("method2() in MyInterface");
	}
	
	static void staticMethod() {
		System.out.println("staticMethod() in MyInterface");
	}
}

interface MyInterface2{
	default void method1() {
		System.out.println("method1() in MyInterface2");
	}
	
	static void staticMethod() {
		System.out.println("staticMethod() in MyInterface2");
	}
}