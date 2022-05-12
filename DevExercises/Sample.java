import java.util.Scanner;

public class Sample {
    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter the stock symbol: ");
            String stockSymbol = scan.nextLine();

            System.out.println("Enter "+stockSymbol+"'s day 1 value: ");
            Double value1 = scan.nextDouble();

            System.out.println("Enter "+stockSymbol+"'s day 2 value: ");
            Double value2 = scan.nextDouble();

            System.out.println(stockSymbol +" has changed "+ (value1-value2) +"% in one day.");
        }
    }
    
}
