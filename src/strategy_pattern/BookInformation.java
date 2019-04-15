package strategy_pattern;

public class BookInformation {

    private String Author;
    private String Title;
    private int YearPublished;
    private String Summary;

    public BookInformation() { }

    public BookInformation(String title, String author, int yearPublished, String summary) {
        this.Author = author;
        this.Title = title;
        this.YearPublished = yearPublished;
        this.Summary = summary;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        this.Author = author;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        this.Title = title;
    }

    public int getYearPublished() {
        return YearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.YearPublished = yearPublished;
    }

    public String getSummary() {
        return Summary;
    }

    public void setSummary(String summary) {
        this.Summary = summary;
    }

}