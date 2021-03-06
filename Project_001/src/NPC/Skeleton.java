package NPC;

public class Skeleton extends NPC{
	private Double reanimChance = 0.4;
	private boolean isReanimated = false;
	
	public Skeleton() {
		name = "Skeleton";
		hp = 900;
		mp = 100;
		attack = 450;
		defense = 70;
	}
	
	public Integer attack() {
		return attack;
	}
	
	public Integer defend() {
		return 70;
	}
	
	public void reanimate() {
		if(!isReanimated && (Math.random() >= (1 - reanimChance))) {
			System.out.println("\nWARNING:");
			System.out.println("Its bones seem to reconstruct");
			hp = 500;
			isReanimated = true;
		}
	}
}
