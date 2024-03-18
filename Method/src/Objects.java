public class Objects {
    int nums(int a,int b){
        int c;
        c= a+b;
        return c;
    }
    public static void main(String[] args) {
        int x=5;
        int y=10;
        Objects ob= new Objects();
        int d= ob.nums(x,y);
        System.out.println(d);
    }
}
