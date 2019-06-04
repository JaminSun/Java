class accounts{
    public void Tax(){
        System.out.println("Tax rate is: "+22.7);
        }
    public void Tax(int Salary){
        float T;
        T= Salary*22.7F/100;
        System.out.println("Your Tax is "+T);
    }    
    public void Tax(int Salary,float Tax_Rate){
        float T;
        T=Salary*Tax_Rate/100;
        System.out.println("Your Tax is "+T);
    }  
}

class MethodOverloading{
    public static void main(String xyz[]) {
        accounts Ref = new accounts();
        Ref.Tax();
        Ref.Tax(2000);
        Ref.Tax(2000,19);
    }
}