

import java.util.Scanner;


/**
 * Printing
 */
public class Printing {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter the number of copies to be printed: ");
            int x = Integer.parseInt(scan.nextLine());
            double y;
            if (isBetween(x,0,99) ) {
                System.out.println("Price per copy is: $0.30");
                y =x*.30;
            } else if (isBetween(x,100,499) ) {
                System.out.println("Price per copy is: $0.28");
                y =x*.29;
            } else if (isBetween(x,500,749) ) {
                System.out.println("Price per copy is: $0.27");
                y =x*.28;
            } else if (isBetween(x,750,1000)) {
                System.out.println("Price per copy is: $0.26");
                y =x*.27;
            } else if (x>1000){
                System.out.println("Price per copy is: $0.25");
                y =x*.26;
            } else{
                System.out.println("WRONG INPUT");
                y =x*.25;
            }
            System.out.println("Total cost is: $"+y);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }


    }

    private static boolean isBetween(int x, int i, int j) {
        return i<=x&&x<=j;
    }

}