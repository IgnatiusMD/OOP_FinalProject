package controller;

import java.util.Vector;


import NPC.*;
import PlayerJob.*;

public class GameLogic {
	
	public static Vector <NPC> enemiesList = new Vector<>();

	public Ogre boss = new Ogre();
	private int isBossFought = 0;
	
	private static Vector <Integer[]> enemyCoordinates = new Vector<>();
	
	private boolean isEnemyListEmpty;
	
	Assassin plAssassin;
	
	public GameLogic(Assassin plAssassin) {
		this.plAssassin = plAssassin;
		addEnemies();
		addEncounterCoordinates();
	}
	
	public void addEnemies() {
//		enemiesList.add(new Goblin());
//		enemiesList.add(new Goblin());
//		enemiesList.add(new Spider());
//		enemiesList.add(new Spider());
//		enemiesList.add(new Wolf());
//		enemiesList.add(new Wolf());
//		enemiesList.add(new Skeleton());
//		enemiesList.add(new Skeleton());
//		enemiesList.add(new Imp());
//		enemiesList.add(new Imp());
	}
	
	public void addEncounterCoordinates() {
		/*coord Array Content
		[LowerBoundX, UpperBoundX, LowerBoundY, UpperBoundY, isVisited]*/
		
//		Integer[] coord1 = {1092, 1140, 1308, 1356, 0};
//		Integer[] coord2 = {996, 1044, 1008, 1056, 0};
//		Integer[] coord3 = {550, 598, 1528, 1576, 0};
//		Integer[] coord4 = {1100, 1148, 826, 874, 0};
//		Integer[] coord5 = {1100, 1148, 1876, 1924, 0};
//		Integer[] coord6 = {1612, 1660, 992, 1040, 0};
//		Integer[] coord7 = {1816, 1864, 420, 468, 0};
//		Integer[] coord8 = {1548, 1596, 1920, 1968, 0};
//		Integer[] coord9 = {1776, 1824, 1756, 1804, 0};
//		Integer[] coord10 = {477, 525, 412, 460, 0};
//		enemyCoordinates.add(coord1);
//		enemyCoordinates.add(coord2);
//		enemyCoordinates.add(coord3);
//		enemyCoordinates.add(coord4);
//		enemyCoordinates.add(coord5);
//		enemyCoordinates.add(coord6);
//		enemyCoordinates.add(coord7);
//		enemyCoordinates.add(coord8);
//		enemyCoordinates.add(coord9);
//		enemyCoordinates.add(coord10);
		
	}
	
	public Integer getEnemyPosAndIndex(int tile, int boundary) {
		return enemyCoordinates.get(tile)[boundary];
	}
	
	public void removeEnemyPosAndType(int tile) {
		enemyCoordinates.remove(tile);
	}
	
	public void flagEnemyPosition(int tile) {
		enemyCoordinates.get(tile)[4] = 1;
	}
	
	public Integer getCoordinateListSize() {
		return enemyCoordinates.size();
	}
	
	public NPC getEnemyFromList(int index) {
		return enemiesList.get(index);
	}
	
	public int checkEncounter() {
		for(int i = 0; i < getCoordinateListSize(); i++) {
			if((plAssassin.getWorldX() >= getEnemyPosAndIndex(i, 0) 
					&& plAssassin.getWorldX() <= getEnemyPosAndIndex(i, 1)) 
					&& ( plAssassin.getWorldY() >= getEnemyPosAndIndex(i, 2) 
					&& plAssassin.getWorldY() <= getEnemyPosAndIndex(i, 3))
					&& getEnemyPosAndIndex(i, 4) == 0) {
				
				flagEnemyPosition(i);
				
				return 1;
			}
			//Boss Encounter
//			else if((plAssassin.getWorldX() >= 1072 
//					&& plAssassin.getWorldX() <= 1132) 
//					&& ( plAssassin.getWorldY() >= 420 
//					&& plAssassin.getWorldY() <= 468)
//					&& isBossFought.) {
//				isBossFought = 1;
//				return 2;
//			}
		}
		areAllEnemiesDefeated();
		return -1;
	}
	
	public NPC getEnemyFromList() {
		return enemiesList.get(0);
	}
	
	public void popEnemyFromList() {
		enemiesList.remove(0);
	}
	
	public void teleporttoBoss() {
		plAssassin.setWorldX(1104);
		plAssassin.setWorldY(568);
		plAssassin.setSpeed(4);
	}
	
	public void areAllEnemiesDefeated() {
		if(enemiesList.isEmpty() && !isEnemyListEmpty) {
			isEnemyListEmpty = true;
			teleporttoBoss();
			enemiesList.add(boss);
			
			Integer[] bossCoord = {1072, 1132, 420, 468, 0};
			enemyCoordinates.add(bossCoord);
		}
	}
}