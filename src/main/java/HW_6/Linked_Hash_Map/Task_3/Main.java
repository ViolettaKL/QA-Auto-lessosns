package HW_6.Linked_Hash_Map.Task_3;

public class Main {
    public static void main(String[] args) {
        BrowserHistory userStory = new BrowserHistory();
        userStory.addHistory("1", "Заголовок 1");
        userStory.addHistory("2", "Заголовок 2");
        userStory.addHistory("3", "Заголовок 3");
        userStory.addHistory("4", "Заголовок 4");
        userStory.addHistory("5", "Заголовок 5");
        userStory.addHistory("6", "Заголовок 6");
        userStory.addHistory("7", "Заголовок 7");
        userStory.addHistory("8", "Заголовок 8");
        userStory.addHistory("9", "Заголовок 9");
        userStory.addHistory("10", "Заголовок 10");
        userStory.addHistory("11", "Заголовок 11");

        userStory.displayHistory();
    }
}
