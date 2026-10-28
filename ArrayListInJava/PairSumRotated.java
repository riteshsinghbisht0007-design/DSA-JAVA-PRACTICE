package ArrayListInJava;

import java.util.*;

public class PairSumRotated {

    public static boolean pairsum2(ArrayList<Integer> list, int target) {

        // Find breaking point
        int bp = -1;

        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                bp = i;
                break;
            }
        }

        // Two pointers
        int lp; // smallest
        int rp; // largest

        if (bp == -1) {
            // Array is not rotated
            lp = 0;
            rp = list.size() - 1;
        } else {
            // Array is rotated
            lp = bp + 1;
            rp = bp;
        }

        while (lp != rp) {

            int sum = list.get(lp) + list.get(rp);

            // Case 1: Pair found
            if (sum == target) {
                return true;
            }

            // Case 2: Sum is smaller
            else if (sum < target) {
                lp = (lp + 1) % list.size();
            }

            // Case 3: Sum is larger
            else {
                rp = (rp - 1 + list.size()) % list.size();
            }
        }

        return false;
    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        
        int target = 16;

        System.out.println(pairsum2(list, target));
    }
}