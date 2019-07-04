package C6_Object1;

class Data2{
	int x;
}


public class PrimitiveParamEx2 {
	public static void main(String[] args) {
		Data2 d = new Data2();
		d.x = 10;
		System.out.println("main() :" + d.x);
		
		change(d);
		System.out.println("After change");
		System.out.println("main() :" + d.x);
	}
	
	static void change(Data2 d) {
		d.x = 1000;
		System.out.println("change() :" + d.x);
	}
}