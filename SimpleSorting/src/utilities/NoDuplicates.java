package utilities;

import Interfaces.NoDups;

public class NoDuplicates implements NoDups {
    @Override
    public int removeArrayDups(long[] arr) {
        // 1 2 3 4 4 4 5 5 6
        // 1 2 3 4 5 4 5 5 6
        // 1 2 3 4 5
        int j, numDups;
        j = numDups = 0;
        for(int i = 0; i < arr.length-1; i++) {
            if(arr[i] != arr[i+1]) {
                arr[j++] = arr[i];
            } else {
                numDups++;
            }
        }
        arr[j] = arr[arr.length-1];
        return numDups;
    }
}
