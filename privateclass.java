class results{
private int Phy,Che,Mat;

public void Physics(int P){
    if (P>=0 && P<=150)
        {
        Phy=P;
        }
    else{
        System.out.println("Invalid Physics Marks");
        }
    }

public void Chemistry(int C){
    if (C>=0 && C<=150)
        {
        Che=C;
        }
    else{
        System.out.println("Invalid Physics Marks");
        }
    }

public void Maths(int M){
    if (M>=0 && M<=150)
        {
        Mat=M;
        }
    else{
        System.out.println("Invalid Physics Marks");
        }
    }

public void ShowResults(){
    int total;
    total = Phy + Che + Mat;
    System.out.println("Total Score: "+ total);
    if (total > 200)
        {
        System.out.println("Passed");
        }
    else{
        System.out.println("Failed");
        }
    }
}

class privateclass{
    public static void main(String xyz[]){
    results Peter;
    Peter = new results();
    Peter.Physics=50;
    Peter.Chemistry=70;
    Peter.Maths=80;
    Peter.ShowResults();
    }
}