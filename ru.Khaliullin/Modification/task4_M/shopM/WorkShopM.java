package Modification.task4_M.shopM;


import java.util.ArrayList;

public class WorkShopM {
    public static void main(String[] args) {
        LogistM fedor =  new LogistM("Фёдор","Михайлович",122);
        LogistM semen =  new LogistM("Семён","Кандратьевич",125);
        LogistM michael =  new LogistM("Михаил","Исиорхович",126);

        LogisticsDepartmentM ld =  new LogisticsDepartmentM("Отдел логистики!",
                                                             (new LogistM[3]));

        Department []dM =  new Department[5];
        dM[1] = ld;

        fedor.setResponsibility("Поиск продуктов по дешевле. ");
        semen.setResponsibility("Поиск покупателей по богаче. ");
        michael.setResponsibility("Поиск рабочих для других отделов.");

        fedor.setSalary(500);
        semen.setSalary(500);
        michael.setSalary(700);

        fedor.setSubordinateList("Нет подчиненных");
        semen.setSubordinateList("Нет подчиненных");
        michael.setSubordinateList("Семён");

       // System.out.println(dM[1]);

        //System.out.println(ld);
        String[] listOfWorkers = new String[50];
        listOfWorkers [0] = (fedor.getFirstName()+ " " + fedor.getLastName());
        listOfWorkers [9] = (semen.getFirstName()+ " " + semen.getLastName());
        listOfWorkers [6] = (michael.getFirstName()+ " " + michael.getLastName());


        WorkingStaffM wSM = new WorkingStaffM( listOfWorkers, dM);
        System.out.println(wSM);

    }
}
