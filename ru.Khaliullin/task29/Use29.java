package task29;

import java.util.*;

public class Use29 {
    public static void main(String[] args) {
        Map<String, PersonWithTask29> book = new HashMap<>();

        PersonWithTask29 person1 = new PersonWithTask29(29, "Петрова", "жен");
        PersonWithTask29 person2 = new PersonWithTask29(34, "Сидорова", "жен");
        PersonWithTask29 person3 = new PersonWithTask29(34, "Тихонова", "жен");
        PersonWithTask29 person4 = new PersonWithTask29(35, "Петров", "муж");
        PersonWithTask29 person5 = new PersonWithTask29(35, "Петров", "муж");

        book.put("Key1", person1);
        book.put("Key2", person1);
        book.put("Key3", person2);
        book.put("Key4", person3);
        book.put("Key5", person4);
        book.put("Key6", person5);


        System.out.println("До: ");
        display(book);

        removeTheDuplicates(book);
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.println("После: ");
        display(book);
    }

    private static void display(Map<String, PersonWithTask29> book) {
        for (Map.Entry entry : book.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: "
                    + entry.getValue());
        }
    }

    private static void removeTheDuplicates(Map<String, PersonWithTask29> map) {
        HashMap<String, PersonWithTask29> copy = new HashMap<String, PersonWithTask29>(map);
        for (Map.Entry<String, PersonWithTask29> pair : copy.entrySet()) {
            int freqeuncy = Collections.frequency(copy.values(), pair.getValue());
            if (freqeuncy > 1) {
                removeItemFromMapByValue(map, pair.getValue());
            }
        }
    }

    private static void removeItemFromMapByValue(Map<String, PersonWithTask29> map, PersonWithTask29 value) {
        Map<String, PersonWithTask29> copy = new HashMap<>(map);
        for (Map.Entry<String, PersonWithTask29> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
