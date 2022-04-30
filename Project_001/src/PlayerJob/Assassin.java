package PlayerJob;

public class Assassin  extends Player{
	
	public Assassin() {	
		strength = 30;
		agility = 70;
		intellect = 30;
		
		hp = 1200; 
		mp = intellect * 2;
		attack = Double.valueOf(agility * 3.5).intValue();
		defense = 200;
	}
	
}
