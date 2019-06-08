package task22;

import java.util.Comparator;

public class PersonComparatorName implements Comparator <PersonSimple>{

    public int compare(PersonSimple a, PersonSimple b){
        if(a.getName().equals(b.getName())) {
            return a.getAge().compareTo(b.getAge());
        }else{
            return a.getName().compareTo(b.getName());
        }
    }

}
