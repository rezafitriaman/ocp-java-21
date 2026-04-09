// Which of the following fill in the blank to print a positive integer? (Choose all that apply.)
public class practice1 {
    public final static void main(String[] args) {
        // A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
        // Arrays.compare () - return 0 if equal, return 1 if the arrays is different and first array is greater then the second, return -1 if the first arrays is smaller then the second arrays.
        // Arrays.mismatch() - return 0 if the arrays is different and it return the index of the mismatch item.
        String[] s1 = {"Camel", "Peacock", "Llama"};
        String[] s2 = {"Camel", "Llama", "Peacock"};
        String[] s3 = {"Camel"};
        String[] s4 = {"Camel", null};
        System.out.println(Arrays.____);
    }
}
// A. compare(s1, s2) - the arrays are different s1,s2, so if we compare it de P on index 1 on the first arrays comes later then the L on the index 1 on second arrays. so it return negatief integer.
// B. mismatch(s1, s2) - the arrays are different s1,s2 so it mismatch. De different is in index 1 so it return index 1. it print positief integer.
// C. compare(s3, s4) - the arrays are different s3,s4 so if we compare it we get the first array has 1 item and the second arrrays has 2 items. so the first arrays is smaller then the second arrays. it print negatief integer.
// D. mismatch(s3, s4) - the arrays are different s3,s4 so it is a mismatch. the first arrays has 1 item and the second arrays has 2 items and the mismatch is at index 1. so it return the index number of the mismatch. it return positief intger.
// E. compare(s4, s4) - the arrays are the same so if we compare it it return -1. it return negatief number.
// F. mismatch(s4, s4) - the arrays are the same so it is not a mismatch. if not a mismatch it return -1. it return negatief number
