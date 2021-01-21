import java.awt.*;

public class GameTile {

    private  int row;
    private  int col;
    private  int tileSize;


    public  GameTile(int row , int col){

        this.row        = row;
        this.col        = col;
        this.tileSize   = 100;

    }
    public  void render (Graphics g){

        int tileX = this.col * this.tileSize;
        int tileY = this.row * this.tileSize;




        if (this.col % 2 == 0 ){
            g.setColor(Color.BLACK);
        }else {
            g.setColor(Color.WHITE);
        }

        if(this.row % 2 == 0 ){
            g.setColor(Color.BLACK);
        }else {
            g.setColor(Color.WHITE);
        }


        g.fillRect(tileX,tileY,tileSize,tileSize);

    }

}
