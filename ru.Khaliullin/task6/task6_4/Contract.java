package task6.task6_4;

import java.util.Arrays;

public class Contract {
    String title;
    int numberOfContract;
    String date;
    String productList[];

   public Contract(String title, int numberOfContract, String date) {
        this.title = title;
        this.numberOfContract = numberOfContract;
        this.date = date;
    }

    public Contract(String title, int numberOfContract, String date, String[] productList) {
        this.title = title;
        this.numberOfContract = numberOfContract;
        this.date = date;
        this.productList = productList;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfContract() {
        return numberOfContract;
    }

    public void setNumberOfContract(int numberOfContract) {
        this.numberOfContract = numberOfContract;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String[] getProductList() {
        return productList;
    }

    public void setProductList(String[] productList) {
        this.productList = productList;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "title='" + title + '\n' +
                ", numberOfContract=" + numberOfContract + '\n' +
                ", date='" + date + '\n' +
                ", productList=" + Arrays.toString(productList) +
                '}';
    }



}


