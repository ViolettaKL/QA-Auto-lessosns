package practice_7.library;

import java.util.List;

public class Library {
    private List<Book> books;
    //добавлять книгу
    // Обработка исключения: если мы добавляем существую книгу, то
    // мы получаем непроверяемое исключение InvalidBookException


    //искать книгу
    // Обработка исключения: если мы не можем найти книгу,
    // то случится проверяемое исключение BookNotFoundException
}
