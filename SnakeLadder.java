package com.bridgelab.Assignment4.SnakeLadder;
/**
 * @author atik
 * Ensure the player gets to exact winning  position 100
*/
public class SnakeLadder {
	
	private static final int noPlay = 0;
	private static final int ladder = 1;
	private static final int snake = 2;
	private static final int maxPosition = 100;
	private static final int minPosition = 0;
	
	public static void main(String[] args) {
		System.out.println("Welcome to SNAKES AND LADDERS GAME!!");		
		int positionA = 0;
		
		while(positionA < maxPosition) {
			
			int dice = (int) (Math.floor(Math.random() * 6) + 1);
			System.out.println("dice : "+dice);
			int checkPlay = (int) Math.floor(Math.random()*10)%3;
			System.out.println("checkplay : "+checkPlay);
			
			switch(checkPlay) {
				case noPlay: 
					break;
					
				case ladder: 
					positionA += dice;
					if(positionA > maxPosition) {
						positionA = positionA-dice;
					}
					break;

				case snake: 
					positionA -= dice;
					if(positionA < minPosition ) {
						positionA = 0;
					}
					break;
			}
			System.out.println("end : "+positionA);
		}
	}
	}



