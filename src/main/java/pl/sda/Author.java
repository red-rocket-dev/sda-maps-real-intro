package pl.sda;

public class Author {
    private String name;
    private String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }


    @Override
    public int hashCode() {
        return name.hashCode() + surname.hashCode();
    }

//1725122948
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Author) {
            Author otherAuthor = (Author) obj;
            return otherAuthor.getName().equals(this.getName())
                    && otherAuthor.getSurname().equals(this.getSurname());
        }
        return false;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
