import java.util.*;

public class Movie {
    private String title;
    private String studio;
    private String rating;

    public Movie (String title, String studio, String rating){
        this.title=title;
        this.studio=studio;
        this.rating=rating;
    }

    public Movie(String title,String studio){
        this.title=title;
        this.studio=studio;
        this.rating="PG";
    }

    public static Movie[] getPG(Movie movieArray[]) {
        Movie moviePG[] = new Movie[movieArray.length];
        int j = 0;
        for (int i = 0; i < movieArray.length; i++)
            if (movieArray[i].rating.contains("PG"))
                moviePG[j++] = movieArray[i];
        return moviePG;
    }


    public static void main(String args[]){
        Movie movie = new Movie("Casino Royale","Eon Productions","PG-13");
    }
}
