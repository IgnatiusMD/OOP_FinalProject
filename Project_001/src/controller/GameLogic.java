package controller;

import java.util.Vector;


import NPC.*;
import PlayerJob.*;

public class GameLogic {
	
	public Vector <NPC> enemiesList = new Vector<>();

	public Ogre boss = new Ogre();
	
	public Vector <Integer[]> enemyCoordinates = new Vector<>();
	
	private boolean isEnemyListEmpty = false;
	
	Assassin plAssassin;
	
	public GameLogic(Assassin plAssassin) {
		this.plAssassin = plAssassin;
		addEnemies();
		addEncounterCoordinates();
	}
	
	public void addEnemies() {
		enemiesList.add(new Goblin());
		enemiesList.add(new Goblin());
		enemiesList.add(new Spider());
		enemiesList.add(new Spider());
		enemiesList.add(new Wolf());
		enemiesList.add(new Wolf());
		enemiesList.add(new Skeleton());
		enemiesList.add(new Skeleton());
		enemiesList.add(new Imp());
		enemiesList.add(new Imp());
	}
	
	public void addEncounterCoordinates() {
		/*coord Array Content
		[LowerBoundX, UpperBoundX, LowerBoundY, UpperBoundY, isVisited]*/
		
		Integer[] coord1 = {1076, 1142, 304, 368, 0};
		Integer[] coord2 = {410, 464, 1540, 1610, 0};
		Integer[] coord3 = {350, 410, 840, 896, 0};
		Integer[] coord4 = {940, 1008, 1732, 1800, 0};
		Integer[] coord5 = {1067, 1138, 1870, 1924, 0};
		Integer[] coord6 = {1698, 1760, 448, 512, 0};
		Integer[] coord7 = {1686, 1753, 2035, 2088, 0};
		Integer[] coord8 = {1694, 1754, 1828, 1904, 0};
		Integer[] coord9 = {1692, 1758, 936, 984, 0};
		Integer[] coord10 = {1783, 1858, 320, 364, 0};
		Integer[] bossCoord = {448, 508, 348, 412, 0};
		
		enemyCoordinates.add(coord1);
		enemyCoordinates.add(coord2);
		enemyCoordinates.add(coord3);
		enemyCoordinates.add(coord4);
		enemyCoordinates.add(coord5);
		enemyCoordinates.add(coord6);
		enemyCoordinates.add(coord7);
		enemyCoordinates.add(coord8);
		enemyCoordinates.add(coord9);
		enemyCoordinates.add(coord10);
		enemyCoordinates.add(bossCoord);
		
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
		}
		if(!isEnemyListEmpty) {
			areAllEnemiesDefeated();
		}
		return -1;
	}
	
	public NPC getEnemyFromList() {
		return enemiesList.get(0);
	}
	
	public void popEnemyFromList() {
		enemiesList.remove(0);
	}
	
	public void teleporttoBoss() {
		plAssassin.setWorldX(484);
		plAssassin.setWorldY(648);
		plAssassin.setSpeed(4);
	}
	
	public void areAllEnemiesDefeated() {
		if(enemiesList.isEmpty() && !isEnemyListEmpty) {
			isEnemyListEmpty = true;
			teleporttoBoss();
			enemiesList.add(boss);
		}
	}
}