import java.util.Scanner;

public class Subtraction {
    int twoSubNum(int a, int b){
        int sub= a-b;
        return sub;
    }
    public static void main(String[] args) {
        Subtraction obj= new Subtraction();
        Scanner n= new Scanner(System.in);
        int x= n.nextInt();
        int y= n.nextInt();

        int ans= obj.twoSubNum(x,y);
        System.out.println("print the two subtraction number "+ ans);

    }
}
