public class Room {
    private int row;
    private int col;

    public Room(int row, int col){
        this.row = row;
        this.col = col;
    }

    @Override
    public String toString() {
        return "(" + row + "," + col + ")";
    }
}
