package google;

public class FindPeakInMountainArray852 {

    /**
     *
     * @param A
     * @return int the index of the peak
     * Solution 1: linear scan
     */
    public int peakIndexInMountainArrayLinear(int[] A) {
        int res = 0;
        for(int i = 0; i < A.length - 1; i++) {
            if(A[i] < A[i + 1]) {
                continue;
            }
            res = i;
            break;
        }

        return res;
    }

    /**
     *
     * @param A
     * @return peak index
     * Solution 2: binary search logN
     */
    public int peakIndexInMountainArrayBinarySearch(int[] A) {
        int res = 0;

        int left = 0;
        int right = A.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if(A[mid] < A[mid + 1]) {
                left = mid + 1;
            } else
                right = mid;
        }
        return left;
    }
}
