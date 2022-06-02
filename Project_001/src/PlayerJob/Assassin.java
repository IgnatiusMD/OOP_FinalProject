package PlayerJob;

public class Assassin extends Player{

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
	
	public void levelup() {
		if(exp >= 200) {
			agility += 30;
			strength += 15;
			intellect += 5;
			
			exp -= 200;
		}
	}
	
	public Integer attack() {
		if(criticalHit()) {
			return (attack * 2);
		}
		else {
			return attack;
		}
	}
	
	public boolean criticalHit() {
		return (Math.random() >= (1 - critChance)) ? true : false;
	}
	
	public Integer defend() {
		return (defense+150);
	}

}
