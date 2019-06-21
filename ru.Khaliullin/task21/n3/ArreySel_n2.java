package task21.n3;

public class ArreySel_n2 {
    private long[] a;
    private int nElems;

    //--------------------------------------------------------------
    public ArreySel_n2 (int max)
    {
        a = new long[max];
        nElems = 0;
    }

    //--------------------------------------------------------------
    public void insert(long value)
    {
        a[nElems] = value;
        nElems++;
    }

    //--------------------------------------------------------------
    public void display()
    {
        for (int j = 0; j < nElems; j++)
            System.out.print(a[j] + " ");
        System.out.println(" ");
    }

    //--------------------------------------------------------------
    public void arrayFlip() {
        int bI, aI;
        long[] b = new long[a.length];
        bI = nElems-1 ;
        for (aI = 0; aI < nElems; aI++) {
            b[bI] = a[aI];
            bI--;
        }
        a = b;
    }

}
