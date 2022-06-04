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
	protected Integer exp;
	
	public Rectangle solidArea;
	public boolean collisionOn = false;
	
	public int worldX, worldY;
	
	public abstract Integer attack();
	public abstract Integer defend();
	
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
	
	
}
