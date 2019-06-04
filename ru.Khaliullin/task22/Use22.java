package task22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
//import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.parseInt;


public class Use22 {
    public static void main(String[] args) throws IOException {

        /*List<Person> people = new ArrayList<>();
        people.add(new Person("Tom", 37));
        people.add(new Person("Nick", 34));
        people.add(new Person("Alice", 33));
        people.add(new Person("Bill", 35));*/


        List<PersonSimple> peopleSimple = new ArrayList<>();
        peopleSimple.add(new PersonSimple("Tom", 37));
        peopleSimple.add(new PersonSimple("Nick", 34));
        peopleSimple.add(new PersonSimple("Alice",33));
        peopleSimple.add(new PersonSimple("Bill",35));

        displayUpTo(peopleSimple);

        int n = userСhoice();

        sortSelection(peopleSimple, n);


        displayAfter(peopleSimple);
    }

    private static int userСhoice() {
        System.out.println("Выберете вид сортировки: \n" +
                "Если выберете вид сортировки по имени, нажмите: 1\n" +
                "Если выберете вид сортировки по возрасту, нажмите: 0 " );

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("");
        return n;
    }

    private static void sortSelection(List<PersonSimple> peopleSimple, int n) {
        if(n == 1) {
            Collections.sort(peopleSimple, new PersonComparatorName());
        }else if(n == 0) {
            Collections.sort(peopleSimple, new PersonComparatorAge());
        }
    }


    private static void displayUpTo( List<PersonSimple> people ) {
        for (PersonSimple person : people) {
            System.out.println(person.getName() + ", " + person.getAge());
        }
        System.out.println();
        System.out.println("People list");
        System.out.println();


    }

    private static void displayAfter(List<PersonSimple> people) {

        for (PersonSimple person : people) {
            System.out.println(person.getName() + ", " + person.getAge());
        }
        System.out.println();
        System.out.println("Sorted people list");

    }
}



