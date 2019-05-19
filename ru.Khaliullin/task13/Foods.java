package task13;

public enum Foods {
    CARROT(1,"морковка"),
    APPLE(2,"яблоко"),
    MILK_SOUP(3,"молочный суп"),
    PORRIDGE(4,"каша"),
    BANANA(5,"банан"),
    POTATO(6,"жаренная картошка");

    int i;
    String food;


    Foods(int i, String food) {
        this.i = i;
        this.food = food;
    }

    public String getFood() {

        return this.food;
    }

    public String toString() {

        return "{ " +
                this.food  + " }";
    }
}
