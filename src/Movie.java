public class Movie {
    private String language, title;
    private long id;
    private float ratings;

    public Movie(String language, String title, long id, float ratings) {
        this.language = language;
        this.title = title;
        this.id = id;
        this.ratings = ratings;
    }

    public String getLanguage() {
        return language;
    }

    public String getTitle() {
        return title;
    }

    public long getId() {
        return id;
    }

    public float getRatings() {
        return ratings;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "language='" + language + '\'' +
                ", title='" + title + '\'' +
                ", id=" + id +
                ", ratings=" + ratings +
                '}';
    }
}
