package task22;

import java.util.Comparator;

public class PersonComparatorAge implements Comparator <PersonSimple> {
    public int compare(PersonSimple a, PersonSimple b){
        return a.getAge().compareTo(b.getAge());

    }
}
