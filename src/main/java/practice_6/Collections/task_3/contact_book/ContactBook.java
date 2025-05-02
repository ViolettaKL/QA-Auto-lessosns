package practice_6.Collections.task_3.contact_book;

import java.util.HashMap;

public class ContactBook {
    // ключ значение (имя - телефон)
    private HashMap<String, Integer> contacts;

    public ContactBook(){
        this.contacts = new HashMap<>(); //создаем пустую телефонную книгу
    }

    // добавить контакт
    public void addContact(String name, Integer phone){
        contacts.put(name, phone);
    }

    // поиск контакта по имени
    public Integer getPhone(String name){
        return contacts.get(name);
    }

    // обновление телефона по имени
    public void updatePhone(String name, Integer updatedPhone){
        contacts.put(name, updatedPhone);
    }

    public void printContact(){
        System.out.println("Все контакты:");
        contacts.forEach(
                (name, phone) -> {
                    System.out.println("имя " + name + ", телефон " + phone);
                }
        );
        System.out.println();
    }
}
