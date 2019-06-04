package task22;

import java.util.Comparator;

public class PersonComparatorName implements Comparator <PersonSimple>{

    public int compare(PersonSimple a, PersonSimple b){
        return a.getName().compareTo(b.getName());

    }



}
