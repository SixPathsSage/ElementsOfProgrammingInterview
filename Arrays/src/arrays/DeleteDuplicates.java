package arrays;

/**
 * Given a sorted array, delete the duplicate elements and shift the distinct elements
 * to the left to fill the empty space
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class DeleteDuplicates {
    public void deleteDuplicates(int[] array) {
        int i = 0;
        int j = 1;

        while(j < array.length) {
            if (array[j - 1] != array[j]) {
                array[i + 1] = array[j];
                i++;
            }
            j ++;
        }

        while(i < array.length-1) {
            array[i+1] = 0;
            i++;
        }
    }
}
