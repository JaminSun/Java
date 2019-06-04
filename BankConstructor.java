class Bank{
    private int amount;
    public void Deposit(int money){
        amount+=money;
    }
    public void withdraw(int money){
        if(money<amount){
            amount-=money;
        }
        else{
            System.out.println("Not enough funds!");
        }
    }
    public void balance(){
        System.out.println("Your Balance is: "+amount);
    }
    public Bank(){
        System.out.println("hello my friend");
    }
}

class BankConstructor{
    public static void main(String xyz[]) {
        Bank Ref;
        Ref = new Bank();
    }
}