package C7_Object2;

public class InnerEx5 {
	public static void main(String[] args) {
		Outer2 oc = new Outer2();
		Outer2.Inner inner = oc.new Inner();
		inner.method1();
	}
}

class Outer2{
	int value = 10;
	
	class Inner{
		int value=20;
		void method1() {
			int value=30;
			System.out.println("			vlaue : " + value);
			System.out.println("		this.value : " + this.value);
			System.out.println("Outer.this.value : " + Outer2.this.value);
		}
	}
}
