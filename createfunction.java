class Maths{
    public void Addition(int A, int B){
        int Result;
        Result= A + B;
        System.out.println("Result:"+Result);
    }
    public int Subtraction(int A,int B){
        int answer;
        answer= A - B;
        return answer;
    }
}
class createfunction{
    public static void main(String xyz[]) {
        Maths X;
        X = new Maths();
        X.Addition(2,10);
        System.out.println("Result:"+ X.Subtraction(100,5));        
    }
}