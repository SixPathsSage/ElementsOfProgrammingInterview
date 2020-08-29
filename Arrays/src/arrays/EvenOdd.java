package arrays;

/*
* Given an Integer Array, move the even elements to the beginning of the array
* and odd elements to the end of the array
* */
public class EvenOdd {

    /*
    * Time Complexity: O(n)
    * Space Complexity: O(1)
    * */
    public void evenOdd(int[] array) {
        int i = 0;
        int j = 0;

        while(i <= j && j < array.length) {
            if (array[j] % 2 == 0) {
                swap(array, i, j);
                i++;
            }
            j++;
        }
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
