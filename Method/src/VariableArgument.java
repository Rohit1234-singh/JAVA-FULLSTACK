public class VariableArgument {
    static int sum(int ...arr){
        int sums=0;
        for (int a:arr){
            sums+=a;
        }
        return sums;
    }
    public static void main(String[] args) {

        System.out.println("this number is from 4 and 5 " + sum( ...arr:4,5));
    }
}
