import java.util.ArrayList;
import java.util.List;

public class DuplicatesList {
    public static void main(String[] args) {
        List<Integer> num=List.of(1,4,7,2,77,2,1,8,6,9,10,1);
        System.out.println("List of Number" + num);
        List<Integer> Dublicate= new ArrayList<>();
//        Dublicate.add(2);
//        Dublicate.add(58);-++++++++
//        Dublicate.add(20);
//        Dublicate.add(2);
//        System.out.println(Dublicate);

        for (int i = 0; i < num.size() ; i++) {
            if(!Dublicate.contains(num.get(i))){
                Dublicate.add(num.get(i));
            }
        }
        System.out.println("Duplicate number are: "+ Dublicate);
    }
}
