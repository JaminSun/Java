class Manchester{
    public Manchester(int A){
        System.out.println("Hello 1");
    }
    public Manchester(int A, int B){
        System.out.println("Hello 2");
    }
}

class ConstructorOverload{
    public static void main(String xyz[]) {
        Manchester x = new Manchester(1,2);    
    }
}