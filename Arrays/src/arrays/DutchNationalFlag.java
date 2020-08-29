package arrays;

/*
* Given an array A of elements (0,1,2) and a pivot index i into A, Rearrange the elements such that
* all elements less than pivot appears first, followed by elements equal to the pivot,
* followed by elements greater than the pivot
*
* Constraints:
*   A.length >= 3
*   A[i] => {0,1,2}
* */
public class DutchNationalFlag {

    public void sort(int[] array, int pivot) {
        optimisedSort(array, pivot);
    }

    /*
    * Time Complexity: O(n)
    * Space Complexity: O(1)
    * */
    private void twoPassSort(int[] array, int pivot) {
        // Left to Right
        for(int i = -1, j = 0; j < array.length; j ++) {
            if(array[j] < pivot) {
                swap(array, ++i, j);
            }
        }

        // Right to Left
        for(int i = array.length, j = array.length-1; j >= 0; j --) {
            if(array[j] > pivot) {
                swap(array, --i, j);
            }
        }
    }

    /*
    * Time Complexity: O(n)
    * Space Complexity: O(1)
    * In this approach the runtime is reduced from O(2n) to O(n)
    * */
    private void optimisedSort(int[] array, int pivot) {
        int smaller = 0;
        int equal = 0;
        int larger = array.length;

        while(equal < larger) {
            if(array[equal] < pivot) {
                swap(array, smaller ++, equal ++);
            }
            else if(array[equal] == pivot) {
                equal ++;
            }
            else {
                swap(array, equal, -- larger);
            }
        }
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
