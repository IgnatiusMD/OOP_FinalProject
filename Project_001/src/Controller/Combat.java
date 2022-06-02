package Controller;
import PlayerJob.*;
import NPC.NPC;

public class Combat {
	
	Double enemyAttackChance = 0.7;
	
	public Combat() {
		System.out.println("Combat has started!!!");
	}
	
	public void startCombat(Player player, NPC enemy) {
		while(player.getHp() > 0 || enemy.getHp() > 0) {
			
		}
		if (enemy.getHp() <= 0) {
			System.out.println("Player won");
			return;
		}
		else {
			System.out.println("Player lost");
			return;
		}
	}

}
