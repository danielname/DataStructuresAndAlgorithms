package algorithms.sorts.insertionsort;

import java.util.Arrays;

public class InsertionSort {

    private static void insertionSort(int[] array){
        for (int i = 1; i < array.length; i++){
            int temp = i;
            while (temp > 0 && array[temp] < array[temp - 1]){
                int tempHold = array[temp];
                array[temp] = array[temp - 1];
                array[temp - 1] = tempHold;
                temp--;
            }
        }
    }

    // WRITE INSERTIONSORT METHOD HERE //
    //                                 //
    //                                 //
    //                                 //
    //                                 //
    /////////////////////////////////////



    public static void main(String[] args) {

        int[] myArray = {4,2,6,5,1,3};

        insertionSort(myArray);

        System.out.println( Arrays.toString(myArray) );

        /*
            EXPECTED OUTPUT:
            ----------------
            [1, 2, 3, 4, 5, 6]

         */

    }

}

