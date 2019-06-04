import jdk.jfr.Percentage;

class college{
    private int Phy,Che,total;float per;
    
    private void calculations(){
        total=Phy + Che;
        per= total * 100/300;
    }
    
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
   
    public void ShowResults(){
        if (Che==-1 || Phy==-1)
            {
            System.out.println("No Result");
            }
        else{
            calculations();
            System.out.println("Total Marks: "+ total);
            System.out.println("Percentage: "+ per);
            }
        }
    }
    
    class privateclass2{
        public static void main(String xyz[]){
        college ABC;
        ABC = new college();
        ABC.Physics(50);
        ABC.Chemistry(70);
        ABC.ShowResults();
        }
    }