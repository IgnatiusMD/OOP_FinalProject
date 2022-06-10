package NPC;

public class Wolf extends NPC{
	private Double critChance = 0.2;
	
	public Wolf() {
		name = "Wolf";
		hp = 1100;
		mp = 150;
		attack = 350;
		defense = 100;
	}
	
	public Integer attack() {
		if(criticalHit()) {
			System.out.println("The wolf lands a critical hit!");
			return Double.valueOf(attack * 1.5).intValue();
		}
		else {
			return attack;
		}
	}
	
	public boolean criticalHit() {
		return (Math.random() >= (1 - critChance)) ? true : false;
	}
	
	public Integer defend() {
		return 50;
	}
}
