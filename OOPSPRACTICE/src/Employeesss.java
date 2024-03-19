
class Employ{
    String name;
    int year;
    double salary;
    String address;

    Employ(String nm, int y,double money,String add){
        name=nm;
        year=y;
        salary=money;
        address=add;
    }
    void display(){
        System.out.println(name+" "+year+" "+salary+" "+address);
    }
}
public class Employeesss {
    public static void main(String[] args) {
    Employ em= new Employ("Rohit",1994,37500.75,"64C-Punjab");
    Employ em1=new Employ("Tushar",2000,42750.85,"68D-New Delhi");
    Employ em2= new Employ("Mikha",2004,38785.25,"26B-Vizag");

    em.display();
    em1.display();
    em2.display();
    }
}
