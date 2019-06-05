class maths{
    public void Addition(int A, int B) {
        int Result= A+B;
        System.out.println("Result:"+Result);
        }
    public void Substraction(int A, int B) {
        System.out.println(A-B);
        }
}

class maths2 extends maths{
    public void Multiplication(int A, int B) {
        int Result= A*B;
        System.out.println("Result:"+Result);
        }
    public void Substraction(int X, int Y) {
        int Result= X-Y;
        System.out.println("Result:"+Result);
        }
}

class Inheritance{
    public static void main(String X[]) {
        maths2 num= new maths2();
        num.Multiplication(5,10);
    }
}