public class GameMap {
    private Room[][] grid;

    public GameMap() {
        int size = 5;                     
        grid = new Room[size][size];       
  
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                grid[i][j] = new Room(i, j);
            }
        }
    }

    public Room getRoom(int row, int col) {
        return grid[row][col];
    }

    public boolean isOccupied(int row,int col){
        return false;
    }
}