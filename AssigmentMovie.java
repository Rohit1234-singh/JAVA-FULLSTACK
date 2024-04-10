import java.util.Locale;

class Movies{
    String movieName;
    String company;
    String genre;
    int budget;

    Movies(String movieName,String company,String genre,int budget){
        this.movieName=movieName;
        this.company=company;
        this.genre=genre;
        this.budget=budget;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }
}
 class Solution{
    public static Movies[] getMoviesByGenre(Movies[] movies, String searchGenre){
        searchGenre=searchGenre.toLowerCase();
        int c=0;
        for(Movies movies1:movies){
            if(movies1.getGenre().toLowerCase().equals(searchGenre)){
                c++;
            }
        }
        Movies[] ms= new Movies[c];
        int i=0;
        for(Movies movies1:movies){
            if(movies1.getGenre().toLowerCase().equals(searchGenre)){
                    ms[c++]=movies1;
            }
        }
        return ms;
    }
 }
public class AssigmentMovie {
    public static void main(String[] args) {
            Movies[] m1= new Movies[4];
            m1[1]=new Movies("Animal","Paramount Pictute","Violent",500000000);
            m1[2]=new Movies("Jawan","Paramount Pictute","Action",800000000);
            m1[3]=new Movies("Dunki","Paramount Pictute","Drama, Love Stoty",300000000);
            m1[4]=new Movies("Way Of The Water","Paramount Pictute","Action",500000000);
           // m1[5]=new Movies("Kabir Singh","Paramount Pictute","Drama",200000000);

            String srGnr=" scifi";
            Movies[] getMoviesByGenre= Solution.getMoviesByGenre(m1,srGnr);
            for (Movies movies:getMoviesByGenre){
                if(movies.getBudget()>80000000){
                    System.out.println(movies.getMovieName()+"High Budget Movie");
                } else{
                    System.out.println(movies.getMovieName()+"Low Budget Movie");
                }
            }

    }
}
