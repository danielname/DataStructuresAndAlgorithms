package algorithms.sorts.mergesort;

import java.util.Arrays;

public class MergeSort {

    private static int[] merge(int[] array1, int[] array2){
        int[] mergedArray = new int[array1.length + array2.length];
        int index1 = 0;
        int index2 = 0;
        for (int i = 0; i < mergedArray.length; i++){
            if (index1 >= array1.length){
                mergedArray[i] = array2[index2];
                index2++;
            } else if (index2 >= array2.length){
                mergedArray[i] = array1[index1];
                index1++;
            } else {
                if (array1[index1] < array2[index2]){
                    mergedArray[i] = array1[index1];
                    index1++;
                } else {
                    mergedArray[i] = array2[index2];
                    index2++;
                }
            }
        }
        return mergedArray;
    }

    // WRITE MERGE METHOD HERE //
    //                         //
    //                         //
    //                         //
    //                         //
    /////////////////////////////



    public static void main(String[] args) {

        int[] array1 = {1,3,7,8};
        int[] array2 = {2,4,5,6};

        System.out.println( Arrays.toString( merge(array1, array2) ) );

        /*
            EXPECTED OUTPUT:
            ----------------
            [1, 2, 3, 4, 5, 6, 7, 8]

         */

    }

}

