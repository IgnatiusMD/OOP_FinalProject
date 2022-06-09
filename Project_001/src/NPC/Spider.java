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

	public Integer attack() {
		if(!isVenomous) {
			applyVenom();
		}
		
		if(isVenomous) {
			System.out.println("Its venom gives an extra kick");
			return (attack + venomDmg);
		}
		else {
			return attack;
		}
	}
	
	public void applyVenom() {
		if(Math.random() >= (1 - venomChance)) {
			System.out.println("Venom appears to ooze out of its fangs");
			isVenomous = true;
		}
	}
	
	public Integer defend() {
		return 50;
	}
}
