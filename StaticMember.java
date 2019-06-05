class Bank{
    static int Dollar;
    public void SetDollar(int A){
        Dollar=A;
        }
    public void Amount(int B){
        System.out.println("Amount is "+(B*Dollar));
    }
}

class StaticMember{
    public static void main(String xyz[]) {
        Bank HSBC,Natwest,NBS;
        
        HSBC=new Bank();
        Natwest=new Bank();
        NBS=new Bank();

        HSBC.SetDollar(100);
        NBS.Amount(2);
        NBS.SetDollar(50);
        Natwest.Amount(2);    
    }
}