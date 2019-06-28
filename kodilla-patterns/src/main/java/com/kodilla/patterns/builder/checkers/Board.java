package com.kodilla.patterns.builder.checkers;

public class Board {
    public static final int MIN_INDEX = 0;
    public static final int MAX_INDEX = 9;
    Figure[][] board = new Figure[10][];
    public Board(){
        for(int n = 0; n<10;n++){
            board[n]=new Figure[10];
        }
    }
    public Figure getFigure(int x, int y){
        return board[x][y];
    }
    public void setFigure(Figure figure, int x, int y){
        board[x][y]= figure;
    }
    public String toString(){
        String result = "";
        for(int i =MIN_INDEX;i<=MAX_INDEX;i++){
            result+="|";
            for(int n = MIN_INDEX; n<=MAX_INDEX; n++){
                if(board[i][n]==null){
                    result += " ";
                }else{
                    result+= board[i][n].getColor().equals(Figure.BLACK);
                    result+= board[i][n] instanceof Pawn ? "P" : "Q";
                }
                    result+="|";
            }
            result+= "\n";
        }
        return result;
    }
}
