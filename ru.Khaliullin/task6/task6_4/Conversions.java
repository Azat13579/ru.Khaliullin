package task6.task6_4;

public class Conversions {
    public static void main(String[] args) {

        Contract contact1 = new Contract("Название контракта!", 1,
                "27.04.2019",new String[]{"ЁЖ","УЖ","ПАУКАН"});

        //contact1.setProductList(new String[]{"ЁЖ","УЖ","ПАУКАН"});

        System.out.println(Conversions.convert(contact1));
        System.out.println(" ");
        System.out.println(contact1);

    }


    public static Act convert(Contract CX){
        Act F;
        F = new Act(CX.getTitle(),CX.getNumberOfContract(), CX.getDate(),CX.productList);
        return F;
    }
}
