package challenges;

import java.util.*;

public class MovieStore {

    public Map<String , List<String>> getMovies(){
        List<String> ironManTranslations = new ArrayList<>();
        ironManTranslations.add("Żelazny człowiek");
        ironManTranslations.add("Iron Man");

        List<String> avengersTranslations = new ArrayList<>();
        avengersTranslations.add("Mściciele");
        avengersTranslations.add("Avengers");

        List<String> flashTranslations = new ArrayList<>();
        flashTranslations.add("Błyskawica");
        flashTranslations.add("Flash");

        Map<String, List<String>> booksTitlesWithTranslations = new HashMap<>();
        booksTitlesWithTranslations.put("IM", ironManTranslations);
        booksTitlesWithTranslations.put("AV", avengersTranslations);
        booksTitlesWithTranslations.put("FL", flashTranslations);

        return booksTitlesWithTranslations;
    }

    public static void main(String[] args) {
        MovieStore store = new MovieStore();

        Map<String,List<String>> map = store.getMovies();
        map.entrySet().stream()
                .flatMap(title->title.getValue().stream())
                .map(n-> n +"!")
                .forEach(System.out::print);

    }



}
