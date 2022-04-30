package PlayerJob;

public class Mage extends Player{
	
	public Mage() {
		strength = 20;
		agility = 20;
		intellect = 70;
		
		hp = 1400; 
		mp = intellect * 3;
		attack = intellect;
		defense = 120 + strength;
	}
	
	public void attack() {
		if(mp >= 10) {
			System.out.println("Fireball: " + attack * 4);
			mp -= 10;
			System.out.println("MP Left: " + mp);
		}
		else {
			System.out.println("Attack: " + attack);
		}
	}
	
	public void defend() {
		if(mp >= 70) {
			System.out.println("Magi Armor: " + defense + 180);
			mp -= 70;
			System.out.println("MP Left: " + mp);
		}
		else {
			System.out.println("Defense: " + defense);
		}
	}
}
