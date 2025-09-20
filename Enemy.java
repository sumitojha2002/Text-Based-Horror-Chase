public class Enemy {
    private int row;
    private int col;

    public Enemy(int enemyrow , int enemycol){
        this.row = enemyrow;
        this.col = enemycol;
    }

    public int getCol() {return col;}
    public int getRow() {return row;}

    public void moveNorth() {if(row>0)row--;}
    public void moveSouth() {if(row<4)row++;}
    public void moveWest() {if(col>0)col--;}
    public void moveEast() {if(col<4)col++;}

    public 
}
