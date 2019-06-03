class results{
    int phy,che,mat;

    public void ShowResults(){
        int total;
        total = phy + che + mat;
        System.out.println("Total Score: "+ total);
        if (total > 200){
            System.out.println("Passed");
        }
        else {
            System.out.println("Failed");
        }
    }
}

class localvar{
    public static void main(String xyz[]){
    results peter, james;
    peter = new results();
    james = new results();
    peter.mat=50;
    peter.che=100;
    peter.phy=100;

    james.mat=70;
    james.che=65;
    james.phy=40;

    peter.ShowResults();
    james.ShowResults();  
    }
}