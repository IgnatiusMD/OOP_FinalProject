package NPC;

public class Ogre extends NPC{
	private Double enragePercent = 0.3;
	
	public Ogre() {
		name = "Forest Ogre";
		hp = 2300;
		mp = 300;
		attack = 450;
		defense = 200;
	}

	@Override
	public Integer attack() {
		return attack;
	}

	@Override
	public Integer defend() {
		return 100;
	}
	
	public void enrage() {
		if(hp <= (enragePercent * 2300)) {
			this.attack += 100;
		}
	}
	
}
