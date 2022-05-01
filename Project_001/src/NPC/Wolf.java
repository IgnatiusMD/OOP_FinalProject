package NPC;

public class Wolf extends NPC{
	private Double critChance = 0.2;
	
	public Wolf() {
		name = "Wolf";
		hp = 900;
		mp = 150;
		attack = 350;
		defense = 100;
	}
	
	public void attack() {
		if(criticalHit()) {
			System.out.println("Critical HIT: " + attack * 1.5);
		}
		else {
			System.out.println("Attack: " + attack);
		}
	}
	
	public boolean criticalHit() {
		return (Math.random() >= (1 - critChance)) ? true : false;
	}
	
	public void defend() {
		System.out.println("Defense: "+ (defense+50));
	}
}
