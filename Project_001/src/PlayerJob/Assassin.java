package PlayerJob;

public class Assassin  extends Player{
	
	public Assassin() {	
		strength = 30;
		agility = 70;
		intellect = 30;
		
		hp = 1200; 
		mp = intellect * 2;
		attack = agility * 3;
		defense = 200 + strength;
	}
	
}
