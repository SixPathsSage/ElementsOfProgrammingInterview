package arrays;

import java.util.List;

/*
* Given a list which contains the digits of the integer, add 1 to it.
* */

public class IncrementInteger {
    /*
    * Time Complexity: O(n)
    * Space Complexity: O(1)
    * */
    public List<Integer> incrementInteger(List<Integer> array) {
        int rem = 1;
        for(int i = array.size()-1; i >= 0; i --) {
            int sum = array.get(i) + rem;
            rem = sum / 10;
            sum = sum % 10;
            array.remove(i);
            array.add(i, sum);
        }

        if(rem > 0) {
            array.add(0, rem);
        }
        return array;
    }
}
