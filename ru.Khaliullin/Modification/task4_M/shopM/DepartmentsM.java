package Modification.task4_M.shopM;

import task4.shop.Departments;

import java.util.ArrayList;
import java.util.Arrays;

public class DepartmentsM {

    private Department[] departments ;

    public DepartmentsM(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public String toString() {
        return "DepartmentsM{" +
                "departments=" + Arrays.toString(departments) +
                '}';
    }
}

