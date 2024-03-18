public class SumTheOddNum {
    public static int sumOddNum(int n){
        int sum=0;
        for (int i = 1; i <=n ; i++) {
            if(i%2!=0){
                sum=sum+1;
            }
        }
    }
    public static void main(String[] args) {

    }
}
