package controller;
import PlayerJob.*;
import NPC.*;

import javax.swing.SwingUtilities;

import Menu.*;

public class Combat {
	
	Double attackChance = 0.7;
	private GameLogic gl;
	private Map1 map1;
	
	public Combat(GameLogic gl, Map1 map1) {
		this.gl = gl;
		this.map1 = map1;
	}
	
	public void startCombat(Player player, NPC enemy) {
		System.out.println("===========================================");
		System.out.println("You've encountered an enemy!");
		
		//Temporary health of player, so that it resets each encounter
		Integer playerCombatHP = player.getHp();
		
		//Defense amount modifier when defend move is triggered
		Integer playerCombatDefMod = 0;
		Integer enemyCombatDefMod = 0;
		
		while(playerCombatHP > 0 && enemy.getHp() > 0) {
			System.out.println("Player: "+ playerCombatHP);
			System.out.println("Enemy: " + enemy.getHp());
			
			//player chooses an action
			if(willAttack()) {
				//player attacks
				System.out.println("You attacked");
				enemy.setHp(enemy.getHp() - (player.attack() - 
						(enemy.getDefense() + enemyCombatDefMod)));
				if(enemyCombatDefMod > 0) {
					enemyCombatDefMod = 0;
				}
			}
			else {
				//player defends
				System.out.println("You defended");
				playerCombatDefMod = player.defend();
			}
			
			
			//enemy chooses an action
			if(enemy.getHp() > 0) {
				if(willAttack()) {
					//enemy attacks
					System.out.println("The enemy attacked");
					playerCombatHP = playerCombatHP - (enemy.attack() - 
							(player.getDefense() + playerCombatDefMod));
					if(playerCombatDefMod > 0) {
						playerCombatDefMod = 0;
					}
				}
				else {
					//enemy defends
					System.out.println("The enemy defended");
					enemyCombatDefMod = enemy.defend();
				}
			}
			else {
				if(enemy instanceof Skeleton) {
					((Skeleton) enemy).reanimate();
				}
			}
			System.out.println("\n");
		}
		System.out.println("===========================================");
		if (enemy.getHp() <= 0) {
			System.out.println("You won the battle\n");
			player.gainEXP();
			return;
		}
		else {
			System.out.println("You died\n");
			System.out.println("GAME OVER\n\n");
			map1.window.dispose();
			new Main();
			return;
		}
	}
	
	private boolean willAttack() {
		return (Math.random() >= (1 - attackChance)) ? true : false;
	}
	
}
