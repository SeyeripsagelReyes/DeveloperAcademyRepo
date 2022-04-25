package DevExercises;

import java.io.InputStream;
import java.util.Scanner;

/**
 * https://i.imgur.com/a0nAkMP.png
 */
public class ObjectHeight {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a time less than 4.5 seconds: ");
        double x = scan.nextDouble();
        double h = 100 - 4.9*(2 * x);
        System.out.println("The height of the object is : "+ h +" meters");

    }
}