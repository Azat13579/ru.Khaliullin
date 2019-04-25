package task5;

public enum Drinks {
    COCA("Coca",7), FANTA("Fanta",4), SPRITE("Sprite",5),
    KOFFIE("Koffie",10), JUICE ("Juice",500);

    String Drink;
    int price;

    Drinks(String drink,int price) {
        Drink = drink;
        this.price = price;
    }



    public String getDrink() {
        return ( Drink + " (" + price + " руб.)");
           }


    @Override
    public String toString() {
        return "Drinks{" +
                "Drink='" + Drink + '\'' +
                ", price=" + price +
                "} " + super.toString();
    }
}

