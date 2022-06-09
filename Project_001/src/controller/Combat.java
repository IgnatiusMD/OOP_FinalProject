package controller;
import PlayerJob.*;
import NPC.NPC;
import Menu.Map1;

public class Combat {
	
	Double attackChance = 0.7;
	private GameLogic gl;
	private Map1 map1;
	
	public Combat(GameLogic gl, Map1 map1) {
		this.gl = gl;
		this.map1 = map1;
		System.out.println("Combat has started!!!");
	}
	
	public void startCombat(Player player, NPC enemy) {
		Integer playerCombatHP = player.getHp();
		
		while(playerCombatHP > 0 && enemy.getHp() > 0) {
			System.out.println("Player: "+ player.getHp());
			System.out.println("Enemy: " + enemy.getHp());
			
			//player attacks
			if(willAttack()) {
				enemy.setHp(enemy.getHp() - (player.attack() - enemy.getDefense()));
			}
			
			//enemy attacks
			if(willAttack()) {
				playerCombatHP = playerCombatHP - (enemy.attack() - player.getDefense());
			}
			
		}
		
		if (enemy.getHp() <= 0) {
			System.out.println("\nPlayer won\n");
			gl.popEnemyFromList();
			player.gainEXP();
			map1.cardLayout.show(map1.panel, "game");
			return;
		}
		else {
			System.out.println("\nPlayer lost\n");
			return;
		}
	}
	
	private boolean willAttack() {
		return (Math.random() >= (1 - attackChance)) ? true : false;
	}
	
}
