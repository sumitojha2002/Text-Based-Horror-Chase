import java.util.Scanner;

public class Game {
    public Game(){
        int prow = (int)(Math.random()*5);
        int pcol = (int)(Math.random()*5);
        int erow,ecol;
        int exitrow,exitcol;
        int count=2;

        Player player = new Player(prow, pcol);

        do{
         erow = (int)(Math.random()*5);
         ecol = (int)(Math.random()*5);
        }while(prow == erow && pcol == ecol);

        Enemy enemy = new Enemy(erow,ecol);
        
         do{
         exitrow = (int)(Math.random()*5);
         exitcol = (int)(Math.random()*5);
        }while(prow == exitrow && pcol == exitcol);

        while(exitrow != player.getRow() 
            && exitcol != player.getCol()){
            if(count%2==0){
                System.out.println("📍 You are in room "+"("+player.getRow()+","+player.getCol()+")");
                System.out.println("🧟 You hear distant footsteps...");
                System.out.println("Where do you want to move? (n/s/e/w): ");
            }else{

            }
                
        }
    }

}
