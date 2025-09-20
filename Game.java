import java.util.Scanner;

public class Game {
    public Game(){
        int prow = (int)(Math.random()*5);
        int pcol = (int)(Math.random()*5);
        int erow,ecol;
        int exitrow,exitcol;
        int count=2;
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
        
        while(exitrow != player.getRow() 
        && exitcol != player.getCol()){
            if(count%2==0){
                boolean playerTurn = true;
                
                while(!playerTurn){
                    
                    System.out.println("📍 You are in room "+"("+player.getRow()+","+player.getCol()+")");
                    System.out.println("🧟 You hear distant footsteps...");
                    System.out.print("Where do you want to move? (w/a/s/d): ");
                    
                    String input = sc.nextLine().trim();  
                    char option = input.isEmpty() ? ' ' : input.charAt(0);  
                    
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
                        player.moveEast();
                        playerTurn = false;
                        break;
                        
                        case 'd' :
                        player.moveWest();
                        playerTurn = false;
                        break;

                        default: 
                        System.out.println("invalid input!");
                        break;
                    }
                }
            }else{
                double chance = Math.random();
                if(chance< 0.7){
                    enemy.moveTowards(player);
                }else{
                    enemy.moveRandom();
                }
            }
            count++;
        }
    }

}
