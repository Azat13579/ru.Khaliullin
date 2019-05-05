package Modification.task6_2M;

public class CalculatorIntM implements CalculatorM{

    public static int add(int x, int y){
        int z = 0;
        z =  x + y;
        return z;
    }


    public static int sub(int x, int y){
        int z = 0;
        z =  x - y;
        return z;
    }

    public static int mux(int x, int y){
        int z = 0;
        z =  x * y;
        return z;
    }

    public static int div(int x, int y){
        int z = 0;
        z =  x / y;
        return z;
    }

    public static int percentage(int x, int y) {
        int z = 0;
        z = (x * y) / 100;
        return z;
    }
   }
