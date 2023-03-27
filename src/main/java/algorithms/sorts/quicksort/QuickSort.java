package algorithms.sorts.quicksort;

import java.util.Arrays;

public class QuickSort {

    private static void swap(int[] array, int firstIndex, int secondIndex) {
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }

    private static int pivot(int[] array, int startingIndex, int endingIndex){
        int swap = startingIndex;
        for (int i = startingIndex + 1; i < array.length; i++){
            if (array[i] < array[startingIndex]){
                swap++;
                if (swap != i){
                    int temp = array[swap];
                    array[swap] = array[i];
                    array[i] = temp;
                }
            }
        }
        int temp = array[swap];
        array[swap] = array[startingIndex];
        array[startingIndex] = temp;
        return swap;
    }

    private static int[] quickSortHelper(int[] array, int startingIndex, int endingIndex){
        if (startingIndex != endingIndex) {
            int[] left = quickSortHelper(array, startingIndex, pivot(array, startingIndex, endingIndex));
            int[] right = quickSortHelper(array, pivot(array, startingIndex, endingIndex) + 1, endingIndex);
        }
        return array;
    }
    // WRITE QUICKSORT HELPER METHOD HERE //
    //                                    //
    //                                    //
    //                                    //
    //                                    //
    ////////////////////////////////////////


    public static void quickSort(int[] array) {
        quickSortHelper(array, 0, array.length-1);
    }



    public static void main(String[] args) {

        int[] myArray = {4,6,1,7,3,2,5};

        quickSort(myArray);

        System.out.println( Arrays.toString( myArray ) );

        /*
            EXPECTED OUTPUT:
            ----------------
            [1, 2, 3, 4, 5, 6, 7]

         */

    }

}

