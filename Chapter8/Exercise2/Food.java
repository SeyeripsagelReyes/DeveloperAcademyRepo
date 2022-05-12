/*  Item            Price   Fat(g)  Carbohydrates(g)    Fiber(g)
    hamburger       $1.85   9       33                  1
    salad           $2.00   1       11                  5
    french fries    $1.30   11      36                  4
    soda            $0.95   0       38                  0           */

import java.text.DecimalFormat;
class Food {
    
    private double price, total;
    private double fat, carbs, fiber;
    private String name;
    DecimalFormat f = new DecimalFormat("##.00");

    public void BORGER() {
        name    = "Hamburger"; 
        price   = 1.85;
        fat     = 9;
        carbs   = 33;
        fiber   = 1;
    }
    public void SALAD() {
        name    ="Salad";
        price   = 2.00;
        fat     = 1;
        carbs   = 11;
        fiber   = 5;
    }
    public void PRENSPRAYS() {
        name    ="Fries";
        price   = 1.30;
        fat     = 11;
        carbs   = 36;
        fiber   = 4;
    }
    public void COOK() {
        name    ="Coke";
        price   = 0.95;
        fat     = 0;
        carbs   = 38;
        fiber   = 0;
    }
    
    public int yum(int quants){
        total = total + price * quants;
        return quants;
    }

    public String print(String Purhint){
        Purhint = "Each "+ name +" has "+ fat +"g of fat, "+ carbs +"g of carbs, and "+ fiber +"g of fiber.\n";
        return Purhint;
    }

    public void awtput(){
        System.out.println("Your order comes to: $" + (f.format(total)));
    }
    
}
