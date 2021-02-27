package ru.geek.homeworks.lesson10.collections;

import java.util.*;

public class MainClassCollections {

    //метод принимет список и выдает в консоль его копию без дубликатов
    public static void removeCopies(ArrayList<String> list) {
        ListIterator<String> arrayIterator = list.listIterator();
        ArrayList<String> arrayListUnique = new ArrayList<>();

        while (arrayIterator.hasNext()) {
            String valueNext = arrayIterator.next();
            if (!arrayListUnique.contains(valueNext)) {
                arrayListUnique.add(valueNext);
            }
        }
        System.out.println(arrayListUnique);
    }

    //метод подсчитывает, сколько раз в списке встречается каждый элемент
    public static void countCopies (ArrayList<String> list) {
        HashMap<String, Integer> copiesCounter = new HashMap<>();
        for (String temp : list) {
            if (!copiesCounter.containsKey(temp)) {
                copiesCounter.put(temp, 1);
            } else {
                copiesCounter.put(temp, copiesCounter.get(temp)+1);
            }
        }

        for (Map.Entry<String, Integer> temp : copiesCounter.entrySet()) {
            System.out.println(temp.getKey() + ": " + temp.getValue());
        }
    }

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("apple", "orange", "lemon", "banana", "apricot",
                                                                  "avocado", "broccoli", "apple", "kiwi", "melon",
                                                                  "pineapple", "pear", "orange", "cherry", "apricot"));

        System.out.println(arrayList);
        System.out.println();

        removeCopies(arrayList);
        System.out.println();

        countCopies(arrayList);
        System.out.println();

        //создаем телефонный справочник, проверяем работу его методов
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addContact(858324,"Леннон");
        phoneBook.addContact(898635,"Маккартни");
        phoneBook.addContact(866283,"Харрисон");
        phoneBook.addContact(873492,"Старр");
        phoneBook.addContact(486463,"Маккартни");
        phoneBook.addContact(454655,"Бест");
        phoneBook.addContact(338821,"Сатклиф");

        phoneBook.printBook();
        System.out.println();

        phoneBook.getPhone("Маккартни");

    }
}


/*

Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
Посчитать, сколько раз встречается каждое слово.

Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров.
В этот телефонный справочник с помощью метода add() можно добавлять записи,
а с помощью метода get() искать номер телефона по фамилии.
Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
тогда при запросе такой фамилии должны выводиться все телефоны.
Желательно не добавлять лишний функционал (дополнительные поля (имя, отчество, адрес),
взаимодействие с пользователем через консоль и т.д).
Консоль использовать только для вывода результатов проверки телефонного справочника.

 */