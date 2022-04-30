package PlayerJob;

public class Knight extends Player{
	
	public Knight() {	
		strength = 70;
		agility = 30;
		intellect = 20;
		
		hp = 1850; 
		mp = intellect * 2;
		attack = strength * 4;
		defense = 200 + strength;
	}
	
	public void attack() {
		System.out.println("Attack: " + attack);
	}
	
	public void defend() {
		System.out.println("Defense: " + (defense+120));
	}
}
