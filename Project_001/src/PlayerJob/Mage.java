package PlayerJob;

public class Mage extends Player {

	public Mage() {
		strength = 20;
		agility = 20;
		intellect = 80;
		
		hp = 1000; 
		mp = intellect * 3;
		attack = intellect;
		defense = 90 + strength;
	}
	
	public void levelup() {
		if(exp >= 200) {
			intellect += 40 ;
			agility += 5;
			strength += 5;
			
			exp -= 200;
		}
	}
	
	public Integer attack() {
		if(mp >= 10) {
			mp -= 10;
			return (attack * 4);
		}
		else {
			return attack;
		}
	}
	
	public Integer defend() {
		if(mp >= 50) {
			mp -= 50;
			return (defense + 250);
		}
		else {
			return (defense+100);
		}
	}

}
