package PlayerJob;

public class Assassin  extends Player{
	private Double critChance = 0.3;
	
	public Assassin() {	
		strength = 30;
		agility = 70;
		intellect = 20;
		
		hp = 1200; 
		mp = intellect * 2;
		attack = agility * 3;
		defense = 90 + strength;
	}
	
	public void attack() {
		if(criticalHit()) {
			System.out.println("Critical HIT: " + attack * 2);
		}
		else {
			System.out.println("Attack: " + attack);
		}
	}
	
	public boolean criticalHit() {
		return (Math.random() >= (1 - critChance)) ? true : false;
	}
	
	public void defend() {
		System.out.println("Defense: "+ (defense+150));
	}
}
