package Modification.task4_M.shopM;

public class Department {
    private String title;

    public Department(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Department{" +
                "title='" + title + '\'' +
                "} \n" ;
    }
}
