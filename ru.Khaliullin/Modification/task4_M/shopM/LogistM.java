package Modification.task4_M.shopM;

public class LogistM extends PersonM {
    private String subordinateList;
    private String responsibility;
    private int salary;

    public LogistM(String firstName, String lastName, int identificationNumber) {
        super(firstName, lastName, identificationNumber);
    }

    public String getSubordinateList() {
        return subordinateList;
    }

    public void setSubordinateList(String subordinateList) {
        this.subordinateList = subordinateList;
    }

    public String getResponsibility() {
        return responsibility;
    }

    public void setResponsibility(String responsibility) {
        this.responsibility = responsibility;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return  super.toString() + "LogistM{" +
                "subordinateList='" + subordinateList + '\'' +
                ", responsibility='" + responsibility + '\'' +
                ", salary=" + salary +
                "} \n\n" ;
    }
}
