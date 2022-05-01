package PlayerJob;

public class Knight extends Player{
	
	public Knight() {	
		strength = 70;
		agility = 30;
		intellect = 20;
		
		hp = 1450; 
		mp = intellect * 2;
		attack = Double.valueOf(strength * 3.5).intValue();
		defense = 200 + strength;
	}
	
	public void attack() {
		System.out.println("Attack: " + attack);
	}
	
	public void defend() {
		System.out.println("Defense: " + (defense+190));
	}
}
