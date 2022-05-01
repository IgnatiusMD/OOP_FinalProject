package NPC;

public class Spider extends NPC{
	private Double venomChance = 0.5;
	private boolean isVenomous = false;
	private Integer venomDmg = 60;
	
	public Spider() {
		name = "Giant Spider";
		hp = 1000;
		mp = 240;
		attack = 300;
		defense = 100;
	}

	public void attack() {
		if(!isVenomous) {
			applyVenom();
		}
		
		if(isVenomous) {
			System.out.println("Its venom gives an extra kick");
			System.out.println("Attack: " + attack + venomDmg);
		}
		else {
			System.out.println("Attack: " + attack);
		}
	}
	
	public void applyVenom() {
		if(Math.random() >= (1 - venomChance)) {
			System.out.println("Venom appears to ooze out of its fangs");
			isVenomous = true;
		}
	}
	
	public void defend() {
		System.out.println("Defense: "+ (defense+50));
	}
}
