package task21.n2;

 class ArraySel {
        private long[] a;                 // ref to array a
        private int nElems;               // number of data items

        //--------------------------------------------------------------
        public ArraySel(int max)          // constructor
        {
            a = new long[max];                 // create the array
            nElems = 0;                        // no items yet
        }

        //--------------------------------------------------------------
        public void insert(long value)    // put element into array
        {
            a[nElems] = value;             // insert it
            nElems++;                      // increment size
        }

        //--------------------------------------------------------------
        public void display()             // displays array contents
        {
            for (int j = 0; j < nElems; j++)       // for each element,
                System.out.print(a[j] + " ");  // display it
            System.out.println("");
        }

        //--------------------------------------------------------------
        public void selectionSort() {
            int out, in, max;

            for (out = 0; out < nElems - 1; out++)   // outer loop
            {
                max = out;                     // minimum
                for (in = out + 1; in < nElems; in++) // inner loop
                    if (a[in] > a[max])         // if min greater,
                        max = in;               // we have a new min
                swap(out, max);                // swap them
            }  // end for(out)
        }  // end selectionSort()

        //--------------------------------------------------------------
        private void swap(int one, int two) {
            long temp = a[one];
            a[one] = a[two];
            a[two] = temp;
        }
        //--------------------------------------------------------------

}
