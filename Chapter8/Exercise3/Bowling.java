import java.util.*;

public class Bowling {
    static int playernum;
    


    public static void main(String[] args) throws InterruptedException {
        int pins=10,add=0;
        List<Integer> total = new ArrayList<>();
        
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter Number of Player : ");
            playernum = scan.nextInt();
        }

        Players[] player = new Players[playernum]; 
        Sboard sboard = new Sboard();

       

        for (int i = 0; i < player.length; i++) {
           player[i] = new Players("Player "+String.valueOf(i));
           sboard.PlayerNumber = playernum;
           
           
        }

        


        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < player.length; j++) {
                Thread.sleep(2000);
                System.out.println("Player "+String.valueOf(j) +" First Turn");
                int puntos = (int) Math.floor(Math.random()*(pins-0+1)+0);
                player[j].Scoreadd(puntos);
                System.out.println("Hit :"+puntos);
                pins=pins-puntos;
                System.out.println("Remaining :" + pins);
                if(puntos<10){
                    System.out.println("Player "+String.valueOf(j) +" Second Turn");
                    int puntos2 = (int) Math.floor(Math.random()*(pins-0+1)+0);
                    player[j].Scoreadd2(puntos2);
                    System.out.println("Hit :"+puntos2);
                    pins=pins-puntos2;
                    System.out.println("Remaining :" + pins);
                    if (pins==0) {
                        System.out.println("SPARE!!!!!!!!!!!!!");
                    }
                }else if(puntos==10){
                    System.out.println("STRIKE!!!!!!!!!!!!!");
                    player[j].Scoreadd2(0);
                }

                System.out.println();
                pins=10;

                System.out.println("==========================================================================================================================");
                System.out.println("\t\t\t 1\t 2\t 3\t 4\t 5\t 6\t 7\t 8\t 9\t 10\t Total");
                    for (int index = 0; index < playernum; index++) {
                        

                        System.out.print("Player "+String.valueOf(index)+"\t\t");
                        for (int k = 0; k < 10; k++) {
                            int value = player[index].score.size();
                            if (k==value) {
                                break;
                            }
                            System.out.print(player[index].score.get(k)+" "+player[index].score2.get(k)+"\t");
                        }
                        System.out.println();
                        System.out.print("\t\t\t");
                        for (int k = 0; k < 10; k++) {
                            int value = player[index].score.size();
                            if (k==value) {
                               
                                break;
                            }
                            int sum = player[index].score.get(k)+player[index].score2.get(k);
                            
                            if(sum ==10){
                                if (player[index].score.get(k)==10) {
                                    sum=20;
                                }else{
                                    sum=15;
                                }
                            }
                            System.out.print(" "+sum+"\t");
                            
                            

                        }
                        System.out.println();

                    }
                    System.out.println("==========================================================================================================================");
                    
                    System.out.println("\n\n\n\n");
            }
            System.out.println();
            
        }
    System.out.println("==========================================================================================================================");
    System.out.println("\t\t\t 1\t 2\t 3\t 4\t 5\t 6\t 7\t 8\t 9\t 10\t Total");

    for (int i = 0; i < playernum; i++) {
        player[i].total();
        System.out.print("\t\t\t");
        for (int kk = 0 ; kk < player[i].scoretotal.size(); kk++){
            player[i].towtal+=player[i].scoretotal.get(kk);
        }
        for (int k = 0; k < 10; k++) {
            int value = player[i].score.size();
            if (k==value) {
                break;
            }
            System.out.print(player[i].score.get(k)+" "+player[i].score2.get(k)+"\t");
        }
        System.out.println();
        System.out.print("Player "+i+"\t\t");
        for (int k = 0; k < 10; k++) {
            int value = player[i].scoretotal.size();
            if (k==value) {
                break;
            }
            System.out.print(player[i].scoretotal.get(k)+"\t");
        }
        System.out.println("  "+player[i].towtal);
        
    }
    System.out.println("==========================================================================================================================");
    System.out.println("\n\n\n\n");
   
    



    
    



    }

    
    
}
