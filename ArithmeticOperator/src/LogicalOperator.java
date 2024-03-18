public class LogicalOperator {
    public static void main(String[] args) {
        int a=3;
        int b=5;

        // && AND operators
        System.out.println(a==b && a<b);
        System.out.println(a!=b && a<b);

        // || OR operators
        System.out.println( a!=b || a>b);
        System.out.println(a>b || a==b);

       // ! NOT
        System.out.println(!(a==b));
        System.out.println(!(a<b));
    }
}
