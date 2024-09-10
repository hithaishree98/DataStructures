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
    
    public static int[] radixSort(int[] a){
        //IMPLEMENT ME
    }   //End radixSort
}   //End Class