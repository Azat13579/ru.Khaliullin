package task4.shop;

import java.util.Arrays;

public class WorkingStaff {
    private String listOfWorkers;
    private Departments[] departments = new Departments[5];

    public WorkingStaff(String listOfWorkers) {
        this.listOfWorkers = listOfWorkers;
    }

    public String getListOfWorkers() {
        return listOfWorkers;
    }

    public void setListOfWorkers(String listOfWorkers) {
        this.listOfWorkers = listOfWorkers;
    }

    @Override
    public String toString() {
        return "WorkingStaff{" +
                "listOfWorkers='" + listOfWorkers + '\'' +
                ", departments=" + Arrays.toString(departments) +
                '}';
    }
}
