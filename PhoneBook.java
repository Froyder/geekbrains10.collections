package ru.geek.homeworks.lesson10.collections;

import java.util.Map;
import java.util.TreeMap;

public class PhoneBook extends TreeMap {

    private TreeMap<Integer, String> phoneBook = new TreeMap<>();

    //метод для добавления контакта
    public void addContact(Integer phone, String name) {
        phoneBook.put(phone, name);
    }

    //метод для поиска телефона по фамилии
    public void getPhone (String naim) {
        for (Map.Entry<Integer, String> temp : phoneBook.entrySet()) {
            if (temp.getValue() == naim) {
                System.out.println("Поиск по фамилии " + temp.getValue() + " дал следующий результат: "+ temp.getKey());
            }
        }
    }

    //печать справочника
    public void printBook () {
        for (Map.Entry<Integer, String> temp : phoneBook.entrySet()) {
            System.out.println("Номер телефона: " + temp.getKey() + ", фамилия - " + temp.getValue());
        }
    }

}