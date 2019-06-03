class First{
    int X;
    int Y;
}

class ObjectCreate {
    public static void main(String xyz[]) {
    First ref;
    ref=new First();
    ref.X=15;
    ref.Y=20;
    System.out.println(ref.X + ref.Y);
    }
}