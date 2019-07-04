package C6_Object1;

class Card{
	String kind;
	int number;
	static int width = 100;
	static int height = 250;
}

public class CardTest {
	public static void main(String[] args) {
		System.out.println("width = " + Card.width);
		System.out.println("height = " + Card.height);
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.println("c1 의 정보 = " + c1.kind + " " + c1.number + "  (" + c1.width + " " + c1.height + ")");
		System.out.println("c2 의 정보 = " + c2.kind + " " + c2.number + "  (" + c2.width + " " + c2.height + ")");
		
		c1.width = 50;
		c1.height = 70;
		System.out.println("\n c1의 높이, 폭 변경 \n");
		
		System.out.println("c1 의 정보 = " + c1.kind + " " + c1.number + "  (" + c1.width + " " + c1.height + ")");
		System.out.println("c2 의 정보 = " + c2.kind + " " + c2.number + "  (" + c2.width + " " + c2.height + ")");
	}
}
