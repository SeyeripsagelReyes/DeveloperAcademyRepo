class Sboard {
    int PlayerNumber;
    Players []player = new Players[PlayerNumber];


    

    public void show() {
    
    System.out.println("==========================================================================================================================");
    System.out.println("\t\t\t 1\t 2\t 3\t 4\t 5\t 6\t 7\t 8\t 9\t 10\t Total");

    for (int i = 0; i < PlayerNumber; i++) {
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