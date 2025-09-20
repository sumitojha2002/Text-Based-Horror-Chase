import java.util.Scanner;

public class Game {
    public Game(){
        int prow = (int)(Math.random()*5);
        int pcol = (int)(Math.random()*5);
        int erow,ecol;
        int exitrow,exitcol;
        int count=2;
        boolean win = true;
        boolean loss = true;
        Scanner sc = new Scanner(System.in);
        
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
        
        while(win && loss){
            boolean playerTurn = true;
            if(count%2==0){
                
                while(playerTurn){
                    
                    System.out.println("📍 You are in room "+"("+player.getRow()+","+player.getCol()+")");
                    System.out.println("🧟 You hear distant footsteps...");
                    System.out.print("Where do you want to move? (w/a/s/d): ");
                    
                    String input = sc.nextLine().trim();  
                    char option = input.isEmpty() ? ' ' : input.charAt(0);  
                    System.out.println();
                    switch(option){
                        case 'w' :
                        player.moveNorth();
                        playerTurn = false;
                        break;
                        
                        case 's' :
                        player.moveSouth();
                        playerTurn = false;
                        break;
                        
                        case 'a' :
                        player.moveWest();
                        playerTurn = false;
                        break;
                        
                        case 'd' :
                        player.moveEast();
                        playerTurn = false;
                        break;
                        
                        default: 
                        System.out.println("invalid input!");
                        break;
                    }
                }
            }else{
                System.out.println("🧟 The enemy is moving...");
                double chance = Math.random();
                if(chance< 0.7){
                    enemy.moveTowards(player);
                }else{
                    enemy.moveRandom();
                }
            }
            win = !(exitrow == player.getRow() && exitcol == player.getCol());
            loss = !(enemy.getRow() == player.getRow() && enemy.getCol() == player.getCol());
            if(!loss){
                System.out.println("🧟 caught you game over.");
            }
            if(!win){
                System.out.println("🎉 You found the exit. You escaped! ");
            }

            count++;
        }
    }

}
