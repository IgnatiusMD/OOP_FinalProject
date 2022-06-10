package NPC;

public class Ogre extends NPC{
	private Double enragePercent = 0.3;
	private boolean isEnraged = false;
	
	public Ogre() {
		name = "Forest Ogre";
		hp = 1600;
		mp = 300;
		attack = 450;
		defense = 200;
	}

	@Override
	public Integer attack() {
		enrage();
		
		return attack;
	}

	@Override
	public Integer defend() {
		return 120;
	}
	
	public void enrage() {
		if(hp <= (enragePercent * 2300) && !isEnraged) {
			System.out.println("\nWARNING:");
			System.out.println("You've made the Forest Ogre angry!!!");
			
			this.attack += 150;
			isEnraged = true;
		}
	}
	
}
