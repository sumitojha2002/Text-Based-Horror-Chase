public class Player {
    private int row;
    private int col;

    public Player(int prow,int pcol){
        this.row = prow;
        this.col = pcol;
    }

   //Getters
   public int getRow() {return row;}
   public int getCol() {return col;}

   public void moveNorth(){if(row>0) row--;}
   public void moveSouth(){if(row<4) row++;}
   public void moveWest(){if(col>0) col--;}
   public void moveEast(){if(col<4) col++;}
}
