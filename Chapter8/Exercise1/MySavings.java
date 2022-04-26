
import java.util.InputMismatchException;
import java.util.Scanner;

public class MySavings {
    public static void main(String[] args)  {
        PiggyBank Pig = new PiggyBank();
        Scanner scan = new Scanner(System.in);
        int loop = 0;
        do{
        System.out.println("1. Show total in bank.\n"+
                            "2. Add a penny.\n"+
                            "3. Add a nickel.\n"+
                            "4. Add a dime.\n"+
                            "5. Add a quarter.\n"+
                            "6. Take money out of bank .\n"+
                            "Enter O to quit\n"+
                            "Enter you choice:");
        try {int choice = scan.nextInt();
        System.out.println("\n\n\n\n");
        switch (choice){
            case 1:
                Pig.Print();
                break;
            case 2:
                Pig.addPennies();
                break;
            case 3:
                Pig.addNickel();
                break;
            case 4:
                Pig.addDime();
                break;
            case 5:
                Pig.addquarter();
                break;
            case 6:
                Pig.Withdraw();
                break;
            case 0:
                loop=1;
                break;
        }
    }catch(InputMismatchException x){
        System.out.println("WrongInput");
        loop=1;

    }
    }while(loop==0);
    }


    
}
