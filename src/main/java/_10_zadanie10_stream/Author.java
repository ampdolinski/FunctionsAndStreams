package _10_zadanie10_stream;

public class Author {

    private String name;
    private String surname;
    private OriginCountry originCountry;

    public Author(String name, String surname, OriginCountry originCountry) {
        this.name = name;
        this.surname = surname;
        this.originCountry = originCountry;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public OriginCountry getOriginCountry() {
        return originCountry;
    }

    public void setOriginCountry(OriginCountry originCountry) {
        this.originCountry = originCountry;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", originCountry='" + originCountry + '\'' +
                '}';
    }
}
