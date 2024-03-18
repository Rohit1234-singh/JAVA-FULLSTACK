public class EvenOdd {
    static int  EvenOdd(int n){
        if(n%2==0){
            System.out.println("This is an Even num");
        } else{
            System.out.println("this is an odd num");
        }
        return n;
    }
    public static void main(String[] args) {
        int c= EvenOdd(11);
        System.out.println(c);
    }
}
