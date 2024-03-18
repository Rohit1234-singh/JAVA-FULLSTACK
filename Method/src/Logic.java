public class Logic {
    static int logic(int a,int b){
        int c;
        if(a>b){
            c= (a+b)*2;
        } else{
            c=a-b;
        }
        return c;
    }
    public static void main(String[] args) {
        int x=9;
        int y=6;
        int z;
        z=logic(x,y);
        System.out.println(z);
    }
}
