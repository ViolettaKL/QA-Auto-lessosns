package HW_3;

public class Library {

    private static String bookTitle;
    protected static String author;
    static int year;
    public static String category;

    public Library(String bookTitle, String author, int year, String category) {
        Library.bookTitle = bookTitle;
        Library.author = author;
        Library.year = year;
        Library.category = category;
    }


    public static String getBookTitle() {
        return bookTitle;
    }

    public static String getAuthor() {
        return author;
    }

    public static int getYear() {
        return year;
    }

    public static String getCategory() {
        return category;
    }

    public static void setBookTitle(String bookTitle) {
        Library.bookTitle = bookTitle;
    }

    public static void setAuthor(String author) {
        Library.author = author;
    }

    public void setYear(int year) {
        Library.year = year;
    }

    public void setCategory(String category) {
        Library.category = category;
    }
}
