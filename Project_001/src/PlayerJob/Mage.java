package PlayerJob;

public class Mage extends Player{
	
	public Mage() {
		strength = 20;
		agility = 20;
		intellect = 70;
		
		hp = 1000; 
		mp = intellect * 3;
		attack = intellect;
		defense = 120;
	}
	
}
