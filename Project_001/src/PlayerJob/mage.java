package PlayerJob;

public class mage {
	
	protected String name;
	protected String playerClass;
	protected int hp;
	protected int mp;
	protected int defense;
	protected int strength;
	protected int agility;
	protected int intellect;
	
	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected String getPlayerClass() {
		return playerClass;
	}

	protected void setPlayerClass(String playerClass) {
		this.playerClass = playerClass;
	}

	protected int getHp() {
		return hp;
	}

	protected void setHp(int hp) {
		this.hp = hp;
	}

	protected int getMp() {
		return mp;
	}

	protected void setMp(int mp) {
		this.mp = mp;
	}

	protected int getDefense() {
		return defense;
	}

	protected void setDefense(int defense) {
		this.defense = defense;
	}

	protected int getStrength() {
		return strength;
	}

	protected void setStrength(int strength) {
		this.strength = strength;
	}

	protected int getAgility() {
		return agility;
	}

	protected void setAgility(int agility) {
		this.agility = agility;
	}

	protected int getIntellect() {
		return intellect;
	}

	protected void setIntellect(int intellect) {
		this.intellect = intellect;
	}
	
	public mage() {
		playerClass = "Mage";
		
		hp = strength + 50;
		mp = intellect * 2;
		defense = strength + 50;
		
		strength = 20;
		agility = 40;
		intellect = 70;
	}

}
