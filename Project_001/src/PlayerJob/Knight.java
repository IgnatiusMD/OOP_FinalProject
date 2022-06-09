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
	
	@Override
	public void updateStats() {
		
	}
	
	@Override
	public void levelup() {
		if(exp >= 200) {
			strength += 25;
			agility += 5;
			intellect += 5;
			
			exp -= 200;
		}
	}
	
	@Override
	public Integer attack() {
		return attack;
	}
	
	@Override
	public Integer defend() {
		return 190;
	}
}
