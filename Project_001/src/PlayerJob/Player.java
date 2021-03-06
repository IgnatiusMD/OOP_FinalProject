package PlayerJob;

import java.awt.Rectangle;

public abstract class Player {
	protected String name;
	protected Integer hp;
	protected Integer mp;
	protected Integer attack;
	protected Integer defense;
	protected Integer strength;
	protected Integer agility;
	protected Integer intellect;
	protected Integer exp = 0;
	
	public Rectangle solidArea;
	public int solidAreaDefaultX, solidAreaDefaultY;
	public boolean collisionOn = false;
	public String direction;
	public Integer speed;
	
	public int worldX, worldY;
	
	public abstract Integer attack();
	public abstract Integer defend();
	public abstract void updateStats();
	public abstract void levelup();
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getHp() {
		return hp;
	}
	
	public void setHp(Integer hp) {
		this.hp = hp;
	}
	
	public Integer getMp() {
		return mp;
	}
	
	/**
	 * @return the worldX
	 */
	public int getWorldX() {
		return worldX;
	}
	/**
	 * @param worldX the worldX to set
	 */
	public void setWorldX(int worldX) {
		this.worldX = worldX;
	}
	/**
	 * @return the worldY
	 */
	public int getWorldY() {
		return worldY;
	}
	/**
	 * @param worldY the worldY to set
	 */
	public void setWorldY(int worldY) {
		this.worldY = worldY;
	}
	public void setMp(Integer mp) {
		this.mp = mp;
	}
	
	public Integer getAttack() {
		return attack;
	}
	
	public void setAttack(Integer attack) {
		this.attack = attack;
	}
	
	public Integer getDefense() {
		return defense;
	}
	
	public void setDefense(Integer defense) {
		this.defense = defense;
	}
	
	public Integer getStrength() {
		return strength;
	}
	
	public void setStrength(Integer strength) {
		this.strength = strength;
	}
	
	public Integer getAgility() {
		return agility;
	}
	
	public void setAgility(Integer agility) {
		this.agility = agility;
	}
	
	public Integer getIntellect() {
		return intellect;
	}
	
	public void setIntellect(Integer intellect) {
		this.intellect = intellect;
	}
	
	public void gainEXP() {
		this.exp += 100;
	}
}
