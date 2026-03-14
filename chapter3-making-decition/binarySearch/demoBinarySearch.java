// Binary means Based on 2
// In computing, binary usually means:
// - Only two possibilities
// - 0 and 1
// -True or False
// - Left or Right
// So When we say binary search, it means:
// `We split something into TWO parts each time`

// What is Binary Search?
// Binary search is a way to find a value in a sorted list by repeatedly cutting the search aria in half.
// Important: The list MUST be sorted!
public class demoBinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int heigh = arr.length;

        while (low <= heigh) {
            int mid = (low + heigh) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1; // not found
    }
}