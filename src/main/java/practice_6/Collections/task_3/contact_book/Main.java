package practice_6.Collections.task_3.contact_book;

public class Main {
    public static void main(String[] args) {
        ContactBook contactBook = new ContactBook();
        contactBook.addContact("Никита", 1233);
        contactBook.addContact("Коля", 2344);

        contactBook.printContact();

        contactBook.updatePhone("Коля", 2543);
        contactBook.printContact();


    }

}
