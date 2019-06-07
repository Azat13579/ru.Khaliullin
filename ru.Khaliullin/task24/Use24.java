package task24;

import java.util.*;

public class Use24 {
    public static void main(String[] args) {

        String[] s = new String[]{"foo", "buzz", "bar", "fork", "bort", "spoon", "!", "dude"};

        Set<String> set = new HashSet<>(Arrays.asList(s));
        System.out.println(set);

        Set<String> set1 = removeEvenLength(set);
        System.out.println(set1);

    }

    private static Set<String> removeEvenLength(Set<String> set) {

        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            if ((it.next().length() % 2) == 0) {
                it.remove();
            }
        }
        return set;
    }

}
