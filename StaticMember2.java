class Swindon2{
    int A;
    public static void msg(){
        A++;
        System.out.println(A);
    }
}

class StaticMember2{
    public static void main(String xyz[]) {
        Swindon2 x = new Swindon2();
        Swindon2.msg();   
   } 
}
