abstract class draw{
    abstract public void drawing();      
}

class line extends draw{
    public void drawing() {
        System.out.println("Drawing Line");
    }
}

class circle extends draw{
    public void drawing() {
        System.out.println("Drawing Circle");
    }
}

class testabstract2{
public static void main(String x[]) {
    line l = new line();
    LetsDraw(l);
    circle c = new circle();
    LetsDraw(c);   
    }
    public static void LetsDraw(draw D) {
        D.drawing();
    }
}