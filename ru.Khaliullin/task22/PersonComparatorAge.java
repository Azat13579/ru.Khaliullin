package task22;

import java.util.Comparator;

public class PersonComparatorAge implements Comparator <PersonSimple> {


    public int compare(PersonSimple a, PersonSimple b){
        if(a.getAge().equals(b.getAge())) {
           return a.getName().compareTo(b.getName());
        }else{
            return a.getAge().compareTo(b.getAge());
        }
    }

}
