package task6.task6_2;

public class Calculator {
    public static void main(String[] args) {
        PlayWithFinal add = new  PlayWithFinal();
        int X=5;
        int Y=9;
        int z = add(X,Y);
        System.out.println(z);
        double X1=X+0.5;
        double Y1=Y+0.9;
        double g = div(X1,Y1);
        System.out.println(g);
        int X2=500; // число (int) относительно которого нужно происвезсти орасчет процента
        int Y2=9; // сколько процентов (int) должно быть взято из числа
        int z2 = percentage(X2,Y2);

        System.out.println(z2);

        double X3=500; // число (double) относительно которого нужно происвезсти орасчет процента
        double Y3=9.8; // сколько процентов(double) должно быть взято из числа
        double z3 = percentage(X3,Y3);
        System.out.println(z3);
    }

    public static int add(int x, int y){
        int z = 0;
        z =  x + y;
        return z;
    }
    public static double add(double x, double y){
        double z = 0;
        z =  x + y;
        return z;
    }

    public static int sub(int x, int y){
        int z = 0;
        z =  x - y;
        return z;
    }

    public static double sub(double x, double y){
        double z = 0;
        z =  x - y;
        return z;
    }
    public static int mux(int x, int y){
        int z = 0;
        z =  x * y;
        return z;
    }

    public static double mux(double x, double y){
        double z = 0;
        z =  x * y;
        return z;
    }

    public static int div(int x, int y){
        int z = 0;
        z =  x / y;
        return z;
    }

    public static double div(double x, double y){
        double z = 0;
        z =  x / y;
        return z;
    }

    public static int percentage(int x, int y){
        int z = 0;
        z =  (x * y)/100;
        return z;
    }

    public static double percentage(double x, double y){
        double z = 0;
        z =  (x * y)/100;
        return z;
    }
}
