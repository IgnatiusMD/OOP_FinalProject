package NPC;

public class Skeleton extends NPC{
	private Double reanimChance = 0.4;
	private boolean isReanimated = false;
	
	public Skeleton() {
		name = "Skeleton";
		hp = 700;
		mp = 100;
		attack = 250;
		defense = 70;
	}
	
	public void attack() {
		System.out.println("Attack: " + attack);
	}
	
	public void defend() {
		System.out.println("Defense: "+ (defense+70));
	}
	
	public void reanimate() {
		if(!isReanimated && (Math.random() >= (1 - reanimChance))) {
			System.out.println("Its bones seem to reconstruct");
			hp = 500;
			isReanimated = true;
		}
	}
}
