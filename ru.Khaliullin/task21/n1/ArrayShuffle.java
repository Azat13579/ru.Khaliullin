package task21.n1;

public class ArrayShuffle {

    private static int nElems1 = 4;
    private static int nElems2 = 4;
    private static long a[][]= new long[nElems1][nElems2];

    public static void display() {
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
        for ( j = 0; j < nElems1; j++) {
            for (i = 0; i < nElems2; i++) {

                if (j == 0 && i == 0) {

                    a[0][0] = a[j][i+1];
                    output(j, i);

                }else if(j == (nElems1-1) && i == (nElems2-1)){

                   a[(nElems1-1)][(nElems2-1)] = 0;
                    output(j, i);

                }else if(j != (nElems1-1) && i == (nElems2-1)){

                   a[j][(nElems2-1)] = 0;
                    output(j, i);

                }else{

                   a[j][i] = a[j][i+1];
                    output(j, i);

                }

            }
        }
        System.out.println("||--------------------------------------------------------------||");
    }

    private static void output(int j, int i) {
        System.out.print("a[" + j + "][" + i + "] = " + a[j][i]);
        System.out.println("");
    }

}




