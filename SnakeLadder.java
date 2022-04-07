package com.bridgelab.Assignment4.SnakeLadder;
/**
 * @author atik
 *  Game with two player
*/
public class SnakeLadder {
	
	
	private static final int noPlay = 0;
	private static final int ladder = 1;
	private static final int snake = 2;
	private static final int maxPosition = 100;
	private static final int minPosition = 0;
	
	public static int playerA_Position = 0;
	public static int playerB_Position = 0;
	

	public static int turnOfPlayerA() {
		System.out.println("Player A is Rolling Dice");
		int dice = (int) (Math.floor(Math.random() * 6) + 1);
		System.out.println("dice for A : "+dice);
		
		int checkPlay = (int) Math.floor(Math.random() * 10) % 3;
		System.out.println("checkplay for A : "+checkPlay);
		
		switch(checkPlay) {
			case noPlay: 
				break;
				
			case ladder: 
				playerA_Position += dice;
				if(playerA_Position > maxPosition) {
					playerA_Position = playerA_Position-dice;
				}
				if(playerA_Position == maxPosition) {
					return playerA_Position;
				}
				turnOfPlayerA();
				break;
			
			case snake: 
				playerA_Position -= dice;
				if(playerA_Position < minPosition ) {
					playerA_Position = 0;
				}
				break;
		}
		return playerA_Position;
	}
	
	public static int turnOfPlayerB() {
		System.out.println("Player B is Rolling Dice");
		int dice = (int) (Math.floor(Math.random() * 6) + 1);
		System.out.println("dice for B : "+dice);
		
		
		int checkPlay = (int) Math.floor(Math.random() * 10) % 3;
		System.out.println("checkplay for B : "+checkPlay);
		
		switch(checkPlay) {
			case noPlay: 
				break;
				
			case ladder: 
				playerB_Position += dice;
				if(playerB_Position > maxPosition) {
					playerB_Position = playerB_Position-dice;
				}
				if(playerB_Position == maxPosition) {
					return playerB_Position;
				}
				turnOfPlayerB();
				break;
			
			case snake: 
				playerB_Position -= dice;
				if(playerB_Position < minPosition ) {
					playerB_Position = 0;
				}
				break;
		}
		return playerB_Position;
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to SNAKES AND LADDERS GAME!!");
		int positionOfA = 0, positionOfB = 0;

		while(positionOfA < maxPosition || positionOfB < maxPosition) {
			positionOfA = turnOfPlayerA();
			if(positionOfA == maxPosition) {
				System.out.println("Position of A : "+ positionOfA);
				System.out.println("Position of B : "+ positionOfB);
				System.out.println("--------PLAYER A WON !!-------");
				System.exit(0);
			}

			positionOfB = turnOfPlayerB();
			if(positionOfB == maxPosition) {
				System.out.println("Position of A : "+ positionOfA);
				System.out.println("Position of B : "+ positionOfB);
				System.out.println("--------PLAYER B WON !!--------");
				System.exit(0);	
			}	
		}
	}
	}



