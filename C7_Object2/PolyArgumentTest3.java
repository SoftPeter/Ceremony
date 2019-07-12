package C7_Object2;

import java.util.Vector;

public class PolyArgumentTest3 {
	public static void main(String[] args) {
		Buyer3 b = new Buyer3();
		Note note = new Note();
		Logitech logitech = new Logitech();
		Book book = new Book();
		
		b.buy3(note);
		b.buy3(logitech);
		b.buy3(book);
		b.summary();
		System.out.println();
		b.refund(logitech);
		b.summary();
	}
}

class Product3{
	int price;
	int bonus;
	
	Product3(int price){
		this.price = price;
		bonus = (int)(price/10.0);
	}
	
	Product3(){
		price = 0;
		bonus = 0;
	}
}

class Note extends Product3{
	Note(){
		super(100);
	}
	public String toString() {
		return "Note";
	}
}

class Logitech extends Product3{
	Logitech(){
		super(100);
	}
	public String toString() {
		return "Logitech";
	}
}

class Book extends Product3{
	Book(){
		super(50);
	}
	public String toString() {
		return "Book";
	}
}

class Buyer3{
	int money = 1000;
	int bonus = 0;
	Vector item = new Vector();
	
	void buy3(Product3 p) {
		if(money < p.price) {
			System.out.println("잔액 부족");
			return;
		}
		
		money -= p.price;
		bonus += p.bonus;
		item.add(p);
		System.out.println(p + "을/를 구매하셨습니다.");
	}
	
	void refund(Product3 p) {
		if(item.remove(p)) {
			money += p.price;
			bonus -= p.bonus;
			System.out.println(p + "을/를 반품하셨습니다.");
		} else {
			System.out.println("제품 없음");
		}
	}
	
	void summary() {
		int sum = 0;
		String itemList = "";
		
		if(item.isEmpty()) {
			System.out.println("구입하신 제품이 없습니다.");
			return;
		}
		
		for(int i=0; i<item.size(); i++) {
			Product3 p = (Product3)item.get(i);
			sum += p.price;
			itemList += (i==0) ? "" + p : ", " + p;
		}
		System.out.println("구입하신 총 금액은 " + sum + "만원입니다.");
		System.out.println("구입하신 제품은 " + itemList + " 입니다.");
	}
}