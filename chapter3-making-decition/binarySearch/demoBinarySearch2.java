// Steps:
// Look at the middle
// Decide:
// - Left?
// - Right?
// Throw away half

// Index       = [0,1,2,3,4,5,6,7]
// ArraysValue = [1,2,3,4,5,6,8,9]
// Target = 8
// lowIndex = 0
// highIndex = 7
// mid = lowIndex + highIndex / 2 =
// if target == mid = found

public class demoBinarySearch2 {
    public static int binarySearch(int[] arr, int target) {
        int lowIndex = 0;
        int highIndex = arr.length - 1;

        while (lowIndex <= highIndex) { // lowIndex smaller then highIndex
            int mid = (lowIndex + heighIndex) / 2; // search mid
            if (target == arr[mid]) { // target found = if target the same as mid
                return mid;
            }
            if (target < arr[mid]) { // if target smaller then mid = get new high
                highIndex = mid - 1;
            } else  { // if target greater then mid = get new low
                lowIndex = mid + 1;
            }
        }
        return -1;
    }
}