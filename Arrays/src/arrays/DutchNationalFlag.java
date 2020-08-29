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
        twoPassSort(array, pivot);
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

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
