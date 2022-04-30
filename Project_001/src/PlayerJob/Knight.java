package PlayerJob;

public class Knight extends Player{
	
	public Knight() {	
		strength = 70;
		agility = 30;
		intellect = 20;
		
		hp = 1450; 
		mp = intellect * 2;
		attack = strength * 4;
		defense = 250 + strength;
	}

}
