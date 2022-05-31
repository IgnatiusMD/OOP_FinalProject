package NPC;

public class Ogre extends NPC{
	private Double enragePercent = 0.3;
	private Integer test;
	public Ogre() {
		name = "Forest Ogre";
		hp = 2300;
		mp = 300;
		attack = 450;
		defense = 200;
	}

	@Override
	public void attack() {
		System.out.println("Attack: " + attack);
	}

	@Override
	public void defend() {
		System.out.println("Defense: "+ (defense+100));
	}
	
	public void enrage() {
		if(hp <= (enragePercent * 2300)) {
			this.attack += 100;
		}
	}
}
