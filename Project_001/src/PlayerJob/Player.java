package PlayerJob;

public abstract class Player {
	protected String name;
	protected Integer hp;
	protected Integer mp;
	protected Integer attack;
	protected Integer defense;
	protected Integer strength;
	protected Integer agility;
	protected Integer intellect;
	
	public abstract void attack();
	public abstract void defend();
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the hp
	 */
	public Integer getHp() {
		return hp;
	}
	/**
	 * @param hp the hp to set
	 */
	public void setHp(Integer hp) {
		this.hp = hp;
	}
	/**
	 * @return the mp
	 */
	public Integer getMp() {
		return mp;
	}
	/**
	 * @param mp the mp to set
	 */
	public void setMp(Integer mp) {
		this.mp = mp;
	}
	/**
	 * @return the attack
	 */
	public Integer getAttack() {
		return attack;
	}
	/**
	 * @param attack the attack to set
	 */
	public void setAttack(Integer attack) {
		this.attack = attack;
	}
	/**
	 * @return the defense
	 */
	public Integer getDefense() {
		return defense;
	}
	/**
	 * @param defense the defense to set
	 */
	public void setDefense(Integer defense) {
		this.defense = defense;
	}
	/**
	 * @return the strength
	 */
	public Integer getStrength() {
		return strength;
	}
	/**
	 * @param strength the strength to set
	 */
	public void setStrength(Integer strength) {
		this.strength = strength;
	}
	/**
	 * @return the agility
	 */
	public Integer getAgility() {
		return agility;
	}
	/**
	 * @param agility the agility to set
	 */
	public void setAgility(Integer agility) {
		this.agility = agility;
	}
	/**
	 * @return the intellect
	 */
	public Integer getIntellect() {
		return intellect;
	}
	/**
	 * @param intellect the intellect to set
	 */
	public void setIntellect(Integer intellect) {
		this.intellect = intellect;
	}
	
	
}
