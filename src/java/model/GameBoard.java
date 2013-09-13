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

    /**
     * @return the player
     */
    public static int getPlayer() {
        return player;
    }
    
    private GameBoard(){

    }
    
    public String setXorO(int locX, int locY){
        if(getPlayer()==1){
            board[locX][locY] = X;
            player = 2;
            return X;
        }
            
        else {
            board[locX][locY] = O;
            player = 1;
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
    
    public boolean checkWinner(){
        //check rows
        if((board[0][0]!=null) && (board[0][1]!=null) && (board[0][2]!=null)){
            if((board[0][0].equals(X)) && (board[0][1].equals(X)) && (board[0][2].equals(X))) {board=null; return true;}
            else if((board[0][0].equals(O)) && (board[0][1].equals(O)) && (board[0][2].equals(O))) {board=null; return true;}
        }
        if((board[1][0]!=null) && (board[1][1]!=null) && (board[1][2]!=null)){
            if((board[1][0].equals(X)) && (board[1][1].equals(X)) && (board[1][2].equals(X))) {board=null; return true;}
            else if((board[1][0].equals(O)) && (board[1][1].equals(O)) && (board[1][2].equals(O))) {board=null; return true;}
        }
        if((board[2][0]!=null) && (board[2][1]!=null) && (board[2][2]!=null)){
            if((board[2][0].equals(X)) && (board[2][1].equals(X)) && (board[2][2].equals(X))) {board=null; return true;}
            else if((board[2][0].equals(O)) && (board[2][1].equals(O)) && (board[2][2].equals(O))) {board=null; return true;}
        }
        
        //check columns
        if((board[0][0]!=null) && (board[1][0]!=null) && (board[2][0]!=null)){
            if((board[0][0].equals(X)) && (board[1][0].equals(X)) && (board[2][0].equals(X))) {board=null; return true;}
            else if((board[0][0].equals(O)) && (board[1][0].equals(O)) && (board[2][0].equals(O))) {board=null; return true;}
        }
        if((board[0][1]!=null) && (board[1][1]!=null) && (board[2][1]!=null)){
            if((board[0][1].equals(X)) && (board[1][1].equals(X)) && (board[2][1].equals(X))) {board=null; return true;}
            else if((board[0][1].equals(O)) && (board[1][1].equals(O)) && (board[2][1].equals(O))) {board=null; return true;}
        }
        if((board[0][2]!=null) && (board[1][2]!=null) && (board[2][2]!=null)){
            if((board[0][2].equals(X)) && (board[1][2].equals(X)) && (board[2][2].equals(X))) {board=null; return true;}
            else if((board[0][2].equals(O)) && (board[1][2].equals(O)) && (board[2][2].equals(O))) {board=null; return true;}
        }
            
        //check diagonals
        if((board[0][0]!=null) && (board[1][1]!=null) && (board[2][2]!=null)){
            if((board[0][0].equals(X)) && (board[1][1].equals(X)) && (board[2][2].equals(X))) {board=null; return true;}
            else if((board[0][0].equals(O)) && (board[1][1].equals(O)) && (board[2][2].equals(O))) {board=null; return true;}
        }
            
        if((board[0][2]!=null) && (board[1][1]!=null) && (board[2][0]!=null)){
            if((board[0][2].equals(X)) && (board[1][1].equals(X)) && (board[2][0].equals(X))) {board=null; return true;}
            else if((board[0][2].equals(O)) && (board[1][1].equals(O)) && (board[2][0].equals(O))) {board=null; return true;}
        }
        
        return false;
    }
    
    public static GameBoard getInstance() {
        if(getBoard() == null){
            board = new String[3][3];
            player = 1;
        
            if (gb == null) {
                gb = new GameBoard();
            }
        }
                
        return GameBoard.gb;
    }
    
}
