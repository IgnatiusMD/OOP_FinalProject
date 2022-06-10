package NPC;

public class Imp extends NPC{
	private Double castChance = 0.3;
	
	public Imp() {
		name = "Imp";
		hp = 1200;
		mp = 300;
		attack = 350;
		defense = 100;
	}
	
	public Integer attack() {
		if(mp >= 50 && cast()) {
			return hellfire();
		}
		else {
			return attack;
		}
		
	}
	
	public boolean cast() {
		return (Math.random() >= (1 - castChance)) ? true : false;
	}
	
	public Integer hellfire() {
		System.out.println("Hellfire reigns from the sky");
		mp -= 50;
		return 650;
	}
	
	public Integer defend() {
		return 80;
	}
}
