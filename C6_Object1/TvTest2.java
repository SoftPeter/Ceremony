package C6_Object1;

class Tv2{
	String color;
	boolean power;
	int channel;
	
	void power() {
		power = !power;
	}
	void channelUp() {
		++channel;
	}
	void channelDown() {
		--channel;
	}
}


public class TvTest2 {
	public static void main(String[] args) {
		Tv2 t1 = new Tv2();
		Tv2 t2 = new Tv2();
		System.out.println("t1채널 = " + t1.channel);
		System.out.println("t2채널 = " + t2.channel);
		
		t1.channel = 7;
		System.out.println("t1채널을 7로 변경");
		
		System.out.println("t1채널 = " + t1.channel);
		System.out.println("t2채널 = " + t2.channel);
	}
}
