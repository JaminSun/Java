class Results{
    public static void main(String xyz[]) {
        int phy, che, mat, total;
        float per;
        phy=50;
        che=50;
        mat=100;
        total=phy+che+mat;
        per=total/100*450;
        System.out.println(total);
        System.out.println("Percentage: ");
        if(per>=60){
            System.out.println("You have passed");
        }
        if(per<60){
            System.out.println("You have failed");
        }
    }
}