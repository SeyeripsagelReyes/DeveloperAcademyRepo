import java.sql.Array;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LunchOrder {

    public static void main(String[] args) {

        Food kain = new Food();
        int tutal;
        String awtput = "";
        int tots;
        String fooooods[] = {"hamburgers", "salads", "fries", "cokes"};

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < fooooods.length; i++) {
            System.out.print("Enter number of "+ fooooods[i] +" ");
            try {
                tots = scan.nextInt();
                switch (i) {
                    case 0:
                        kain.BORGER();
                        kain.yum(tots);
                        System.out.println(kain.print(awtput));
                        break;
                    case 1:
                        kain.SALAD();
                        kain.yum(tots);
                        System.out.println(kain.print(awtput));
                        break;
                    case 2:
                        kain.PRENSPRAYS();
                        kain.yum(tots);
                        System.out.println(kain.print(awtput));
                        break;
                    case 3:
                        kain.COOK();
                        kain.yum(tots);
                        System.out.println(kain.print(awtput));
                        break;
                    default:
                        break;
                }
                
            } catch (InputMismatchException e) {
                System.out.println("Wrong input mamen");
            }

        }

        kain.awtput();


        
        
    }
    
}
