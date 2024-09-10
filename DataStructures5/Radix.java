public class Radix {
    public static void main(String[] args) {
        int[] a = {5585,3,1339,443223,210,554,412,2341,917,895,73,29,0,6,18,99,980};
        
        //Print unsorted array.
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        
        double start = System.nanoTime();
        //Sort the array.
        a=radixSort(a);
        double elapsed = (System.nanoTime()-start)/1000000000;
        
        //Print sorted array.
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }   //End Main
    
    public static int[] radixSort(int[] a) {
    int max = a[0];
    int len = a.length;

    for (int i = 0; i < len; i++) {
        if (a[i] > max) {
            max = a[i];
        }
    }

    for (int exp = 1; max / exp > 0; exp *= 10) {
        int[] count = new int[10];
        int[] output = new int[len];

        // Count occurrences of digits at the current place value
        for (int i = 0; i < len; i++) {
            count[(a[i] / exp) % 10]++;
        }

        // Modify count array to store the position of the digit in the output array
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // Build the output array
        for (int i = len - 1; i >= 0; i--) {
            output[count[(a[i] / exp) % 10] - 1] = a[i];
            count[(a[i] / exp) % 10]--;
        }

        // Copy the output array to the original array
        System.arraycopy(output, 0, a, 0, len);
    }

    return a;


			
    }   //End radixSort
}   //End Class