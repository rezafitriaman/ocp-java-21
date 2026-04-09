// Which of the following are true about arrays? (Choose all that apply.)
// A. The first element is index 0. // true
// Java arrays are zero-based (like most programming languages)
// B. The first element is index 1.
// C. Arrays are fixed size. // true
// int[] arr = new int[3];
// Once created:
// Size = 3 forever
// You cannot add/remove elements
// You'd need something like ArrayList for dynamic size
// D. Arrays are immutable.
// Content are mutable
// int[] arr = {1, 2, 3};
// arr[0] = 99; // Allowed
// E. Calling equals() on two different arrays containing the same primitive values always returns true.
// F. Calling equals() on two different arrays containing the same primitive values always returns false. // true - An array does not override equals(), so it uses object equality
// equals() always returns false
// int[] a = {1, 2, 3};
// int[] b = {1, 2, 3};
// System.out.println(a.equals(b)); // false
// Because `equals()` for arrays behaves like:
// return (this == other)
// It compares memory addresses, NOT contents
// G. Calling equals() on two different arrays containing the same primitieve values can return true of false.


