package HW_2;

public class Book {
    String title;
    String autor;

    Book(String someTitle, String someAutor){
        this.title = someTitle;
        this.autor = someAutor;
    }

    String getTitle(){
        return  this.title;
    }
    String getAutor(){
        return  this.autor;
    }
    void setTitle(String newTitle){
        this.title = newTitle;
    }
    void setAutor(String newAutor){
        this.autor = newAutor;
    }
    void printInfo() {
        System.out.println("Название: " + this.title + ", Автор: " + this.autor);
    }
}
