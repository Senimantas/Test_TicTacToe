/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author pomobc
 */
public class GameBoard {
    
    private static String board[][];
    private static final String X = "X";
    private static final String O = "O";
    private static int player;
    private static GameBoard gb;

    /**
     * @return the board
     */
    public static String[][] getBoard() {
        return board;
    }
    
    private GameBoard(){

    }
    
    public String setXorO(int locX, int locY){
        if(player==0){
            board[locX][locY] = X;
            player = 1;
            return X;
        }
            
        else {
            board[locX][locY] = O;
            player = 0;
            return O;
        }
    }
    
    public void print(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(getBoard()[i][j]+"  ");
            }
            System.out.println();
        }
    }
    
    public static void checkWinner(){


        
    }
    
    public static GameBoard getInstance() {
        if(getBoard() == null){
            board = new String[3][3];
            player = 0;
        
            if (gb == null) {
                gb = new GameBoard();
            }
        }
                
        return GameBoard.gb;
    }
    
}
