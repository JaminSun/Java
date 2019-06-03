class second{
    int phy,che;
    public void message(){
        System.out.println("hello");
        System.out.println("my friends");
    }
}

class test2{
    public static void main(String xyz[]){
    second X;
    X = new second();
    X.phy=75;
    X.message();
    System.out.println(X.phy);
    }
}