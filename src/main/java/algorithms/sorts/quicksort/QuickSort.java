package algorithms.sorts.quicksort;

import java.util.Arrays;

public class QuickSort {

    private static void swap(int[] array, int firstIndex, int secondIndex) {
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }

    private static int pivot(int[] array, int sartingIndex, int endingIndex){
        int pivot = 0;
        int swap = 0;
        for (int i = 1; i < array.length; i++){
            if (array[i] < array[pivot]){
                swap++;
                if (swap != i){
                    int temp = array[swap];
                    array[swap] = array[i];
                    array[i] = temp;
                }
            }
        }
        int temp = array[swap];
        array[swap] = array[pivot];
        array[pivot] = temp;
        return swap;
    }
    // WRITE PIVOT METHOD HERE //
    //                         //
    //                         //
    //                         //
    //                         //
    /////////////////////////////



    public static void main(String[] args) {

        int[] myArray = {4,6,1,7,3,2,5};

        int returnedIndex = pivot(myArray, 0, 6);

        System.out.println( "\nReturned Index: " + returnedIndex);

        System.out.println( Arrays.toString( myArray ) );

        /*
            EXPECTED OUTPUT:
            ----------------
            Returned Index: 3
            [2, 1, 3, 4, 6, 7, 5]

         */

    }

}

