package task25.n1;

import java.util.*;

public class Use25_1 {
    public static void main(String[] args) {
        Map<String, String> listNamesAndLastnames = new HashMap<>();

        System.out.println(isUnique(listNamesAndLastnames));

        listNamesAndLastnames.put("Вася", "Иванов");
        listNamesAndLastnames.put("Петр", "Петров");
        listNamesAndLastnames.put("Виктор", "Сидоров");
        listNamesAndLastnames.put("Сергей", "Савельев");
        listNamesAndLastnames.put("Вадим", "Викторов");

        System.out.println(isUnique(listNamesAndLastnames));

        listNamesAndLastnames.put("Виктор", "Иванов");
        System.out.println(isUnique(listNamesAndLastnames));
    }

    private static boolean isUnique(Map<String, String> map) {
        boolean x = true;

        if (map.isEmpty()) {
        } else {
            String[] s = new String[map.size()];
            creatingAnArrayOfMapValues(map, s);

            x = comparisonOfAllElementsInTheArray(map, x, s);
        }
        return x;
    }

    private static boolean comparisonOfAllElementsInTheArray(Map<String, String> map, boolean x, String[] s) {
        for (int i = 0; i < map.size() - 1; i++) {
            for (int i1 = 0; i1 < map.size(); i1++) {
                if (i != i1) {
                    if (s[i].equals(s[i1])) {
                        x = false;
                    }
                }
            }
        }
        return x;
    }

    private static void creatingAnArrayOfMapValues(Map<String, String> map, String[] s) {
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        for (int i = 0; i < map.size(); i++) {
            if (iterator.hasNext()) {
                Map.Entry<String, String> entry = iterator.next();
                s[i] = entry.getValue();
            }
        }
    }
}
