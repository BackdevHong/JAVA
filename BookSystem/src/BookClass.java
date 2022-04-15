public class BookClass {
    String title;
    int star;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }

    public BookClass(String title, int star) {
        this.title = title;
        this.star = star;
    }

}
