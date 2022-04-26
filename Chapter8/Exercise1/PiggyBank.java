
class PiggyBank {
    private int total=0;

    public void addPennies(){
        total=total+1;
        System.out.println("A Penny is added to the Bank.");
    }
    public void addNickel(){
        total=total+5;
        System.out.println("A Nickle is added to the Bank.");
    }
    public void addDime(){
        total=total+10;
        System.out.println("A Dime is added to the Bank.");
    }
    public void addquarter(){
        total=total+25;
        System.out.println("A Quarter is added to the Bank.");
    }
    public void Withdraw(){
        total=0;
        System.out.println("Bank is now Empty.");
    }public void Print(){
        System.out.println("Total amount in Bank is ¢"+ total);
    }

    
}
