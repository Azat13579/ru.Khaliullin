package task3;

public class MultiplicationTable {
    static int f;
    public static void main(String[] args) {
        for (int i = 1; i <=10; i++) {
            for (int j = 1; j <=10; j++){
                f = i*j;
                System.out.println(i+"*"+j+"="+f);
            }

        }
    }
}
