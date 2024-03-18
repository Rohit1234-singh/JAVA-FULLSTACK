package com.Newsb;

public class Main {

    public static void main(String[] args) {
	// write your code here
        StringBuilder sb= new StringBuilder("Rohit");
       System.out.println(sb);

        // char at index 0;
        System.out.println(sb.charAt(0));

        // set char at index;
        sb.setCharAt(0,'S');
        System.out.println(sb);

        // append the chat at index ;
        sb.insert(2,"M");
        System.out.println(sb);

        // delete the specific index
        sb.delete(2,3);
        System.out.println(sb);

        //append mean it will add from the last like r after will add o result : ro like
          sb.append("S");
        sb.append("i");
        sb.append("n");
        sb.append("g");
        sb.append("h");
        System.out.println(sb);

        // length of string
      //  System.out.println(sb.length());

        // reverse the string

        for (int i = 0; i <sb.length()/2 ; i++) {
            int front=i;
            int back=sb.length()-1-i;

            // calculate the character
            char frontChar= sb.charAt(front);
            char backChar= sb.charAt(back);

            // replace the character
            sb.setCharAt(front,backChar);
            sb.setCharAt(back,frontChar);
        }
        System.out.println(sb);
    }
}
