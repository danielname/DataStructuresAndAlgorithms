package algorithms.sorts.selectionsort;

import java.util.Arrays;

public class SelectionSort {

    private static void selectionSort(int[] array){
        int minIndex;
        int temp;
        for (int i = 0; i < array.length; i++){
            minIndex = i;
            for (int j = i; j < array.length; j++){
                if(array[minIndex] > array[j]){
                    minIndex = j;
                }
            }
            if (array[minIndex] < array[i]){
                temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }

    // WRITE SELECTIONSORT METHOD HERE //
    //                                 //
    //                                 //
    //                                 //
    //                                 //
    /////////////////////////////////////



    public static void main(String[] args) {

        int[] myArray = {4,2,6,5,1,3};

        selectionSort(myArray);

        System.out.println( Arrays.toString(myArray) );

        /*
            EXPECTED OUTPUT:
            ----------------
            [1, 2, 3, 4, 5, 6]

         */

    }

}

