package C7_Object2;

public class RepairableTest {
	public static void main(String[] args) {
		Tank tank = new Tank();
		Dropship dropship = new Dropship();
		
		Marine marine = new Marine();
		SCV scv = new SCV();
		
		scv.repair(tank);
		scv.repair(dropship);
		//scv.repair(marine);
	}
}

interface Repairable{}
class GroundUnit extends unit2{
	GroundUnit(int hp){
		super(hp);
	}
}

class AirUnit extends unit2{
	AirUnit(int hp){
		super(hp);
	}
}

class unit2{
	int hitPoint;
	final int MAX_HP;
	unit2(int hp){
		MAX_HP = hp;
	}
}

class Tank extends GroundUnit implements Repairable{
	Tank(){
		super(150);
		hitPoint = MAX_HP;
	}
	
	public String toString() {
		return "Tank";
	}
}

class Dropship extends AirUnit implements Repairable{
	Dropship(){
		super(125);
		hitPoint = MAX_HP;
	}
	
	public String toString() {
		return "Dropship";
	}
}

class Marine extends GroundUnit{
	Marine(){
		super(40);
		hitPoint = MAX_HP;
	}
}

class SCV extends GroundUnit implements Repairable{
	SCV(){
		super(60);
		hitPoint = MAX_HP;
	}
	
	void repair(Repairable r) {
		if(r instanceof unit2) {
			unit2 u = (unit2)r;
			while(u.hitPoint != u.MAX_HP) {
				u.hitPoint++;
			}
			System.out.println(u.toString() + "의 수리가 끝났습니다.");
		}
	}
}