package task4.shop;

import task4.shop_out.CountingRoomDepartment;
import task4.shop_out.SalesDepartment;

import java.util.Arrays;

public class Departments {
    private String title;

    private LogisticsDepartment[] LD= new LogisticsDepartment[1];

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LogisticsDepartment[] getLD() {
        return LD;
    }

    public void setLD(LogisticsDepartment[] LD) {
        this.LD = LD;
    }

    @Override
    public String toString() {
        return "Departments{" +
                "title='" + title + '\'' +
                ", LD=" + Arrays.toString(LD) +
                '}';
    }

    // private SalesDepartment[] SD = new SalesDepartment[0];

    //private CountingRoomDepartment CRD;

   /* public String getTitle() {
        return title;
    }

    public SalesDepartment[] getSD(SalesDepartment[] salesDepartments) {
        return SD;
    }

    public void setSD(SalesDepartment[] SD) {
        this.SD = SD;
    }

    public LogisticsDepartment getLD() {
        return LD;
    }

    public void setLD(LogisticsDepartment LD) {
        this.LD = LD;
    }

    public CountingRoomDepartment getCRD() {
        return CRD;
    }

    public void setCRD(CountingRoomDepartment CRD) {
        this.CRD = CRD;
    }

    public void setTitle(String title) {
        this.title = title;

    }

    @Override
    public String toString() {
        return "Departments{" +
                "title='" + title + '\'' +
                ", SD=" + SD +
                ", LD=" + LD +
                ", CRD=" + CRD +
                '}';
    }*/
}
