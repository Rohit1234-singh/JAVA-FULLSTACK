public class PracticePyramid {
    public static void main(String[] args) {
        int n=4;
        int n1=5;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        for (int i = 1; i <=n ; i--) {
            for (int j = 0; j <=i ; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
