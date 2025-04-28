package org.example;

import java.util.ArrayList;
import java.util.HashMap;

public class Phonebook {
    private final HashMap<String, ArrayList<String>> phonebook;
    private ArrayList<String> arrayNumberPhone;


    public Phonebook() {
        this.phonebook = new HashMap<>();
    }

    //добавление номера в телефонную книгу
    public void addNumberPhone(String surname, String phoneNumber) {
        if (phonebook.containsKey(surname)) {
            //System.out.println("Контакт с такой фамилией уже существует ! Добавим к нему этот номер");
            arrayNumberPhone.add(phoneNumber);
        } else {
            //System.out.println("Такого контакта еще нет ! Создадим");
            arrayNumberPhone = new ArrayList<>();
            arrayNumberPhone.add(phoneNumber);
            phonebook.put(surname, arrayNumberPhone);
        }
    }

    //поиск по фамилии
    public void getNumberPhone(String surname) {
        phonebook.get(surname);
        if (phonebook.get(surname) == null) {
            System.out.println("Контакта с фамилией «" + surname + "» не найден!");
        } else {
            System.out.println("По фамилии «" + surname + "» найдены номер(а): " + phonebook.get(surname));
        }
    }

    public void getPhoneBook() {
        System.out.println("Телефонная книга: " + phonebook);
    }
}
