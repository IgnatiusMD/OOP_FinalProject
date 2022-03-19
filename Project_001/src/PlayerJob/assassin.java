package PlayerJob;

public class Assassin {
	
	protected String name;
	protected String playerClass;
	protected int hp;
	protected int mp;
	protected int defense;
	protected int strength;
	protected int agility;
	protected int intellect;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlayerClass() {
		return playerClass;
	}

	public void setPlayerClass(String playerClass) {
		this.playerClass = playerClass;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getAgility() {
		return agility;
	}

	public void setAgility(int agility) {
		this.agility = agility;
	}

	public int getIntellect() {
		return intellect;
	}

	public void setIntellect(int intellect) {
		this.intellect = intellect;
	}
	
	public Assassin() {
		playerClass = "Assassin";
		
		hp = (strength * 3) + agility; 
		mp = intellect * 2;
		defense = (strength * 2) + 30;
		
		strength = 50;
		agility = 70;
		intellect = 30;
		
	}

}
