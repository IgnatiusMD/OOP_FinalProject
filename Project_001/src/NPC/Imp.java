package NPC;

public class Imp extends NPC{
	private Double castChance = 0.3;
	
	public Imp() {
		name = "Imp";
		hp = 1000;
		mp = 300;
		attack = 350;
		defense = 100;
	}
	
	public void attack() {
		if(mp >= 50 && cast()) {
			hellfire();
		}
		else {
			System.out.println("Attack: "+ attack);
		}
		
	}
	
	public boolean cast() {
		return (Math.random() >= (1 - castChance)) ? true : false;
	}
	
	public void hellfire() {
		System.out.println("Hellfire reigns from the sky");
		System.out.println("Hellfire: " + 450);
		mp -= 50;
	}
	
	public void defend() {
		System.out.println("Defense: "+ (defense+80));
	}
}
