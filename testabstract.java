abstract class Calculations{
    abstract public void Tax(int Salary);
    public void msg() {
    System.out.println("hello my friends");   
    }


class Calculations2 extends Calculations{
    public void Tax(int Salary) {
        float Result;
        if(Salary>5000){
            Result = Salary*21/100;
        }
        else{
            Result = Salary*25/100;
        }
        System.out.println(Result);
        }
    }
}

class testabstract{
    public static void main(String x[]) {
        Calculations2 X = new Calculations2();
        X.Tax(6000);
        Calculations2 Y = new Calculations2();
        Y.msg();
            }
}
