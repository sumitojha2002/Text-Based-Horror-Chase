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

    public void moveTowards(Player player){
    if(this.row < player.getRow()) moveSouth();
    else if(this.row > player.getRow()) moveNorth();
    else if(this.col < player.getCol()) moveEast();
    else if(this.col > player.getCol()) moveWest();
    }

    public void moveRandom(){
        int random = (int)(Math.random()* 4);

        switch (random) {
            case 0:
                moveNorth();
                break;
            
            case 1:
                moveSouth();
                break;
            
            case 2:
                moveEast();
                break;
            
            case 3:
                moveWest();
                break;
            
            default:
                break;
        }
    }
}
