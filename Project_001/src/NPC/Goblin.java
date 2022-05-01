package NPC;

public class Goblin extends NPC{

	public Goblin() {
		name = "Goblin";
		hp = 850;
		mp = 200;
		attack = 300;
		defense = 100;
	}
	
	public void attack() {
		System.out.println("Attack: " + attack);
	}
	
	public void defend() {
		System.out.println("Defense: "+ (defense+70));
	}
}
