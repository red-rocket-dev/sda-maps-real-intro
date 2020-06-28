package pl.sda;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Song song1 = new Song("Ich troje", "Powiedz", "Powiedz, powiedz czemu");
        Song song2 = new Song("Maryla Rodowicz", "Wsiasc do pociagu", "Wsiasc do pociagu");
        Song song3 = new Song("Maryla Rodowicz", "Konik na biegunach", "Konik na biegunach");


        System.out.println("Listy:");
        List<Song> songsList = new ArrayList<>();
        songsList.add(song1);
        songsList.add(song2);
        songsList.add(song3);
        //tutaj dostalbym wyjatek, bo nie ma klucza 1 (a zeby byla mozliwosc wstienia na pozycji 2 musi byc cos wczesniej)
        //songsList.add(2, song);
        System.out.println(songsList.get(0));
        // System.out.println(songsList.get(1)); -> wyjatek


        System.out.println("Podaj autora");


        /*
        Zamiast filtrowac liste za kazdym razem kiedy czegos szukamy
        lepiej raz przygotowac mape i z niej korzystac
        for (Song song : songsList) {
            if(song.getAuthor().equals(author)) {
                System.out.println(song);
            }
        }*/



        /*
        songsArray["Ich troje"] = song1;
        songsArray["Maryla Rodowicz"] = song2;

        songsArray["Maryla Rodowicz"]
        Kod ponizej jest odpowiednikiem tego, z tym ze w tablicach nie mozemy miec jako indeksu Stringa

         */



        // to robie na poczatku aplikacji
        Map<String, List<Song>> songsPerAuthor = new HashMap<>();
        for (Song song : songsList) {
            String authorKey = song.getAuthor();

            List<Song> songsOfAuthor;
            if(songsPerAuthor.containsKey(authorKey)) { //TODO: to troche inaczej\
                // nie mam autora w mapie to:
                songsOfAuthor = songsPerAuthor.get(authorKey);
            } else {
                songsOfAuthor = new ArrayList<>();
                songsPerAuthor.put(authorKey, songsOfAuthor);
            }
            songsOfAuthor.add(song);
            // put sluzy do wstawiania
            // author -> obiekty piosenek
            // Ich troje -> {<piosenka ich troje>}
            // Maryla Rodowicz -> {<konik na biegunach>, <wsiasc do pociagu>}
        }

        Scanner scanner = new Scanner(System.in);
        // a pozniej ile razy chce szybko odpytuje o autora
        String author = scanner.nextLine();
        System.out.println(songsPerAuthor.get(author));
        System.out.println(songsPerAuthor.size());

        // entrySet() <- to mi zwraca Set z parami klucz, wartość. W naszym przypadku to będzie Set zawierający pary autor i jego piosenki
        //TODO: kontrakt hashCode, equals


        //put dodaje element do mapy



        // dygresja - lista dwuwymiarowa
        // List<List<String>> abc = new LinkedList<>();
        // String[][] x = new String[10][];

    }
}
