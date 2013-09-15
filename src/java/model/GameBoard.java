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

    /**
     * @param aBoard the board to set
     */
    public static void setBoard(String[][] aBoard) {
        board = aBoard;
    }
    
    private GameBoard(){

    }
    
    public String setXorO(int locX, int locY){
        if(getPlayer()==1){
            getBoard()[locX][locY] = X;
            player = 2;
            return X;
        }
            
        else {
            getBoard()[locX][locY] = O;
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
        if((getBoard()[0][0]!=null) && (getBoard()[0][1]!=null) && (getBoard()[0][2]!=null)){
            if((getBoard()[0][0].equals(X)) && (getBoard()[0][1].equals(X)) && (getBoard()[0][2].equals(X))) {setBoard(null); return true;}
            else if((getBoard()[0][0].equals(O)) && (getBoard()[0][1].equals(O)) && (getBoard()[0][2].equals(O))) {setBoard(null); return true;}
        }
        if((getBoard()[1][0]!=null) && (getBoard()[1][1]!=null) && (getBoard()[1][2]!=null)){
            if((getBoard()[1][0].equals(X)) && (getBoard()[1][1].equals(X)) && (getBoard()[1][2].equals(X))) {setBoard(null); return true;}
            else if((getBoard()[1][0].equals(O)) && (getBoard()[1][1].equals(O)) && (getBoard()[1][2].equals(O))) {setBoard(null); return true;}
        }
        if((getBoard()[2][0]!=null) && (getBoard()[2][1]!=null) && (getBoard()[2][2]!=null)){
            if((getBoard()[2][0].equals(X)) && (getBoard()[2][1].equals(X)) && (getBoard()[2][2].equals(X))) {setBoard(null); return true;}
            else if((getBoard()[2][0].equals(O)) && (getBoard()[2][1].equals(O)) && (getBoard()[2][2].equals(O))) {setBoard(null); return true;}
        }
        
        //check columns
        if((getBoard()[0][0]!=null) && (getBoard()[1][0]!=null) && (getBoard()[2][0]!=null)){
            if((getBoard()[0][0].equals(X)) && (getBoard()[1][0].equals(X)) && (getBoard()[2][0].equals(X))) {setBoard(null); return true;}
            else if((getBoard()[0][0].equals(O)) && (getBoard()[1][0].equals(O)) && (getBoard()[2][0].equals(O))) {setBoard(null); return true;}
        }
        if((getBoard()[0][1]!=null) && (getBoard()[1][1]!=null) && (getBoard()[2][1]!=null)){
            if((getBoard()[0][1].equals(X)) && (getBoard()[1][1].equals(X)) && (getBoard()[2][1].equals(X))) {setBoard(null); return true;}
            else if((getBoard()[0][1].equals(O)) && (getBoard()[1][1].equals(O)) && (getBoard()[2][1].equals(O))) {setBoard(null); return true;}
        }
        if((getBoard()[0][2]!=null) && (getBoard()[1][2]!=null) && (getBoard()[2][2]!=null)){
            if((getBoard()[0][2].equals(X)) && (getBoard()[1][2].equals(X)) && (getBoard()[2][2].equals(X))) {setBoard(null); return true;}
            else if((getBoard()[0][2].equals(O)) && (getBoard()[1][2].equals(O)) && (getBoard()[2][2].equals(O))) {setBoard(null); return true;}
        }
            
        //check diagonals
        if((getBoard()[0][0]!=null) && (getBoard()[1][1]!=null) && (getBoard()[2][2]!=null)){
            if((getBoard()[0][0].equals(X)) && (getBoard()[1][1].equals(X)) && (getBoard()[2][2].equals(X))) {setBoard(null); return true;}
            else if((getBoard()[0][0].equals(O)) && (getBoard()[1][1].equals(O)) && (getBoard()[2][2].equals(O))) {setBoard(null); return true;}
        }
            
        if((getBoard()[0][2]!=null) && (getBoard()[1][1]!=null) && (getBoard()[2][0]!=null)){
            if((getBoard()[0][2].equals(X)) && (getBoard()[1][1].equals(X)) && (getBoard()[2][0].equals(X))) {setBoard(null); return true;}
            else if((getBoard()[0][2].equals(O)) && (getBoard()[1][1].equals(O)) && (getBoard()[2][0].equals(O))) {setBoard(null); return true;}
        }
        
        return false;
    }
    
    public static GameBoard getInstance() {
        if(getBoard() == null){
            setBoard(new String[3][3]);
            player = 1;
        
            if (gb == null) {
                gb = new GameBoard();
            }
        }
                
        return GameBoard.gb;
    }
    
}
