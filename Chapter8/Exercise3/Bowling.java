import java.util.*;

public class Bowling {
    static int playernum;
    public static void main(String[] args) throws InterruptedException {
        int pins=10;
      
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter Number of Player : ");
            playernum = scan.nextInt();    
        } 

        Players[] player = new Players[playernum]; 
        Sboard sboard = new Sboard(); 

        for (int i = 0; i < player.length; i++) {
           player[i] = new Players("Player "+String.valueOf(i));
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < player.length; j++) {
                Thread.sleep(2000);
                int totalx;
                totalx=0;
                for (int k = 0; k < 2; k++) {
                    int z =k+1;
                    System.out.println("Player "+String.valueOf(j) +" Throw "+ z);
                    Thread.sleep(1000);
                    int puntos = (int) Math.floor(Math.random()*(pins-0+1)+0);
                    if (k==0) { player[j].Scoreadd(puntos); }
                    else if(k==1) {player[j].Scoreadd2(puntos); }
                    pins=pins-puntos;
                    System.out.println("You hit "+puntos+" pins. ("+pins+ "left.)");
                    totalx=totalx+puntos;

                    if (pins==0&&k==0) {System.out.println("~~STRIKE~~");
                        totalx=20;}
                    else if (pins==0&&k==1&&totalx!=20){System.out.println("~~SPARE~~");
                        totalx=15;}
                }
                pins=10;
                player[j].towtal=player[j].towtal+totalx;
                System.out.println();
                Thread.sleep(1000);
                sboard.show(player,playernum);
            }
            System.out.println();  
        }
    }
}