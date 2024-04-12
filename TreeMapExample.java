import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer,String> tm= new TreeMap<>();
        tm.put(1,"Rohit");
        tm.put(2,"Singh");
        tm.put(3,"Mikha");
        tm.put(4,"Jena");
        for(Map.Entry m: tm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        tm.remove(3);
        System.out.println("after invoking remove()");
        for(Map.Entry m: tm.entrySet()){
            System.out.println(m.getKey()+" "+ m.getValue());
        }

        TreeMap<Integer,String> al= new TreeMap<>();
        al.put(3,"Mikha");
        al.put(5,"Tushar");
        al.put(6,"Gson");
        al.put(7,"Blesson");
        System.out.println("After Invoking putAll Method");
        al.putAll(tm);
        for(Map.Entry m: al.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
