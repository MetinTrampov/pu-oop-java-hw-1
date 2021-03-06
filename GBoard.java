import Piece.Liders;
import Piece.Pawns;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class GBoard  extends  JFrame implements MouseListener {
    public static final int TILE_SIDE_COUNT = 6;


   private ArrayList<Object> piaceCollection;



    public GBoard(){

        this.piaceCollection =  new ArrayList<>();
        this.piaceCollection.add (new Pawns(1, 0));
        this.piaceCollection.add (new Pawns(1, 1));
        this.piaceCollection.add (new Pawns(1, 2));
        this.piaceCollection.add (new Pawns(1, 3));
        this.piaceCollection.add (new Pawns(1, 4));
        this.piaceCollection.add (new Pawns(1, 5));
        this.piaceCollection.add (new Pawns(1, 6));
        this.piaceCollection.add (new Pawns(1, 7));


        this.piaceCollection =  new ArrayList<>();
        this.piaceCollection.add (new Pawns(6, 0));
        this.piaceCollection.add (new Pawns(6, 1));
        this.piaceCollection.add (new Pawns(6, 2));
        this.piaceCollection.add (new Pawns(6, 3));
        this.piaceCollection.add (new Pawns(6, 4));
        this.piaceCollection.add (new Pawns(6, 5));
        this.piaceCollection.add (new Pawns(6, 6));
        this.piaceCollection.add (new Pawns(6, 7));



        this.setSize(600,600);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.addMouseListener(this);
        // JFrame applicationFrame = new JFrame();
        // applicationFrame.setSize(500,500);
        // applicationFrame.setVisible(true);
        //applicationFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
//Метод който взима кординатите върху който  щракне мишката
    public void mouseClicked(MouseEvent e) {

        int row = this.getBoardDimentionBasedOnCoordinates(e.getY());
        int col = this.getBoardDimentionBasedOnCoordinates(e.getX());


    }
    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
    @Override

    //Метод принтиращ редовете , колоните , гардовете и лидерите
    public void paint(Graphics g) {

       // super.paint(g);

        for(int row = 0 ;  row  < 8; row++){

            for(int col = 0; col < 8;col++){

                Color tileColor = this.getTileColor(row,col);
                GameTile  tile = new GameTile(row,col, tileColor);
                tile.render(g);

                Pawns p1 = new Pawns(row,col);
                p1.render(g);
                Liders lidYellow= new Liders(row,col);
                lidYellow.render(g);




                // Knight k1 = new Knight(row,col);
                // k1.render(g);
            }

        }


    }
    //Метод принтиращ игралното поле по подадени кординати за ред и колона

    private Color getTileColor(int row,int col){
        boolean isRowEven = (row % 2 == 0);
        boolean isRowOdd  = !isRowEven;
        boolean isColEven = (col % 2 == 0);
        boolean isCOlOdd  = !isColEven;

        if(isRowEven && isColEven) return Color.black;
        if(isRowEven && isCOlOdd) return  Color.WHITE;
        if(isRowOdd && isColEven) return  Color.WHITE;

        return  Color.black;

    }



//    private void renderGameTile(Graphics g, int row, int col) {
//
//        Color tileColor = this.getTileColor(row, col);
//        GameTile tile = new GameTile(row, col, tileColor);
//        tile.render(g);
//    }
//
//    private Object getBoardPiece(int row, int col) {
//        return this.pieceCollection[row][col];
//    }
//
//    private boolean hasBoardPiece(int row, int col) {
//        return this.getBoardPiece(row, col) != null;
//    }
//
//    private void renderGamePiece(Graphics g, int row, int col) {
//
//        if(this.hasBoardPiece(row, col)) {
//
//            Pawns p = (Pawns) this.getBoardPiece(row, col);
//            p.render(g);
//        }
//    }
    // Метод взимащ кординатите от игралното поле
    private int getBoardDimentionBasedOnCoordinates(int coordinates) {
        return coordinates / GameTile.TILE_SIZE;
    }
   // private  int getBoardDimentionBasedOnCordinates(int coordinates){


    //}



}
