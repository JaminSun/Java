class results{
private int Phy,Che,Mat;

public void Physics(int P){
    if (P>=0 && P<=150)
        {
        Phy=P;
        }
    else{
        Phy=-1;
        System.out.println("Invalid Physics Marks");
        }
    }

public void Chemistry(int C){
    if (C>=0 && C<=150)
        {
        Che=C;
        }
    else{
        Che=-1;
        System.out.println("Invalid Chemistry Marks");
        }
    }

public void Maths(int M){
    if (M>=0 && M<=150)
        {
        Mat=M;
        }
    else{
        Mat=-1;
        System.out.println("Invalid Maths Marks");
        }
    }

public void ShowResults(){
    int total;
    if (Phy==-1 || Che==-1 || Mat==-1)
        {
        System.out.println("No Results");
        }
    else{
        total = Phy + Che + Mat;
        System.out.println("Total Score: "+ total);        
        }
    }
}

class Invalidinput{
    public static void main(String xyz[]){
        results Peter, James;

        Peter = new results();
        James = new results();

        Peter.Physics(50);
        Peter.Chemistry(990);
        Peter.Maths(80);
        Peter.ShowResults();

        James.Physics(100);
        James.Chemistry(60);
        James.Maths(80);
        James.ShowResults();
    }
}