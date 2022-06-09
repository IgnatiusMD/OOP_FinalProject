package NPC;

public class Goblin extends NPC{

	public Goblin() {
		name = "Goblin";
		hp = 850;
		mp = 200;
		attack = 300;
		defense = 100;
	}
	
	public Integer attack() {
		return attack;
	}
	
	public Integer defend() {
		return 70;
	}
}
