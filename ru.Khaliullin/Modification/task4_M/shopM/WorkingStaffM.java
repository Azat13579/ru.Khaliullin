package Modification.task4_M.shopM;


import java.util.Arrays;

public class WorkingStaffM {
    private String[] listOfWorkers;
    private Department[] department;

    public WorkingStaffM(String[] listOfWorkers, Department[] department) {
        this.listOfWorkers = listOfWorkers;
        this.department = department;
    }

    public String[] getListOfWorkers() {
        return listOfWorkers;
    }

    public void setListOfWorkers(String[] listOfWorkers) {
        this.listOfWorkers = listOfWorkers;
    }

    public Department[] getDepartment() {
        return department;
    }

    public void setDepartment(Department[] department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "WorkingStaffM{" +
                "listOfWorkers=" + Arrays.toString(listOfWorkers) +
                ", department=" + Arrays.toString(department) +
                '}';
    }
}
