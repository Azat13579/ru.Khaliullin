package Modification.task6_2M;

public class CalculatorDoubleM implements CalculatorM{


    public static double add(double x, double y){
        double z = 0;
        z =  x + y;
        return z;
    }

    public static double sub(double x, double y){
        double z = 0;
        z =  x - y;
        return z;
    }

    public static double mux(double x, double y){
        double z = 0;
        z =  x * y;
        return z;
    }

    public static double div(double x, double y){
        double z = 0;
        z =  x / y;
        return z;
    }

    public static double percentage(double x, double y){
        double z = 0;
        z =  (x * y)/100;
        return z;
    }



}
