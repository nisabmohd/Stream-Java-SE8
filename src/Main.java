import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    static List<Movie> list;

    static {
        list = List.of(
                new Movie("en", "Shawshank Redemption", 278, 9.3f),
                new Movie("en", "Whiplash", 244786, 7.3f),
                new Movie("en", "The Godfather", 238, 9.1f),
                new Movie("ja", "千と千尋の神隠し", 129, 7.9f)
        );
    }

    public static void main(String[] args) {
        // filter method
        List<Movie> filtered=list.stream().filter((movie)-> movie.getRatings()>9).toList();
        System.out.println(filtered);

        // map
        List<Long> ids=list.stream().map((item)->item.getId()).toList();
        System.out.println(filtered);

        // concat
        List<Movie> temp=new ArrayList<>();
        List<Movie> conacatinated=Stream.concat(temp.stream(),filtered.stream()).toList();

    }
}