package Modification.task5_M;

public enum DrinksM {

    COCA("Coca",7), FANTA("Fanta",4), SPRITE("Sprite",5),
    KOFFIE("Koffie",10), JUICE ("Juice",500);

    String DrinkM;
    int priceM;

    DrinksM(String drink,int price) {
        DrinkM = drink;
        this.priceM = price;
    }



    public String getDrink() {
        return ( DrinkM + " (" + priceM + " руб.)");
    }


    @Override
    public String toString() {
        return "Drinks{" +
                "Drink='" + DrinkM + '\'' +
                ", price=" + priceM +
                "} " + super.toString();
    }
}
