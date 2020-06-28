package pl.sda;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainOwnKey {
    public static void main(String[] args) {
        Map<Author, List<String>> titlesPerAuthor = new HashMap<>();
        Author author1 = new Author("Krzysztof", "Krawczyk");
        Author author2 = new Author("Krzysztof", "Krawczyk");


        titlesPerAuthor.put(author1, List.of("Parstatek"));
        titlesPerAuthor.put(author2, List.of("Chciałem być"));

        for (Map.Entry<Author, List<String>> authorListEntry : titlesPerAuthor.entrySet()) {
            System.out.println(authorListEntry.getKey() + " " + authorListEntry.getValue());
        }
    }
}
