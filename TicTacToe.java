package tictactoe;

import java.util.Scanner;

public class TicTacToe {
	
	static char[]board;
	
	public static void main(String []args) {
		
		System.out.println("tic tac toe Game");	
		initializeBoard();
	}
	
	static void initializeBoard() {
	    board = new char[10]; 
		for(int i = 1; i< 10; i++){
			board[i]='-';
		}
	}
}