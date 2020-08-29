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

    private void twoPassSort(int[] array, int pivot) {
        // Left to Right
        int i = -1;
        int j = 0;

        while(j < array.length) {
            if(array[j] < pivot) {
                swap(array, ++i, j);
            }
            j ++;
        }

        // Right to Left
        i = array.length;
        j = array.length-1;

        while(j >= 0) {
            if(array[j] > pivot) {
                swap(array, --i, j);
            }
            j --;
        }
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
