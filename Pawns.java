package Piece;

import java.awt.*;

public class Pawns {

    private int     row;
    private int     col;
    private  String color;
    private int point;

    public  Pawns(int row , int col){
        this.row=row;
        this.col=col;

    }
    //Метод който показва дали даден ход е правилен според правилата на играта
    public boolean isMoveValid (int moveRow, int moveCol ) {

        int rowCoeficiaent = moveRow - this.row;
        int colCoeficient = moveCol - this.col;

        return rowCoeficiaent == 1 &&
                colCoeficient == 0 ;

    }


        // Метод който съдържа позициите на всеки гард и лидер в играта
    public void render (Graphics g) {

        g.setColor(Color.yellow);
        g.fillOval(370,528,70,55);

        g.fillOval(260,528,70,55);
        g.fillOval(140,528,70,55);
        g.fillOval(30,528,70,55);


        g.setColor(Color.GREEN);

        g.fillOval(490,38,70,55);
        g.fillOval(370,38,70,55);

        g.fillOval(260,38,70,55);
        g.fillOval(140,38,70,55);
        // g.fillOval(100,40,50,50);

        g.setColor(Color.YELLOW);

        g.fillOval(500,40,50,50);
        g.fillOval(380,40,50,50);

        g.fillOval(270,40,50,50);
        g.fillOval(150,40,50,50);
       // g.fillOval(100,40,50,50);

        g.setColor(Color.GREEN);
        g.fillOval(40,530,50,50);
        g.fillOval(380,530,50,50);

        g.fillOval(270,530,50,50);
        g.fillOval(150,530,50,50);


        g.setColor(Color.gray);
        g.fillOval(270,315,55,55);





    }
}
