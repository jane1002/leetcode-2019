package google;

/**
 *
 * link https://leetcode.com/problems/flipping-an-image/
 *
 */
public class FlippingAnImage832 {

    /**
     * @param A two dimension array
     * @return two dimension array after flip.
     */
    public int[][] flipAndInvertImage(int[][] A) {
        int length = A[0].length;

        for(int[] row: A) {
            for(int i = 0; i < (length + 1) / 2; i++) {
                int temp = row[i] ^ 1;
                row[i] = row[length - 1 - i] ^ 1;
                row[length - 1 - i] = temp;

                // This is wrong, because if one array has only odd numbers,
                // the center one will be XOR twice.
                // solution: 1 is this, 2 you can iterate again do the revert
                // after flip.
//                row[i] = row [i] ^ 1;
//                row[length - 1 - i] = row[length - 1 - i] ^ 1;
            }
        }

        return A;
    }
}
