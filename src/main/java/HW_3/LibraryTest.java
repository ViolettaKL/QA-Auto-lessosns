package HW_3;

public class LibraryTest {
    public static void main(String[] args) {
        //Задание 3
        Library library = new Library();

        //Проверка доступа к полям
        library.setBookTitle("Кладбище домашних животных");
        library.setAuthor("Стивен Кинг");
        library.setYear(2015);
        library.setCategory("Ужасы");

        System.out.println("Наименование книги: " + library.getBookTitle() + ", Автор: " + library.getAuthor() + " , Год выпуска: "
                + library.getYear() + ", Категория: " + library.getCategory());
    }
}
