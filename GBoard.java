import Piece.Liders;
import Piece.Pawns;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class GBoard  extends  JFrame{

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
        // JFrame applicationFrame = new JFrame();
        // applicationFrame.setSize(500,500);
        // applicationFrame.setVisible(true);
        //applicationFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
    @Override
    public void paint(Graphics g) {

        super.paint(g);

        for(int row = 0 ;  row< 8; row++){

            for(int col = 0; col < 8;col++){

                GameTile  tile = new GameTile(row,col);
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



}
