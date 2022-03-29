package com.samples.javademos.demo1;

public class demo7Methods {

	public static void main(String[] args) {
		
		displayFinalScore("John", calculateFinalScore(800, 4, 100, true));
		displayFinalScore("Max", calculateFinalScore(700, 4, 100, true));
		displayFinalScore("William", calculateFinalScore(1800, 7, 100, true));
		
	}
	
	public static void displayFinalScore(String playerName, int finalScore) {
		System.out.println("Player: " + playerName + " your final score was " + finalScore);
	}
	
	public static int calculateFinalScore(int score, int levelCompleted, int bonus, boolean gameOver) {
		if (gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			return finalScore;
		}
		return score;
	}

	
}
