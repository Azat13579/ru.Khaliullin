package task21.n1;

public class ArrayShuffle {

    private static int nElems1 = 5;
    private static int nElems2 = 10;
    private static long a[][] = new long[nElems1][nElems2];

    public static void arrayFillAndDisplay() {
        System.out.println("||--------------------------------------------------------------||");

        int c = 0;
        for (int j = 0; j < nElems1; j++) {
            for (int i = 0; i < nElems2; i++) {

                a[j][i] = c;
                c++;

                output(j, i);
            }
        }
        System.out.println("||--------------------------------------------------------------||");
        System.out.println("");
        System.out.println("||--------------------------------------------------------------||");

    }


    public static void toLeft() {
        int j;
        int i;
        for (j = 0; j < nElems1; j++) {
            for (i = 0; i < nElems2; i++) {
                if (i == (nElems2 - 1)) {
                    a[j][(nElems2 - 1)] = 0;
                } else {
                    a[j][i] = a[j][i + 1];
                }

            }
        }
        System.out.println("||--------------------------------------------------------------||");
    }

    private static void output(int j, int i) {
        System.out.print("a[" + j + "][" + i + "] = " + a[j][i]);
        System.out.println("");
    }

    public static void display() {
        System.out.println("||--------------------------------------------------------------||");

        for (int j = 0; j < nElems1; j++) {
            for (int i = 0; i < nElems2; i++) {
                System.out.printf("%4d", a[j][i]);
            }
            System.out.println();
        }
        System.out.println("||--------------------------------------------------------------||");
        System.out.println("");
        System.out.println("||--------------------------------------------------------------||");

    }

}




