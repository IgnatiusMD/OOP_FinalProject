package PlayerJob;

public class Knight extends Player{
	
	public Knight() {	
		strength = 70;
		agility = 30;
		intellect = 20;
		
		hp = 1450; 
		mp = intellect * 2;
		attack = Double.valueOf(strength * 3.5).intValue();
		defense = 120 + strength;
	}
	
	public void levelup() {
		if(exp >= 200) {
			strength += 30;
			agility += 10;
			intellect += 10;
			
			exp -= 200;
		}
	}
	
	public void attack() {
		System.out.println("Attack: " + attack);
	}
	
	public void defend() {
		System.out.println("Defense: " + (defense+190));
	}
}
