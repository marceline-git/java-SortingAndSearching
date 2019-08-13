public class BinarySearch {
    public int binarySearch(int[] array, int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l)/2;
            if (array[mid] == x) return mid;

            if (array[mid] > x) {
                return binarySearch(array, l, mid - 1, x);
            }

            if (array[mid] < x) {
                return binarySearch(array, mid + 1, r, x);
            }
        }
        return -1;
    }
}
