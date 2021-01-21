package Piece;

import java.awt.*;

public class Liders {
    private int     row;
    private int     col;
    private  String color;
    private int point;

    public  Liders(int row , int col){
        this.row=row;
        this.col=col;


    }

    public boolean isMoveValid (int moveRow, int moveCol ) {

        int rowCoeficiaent = moveRow - this.row;
        int colCoeficient = moveCol - this.col;

        return rowCoeficiaent == 1 &&
                colCoeficient == 0 ;

    }



    public void render (Graphics g) {

        g.setColor(Color.YELLOW);
        g.fillRect(40,40,50,50);
        g.setColor(Color.green);
        g.fillRect(500,530,50,50);
    }
}
