public class charAt {
    public static void main(String[] args) {
        String str="Rohit singh";
//        System.out.println(str.charAt(3));
//        System.out.println("this is the index of " + str.length());
//        int strLength= str.length();
//        System.out.println("this is an index of " +str.charAt(0));
//        System.out.println("this is an index of " + str.charAt(strLength-1));
        for (int i = 0; i<str.length(); i++) {
            if(i%2!=0){
                System.out.println(str.charAt(i));
            }
        }
    }
}
