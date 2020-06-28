package pl.sda;

public class Song {
    private String author;
    private String title;
    private String lyrics;


    public Song(String author, String title, String lyrics) {
        this.author = author;
        this.title = title;
        this.lyrics = lyrics;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getLyrics() {
        return lyrics;
    }

    @Override
    public String toString() {
        return "Song{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", lyrics='" + lyrics + '\'' +
                '}';
    }
}
