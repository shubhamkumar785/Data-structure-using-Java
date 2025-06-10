
//         // for loop
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }

//         // for each loop
//         System.out.println();
//         for (int array : arr) {
//             System.out.print(array + " ");
//         }
//         // while loop
//         System.out.println();
//         int i = 0;
//         while (i < arr.length) {
//             System.out.print(arr[i] + " ");
//             i++;
//         }

//         // multidimensional array
//         System.out.println();
//         int[][] array = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
//         for (int k = 0; k < array.length; k++) {
//             for (int j = 0; j < array[k].length; j++) {
//                 System.out.print(array[k][j] + " ");
//             }
//         }

//     }
// }

// Q1. sum of all array of all elements in the given array.
// input: arr[] = {1, 5, 3}
// output: 9

// public class array {
//     public static void display(int[] arr) {
//         int sum = 0;
//         for (int i = 0; i < arr.length; i++) {
//             sum += arr[i];
//         }
//         System.out.println("sum of array is: " + sum);
//     }

//     public static void main(String[] args) {
//         int[] arr = { 1, 5, 3 };
//         array sum = new array();
//         sum.display(arr);
//     }
// }

//  Q2. claculate the maximum value out of all the elements in the array
// intput: arr[]= {1, 5, 3}
// output: 5

// public class array {
//     public static void display(int[] arr) {
//         int max = arr[0];
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] > max) {
//                 max = arr[i];
//             }
//         }
//         System.out.println("maximum element in array is: " + max);
//     }

//     public static void main(String[] args) {
//         int[] arr = { 1, 5, 3 };
//         array obj = new array();
//         obj.display(arr);
//     }
// }

//  Q3. Search the given element x in an array. if present then return the index else return -1.
//  input arr ={1, 5, 3}
// x = 5
// output: 1

// public class array {
//     public static int searchArray(int[] arr, int x) {
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == x) {
//                 return i;
//                 break;
//             }
//         }
//         return -1;
//     }

//     public static void main(String[] args) {
//         int[] arr = { 1, 5, 3 };
//         int x = 5;
//         System.out.println("Index is: " + searchArray(arr, x));
//     }
// }

//  Q4. count the number of occurences of a particular element x
// arr[] = {5, 6, 5, 1, 5}
//  x = 5

// public class array {
//     public static int countArray(int[] arr, int x) {
//         int count = 0;
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == x) {
//                 count++;
//             }
//         }
//         return count;
//     }

//     public static void main(String[] args) {
//         int[] arr = { 5, 6, 5, 1, 5 };
//         int x = 5;
//         System.out.println(countArray(arr, x));
//     }
// }

//  find the last occurence of an elemeny x in a given array

// public class array {
//     public static int lastOccurennce(int[] arr, int x) {
//         int lastIndex = -1;
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == x) {
//                 lastIndex = i;
//             }
//         }
//         return lastIndex;
//     }

//     public static void main(String[] args) {
//         int[] arr = { 5, 6, 1, 5 };
//         int x = 5;
//         System.out.println(lastOccurennce(arr, x));
//     }
// }

//  count the number of elements strictly greater than value x.

// public class array {
//     public static int display(int[] arr, int x) {
//         int count = 0;
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] > x) {
//                 count++;
//             }
//         }
//         return count;
//     }

//     public static void main(String[] args) {
//         int[] arr = { 1, 5, 6, 7, 8, 2 };
//         int x = 3;
//         System.out.println(display(arr, x));
//     }
// }

//   check if given array is sorted or not

// public class array {
//     public static boolean sortedArray(int[] arr) {
//         for (int i = 1; i < arr.length; i++) {
//             if (arr[i] < arr[i - 1]) {
//                 return false;
//             }
//         }
//         return true;
//     }

//     public static void main(String[] args) {
//         int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 8, 9 };
//         array obj = new array();
//         boolean result = obj.sortedArray(arr);
//         if (result) {
//             System.out.println("Array is sorted");
//         } else {
//             System.out.println("Array is not sorted");
//         }

//     }
// }

//  return a array which smallest number an d largest number in an arary
//  output: [1, 9]

// public class array {
//     public static int[] smallestLargest(int[] arr) {
//         Arrays.sort(arr);
//         int[] ans = { arr[0], arr[arr.length - 1] };
//         return ans;

//     }

//     public static void main(String[] args) {
//         int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
//         int[] ans = smallestLargest(arr);
//         System.out.println(Arrays.toString(ans));
//         // System.out.println("smallest: " + ans[0]);
//         // System.out.println("largest: " + ans[1]);
//     }
// }

//  find the total number of pairs in an array whose sum is equal to the given value x.

// public class array {
//     public static int sumEquals(int[] arr, int x) {
//         int pair = 0;
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i + 1; j < arr.length; j++) {
//                 if (arr[i] + arr[j] == x) {
//                     pair++;
//                 }
//             }
//         }
//         return pair;
//     }

//     public static void main(String[] args) {
//         int[] arr = { 4, 6, 3, 5, 8, 2 };
//         int x = 7;
//         int ans = sumEquals(arr, x);
//         System.out.println(ans);
//     }
// }

//  count the number of triplet whose sum is wqual to the given value x.

// public class array {
//     public static int sumEqual(int[] arr, int target) {
//         int count = 0;
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i + 1; j < arr.length; j++) {
//                 for (int k = j + 1; k < arr.length; k++) {
//                     if (arr[i] + arr[j] + arr[k] == target) {
//                         count++;
//                     }
//                 }
//             }
//         }
//         return count;
//     }

//     public static void main(String[] args) {
//         int[] arr = { 1, 4, 5, 6, 3 };
//         int target = 12;
//         int ans = sumEqual(arr, target);
//         System.out.println(ans);
//     }
// }

//  find the unique element  in an given array where all the elements are beign repeated twice with one value being unique.

// public class array {
//     public static int uniqueElement(int[] arr) {
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i + 1; j < arr.length; j++) {
//                 if (arr[i] == arr[j]) {
//                     arr[i] = -1;
//                     arr[j] = -1;
//                 }
//             }
//         }
//         int element = -1;
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] != -1) {
//                 element = arr[i];
//             }
//         }
//         return element;
//     }

//     public static void main(String[] args) {
//         int[] arr = { 1, 2, 3, 4, 2, 1, 3 };
//         int ans = uniqueElement(arr);
//         System.out.println(ans);
//     }
// }

//  find the second largest elements in the given array.

// public class array {

//     public static int secondMax(int[] arr) {
//         int max = Integer.MIN_VALUE;
//         int second = Integer.MIN_VALUE;

//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] > max) {
//                 second = max;
//                 max = arr[i];

//             } else if (arr[i] > second && arr[i] != max) {
//                 second = arr[i];
//             }
//         }
//         return second;
//     }

//     public static void main(String[] args) {
//         int[] arr = { 9, 8, 9, 6, 9, 5, 8 };
//         int ans = secondMax(arr);
//         System.out.println(ans);
//     }
// }

// given an array 'a' consisting of integers. return the first value that is repeating in this array. if no value is beign repeated return -1. 

// public class array {
//     public static int firstOccurence(int[] arr) {
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i + 1; j < arr.length; j++) {
//                 if (arr[i] == arr[j]) {
//                     return arr[i];
//                 }
//             }
//         }
//         return -1;
//     }

//     public static void main(String[] args) {
//         int[] arr = { 1, 5, 3, 4, 6, 3, 4 };
//         int ans = firstOccurence(arr);
//         System.out.println(ans);
//     }
// }

//   given 2 intgers a and b. swap the 2 given values using temporary variables.

// public class array {
//     public static void swap(int a, int b) {
//         System.out.println("Original value");
//         System.out.println("a: " + a);
//         System.out.println("b: " + b);

//         int temp = a;
//         a = b;
//         b = temp;
//         System.out.println("swaping value");
//         System.out.println("a: " + a);
//         System.out.println("b: " + b);

//     }

//     public static void main(String[] args) {
//         int a = 9;
//         int b = 3;
//         array obj = new array();
//         obj.swap(a, b);
//     }
// }

//  given 2 integer a and b. swap the 2 given values using sum and difference method.

// public class array {
//     public static void swap(int a, int b) {
//         System.out.println("Original value");
//         System.out.println("a: " + a);
//         System.out.println("b: " + b);

//         a = a + b;
//         b = a - b;
//         a = a - b;

//         System.out.println("swaping value");
//         System.out.println("a: " + a);
//         System.out.println("b: " + b);

//     }

//     public static void main(String[] args) {
//         int a = 9;
//         int b = 3;
//         swap(a, b);
//     }
// }

//  reverse an array consisting of integer values.

// public class array {
//     public static void reverse(int[] arr) {
//         for (int i = arr.length - 1; i >= 0; i--) {
//             System.out.print(arr[i] + " ");
//         }
//     }

//     public static void main(String[] args) {
//         int[] arr = { 1, 2, 3, 4, 5, 6 };
//         reverse(arr);
//     }
// }

//  check if the given number is present in the array or not

// public class array {
//     public static void target(int[] arr, int k) {
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == k) {
//                 System.out.println("number is present in array");
//                 return;
//             }
//         }
//         System.out.println("number is not present in array");
//     }

//     public static void main(String[] args) {
//         int[] arr = { 5, 6, 5, 400, 560, 1000, 400 };
//         int k = 5;
//         target(arr, k);
//     }
// }

// arrange in ascending order 

// public class array {
//     public static void Sort(int[] arr) {
//         int zero = 0;
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == 0) {
//                 zero++;
//             }
//         }
//         for (int i = 0; i < arr.length; i++) {
//             if (i < zero) {
//                 arr[i] = 0;
//             } else {
//                 arr[i] = 1;
//             }
//         }
//     }

//     public static void main(String[] args) {
//         int[] arr = { 1, 0, 1, 0, 1, 0, 1, 0, 1, 0 };
//         Sort(arr);

//         for (int num : arr) {
//             System.out.print(num + " ");
//         }
//     }
// }

//  arrange in ascending order

// public class array {
//     public static void sort(int[] arr) {
//         Arrays.sort(arr);
//     }

//     public static void main(String[] args) {
//         int[] arr = { 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 0, 1 };
//         sort(arr);

//         System.out.println(Arrays.toString(arr));

//     }
// }

//  given an array of integer 'a' moves all the even integers at the begiing of the array followed by all the odd integer. the relative order of odd ar even integrs does not matter. return any array that satisfies the condition.

// public class array {
//     public static void function(int[] arr) {
//         int left = 0, right = arr.length - 1;
//         while (left < right) {
//             if (arr[left] % 2 == 1 && arr[right] % 2 == 0) {
//                 swap(arr, left, right);
//                 left++;
//                 right--;
//             }
//             if (arr[right] % 2 == 1) {
//                 right--;
//             }
//             if (arr[left] % 2 == 0) {
//                 left++;
//             }
//         }

//     }

//     public static void swap(int[] arr, int i, int j) {
//         int temp = arr[i];
//         arr[i] = arr[j];
//         arr[j] = temp;
//     }

//     public static void main(String[] args) {
//         int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
//         function(arr);

//         for (int num : arr) {
//             System.out.print(num + " ");
//         }
//     }
// }

//  given an integer array 'a' sorted in non decresing order return an array of the square of each number is sorted in non decresing order.

// public class array {
//     public static int[] squareArray(int[] arr) {
//         int[] result = new int[arr.length];

//         for (int i = 0; i < arr.length; i++) {
//             result[i] = arr[i] * arr[i];
//         }
//         Arrays.sort(result);
//         return result;
//     }

//     public static void main(String[] args) {
//         int[] arr = { 2, 4, 6, 7, 10 };
//         int[] square = squareArray(arr);

//         for (int num : square) {
//             System.out.println(num);
//         }
//     }
// }

// given an integer array 'a' return the prefix sum in the same array without creating a new array
// public class array {
//     // public static int[] printArray(int[] arr) {
//     // int[] pref = new int[arr.length];
//     // pref[0] = arr[0];

//     // for (int i = 1; i < arr.length; i++) {
//     // pref[i] = pref[i - 1] + arr[i];
//     // }
//     // return pref;

//     // }
//     public static void printArray(int[] arr) {
//         for (int i = 1; i < arr.length; i++) {
//             arr[i] = arr[i - 1] + arr[i];
//         }
//         for (int num : arr) {
//             System.out.print(num + " ");
//         }
//     }

//     public static void main(String[] args) {
//         int[] arr = { 2, 1, 3, 4, 5 };
//         printArray(arr);

//         // for (int num : pref) {
//         // System.out.print(num + " ");
//         // }
//     }
// }

// given an array of integer of size n. answer q queries where you need to print the sum of values in a given range of indicies from l to r(both included). Not: the value of l and r in queries follow 1-based indexing. 

// public class array {
//     public static int printArray(int[] arr, int l, int r) {
//         int sum = 0;
//         for (int i = l - 1; i <= r - 1; i++) {
//             sum += arr[i];
//         }
//         return sum;
//     }

//     public static void main(String[] args) {
//         int[] arr = { 2, 4, 1, 3, 6 };
//         int l = 1;
//         int r = 3;
//         int result = printArray(arr, l, r);
//         System.out.println(result);
//     }
// }


// check if we can partition the array into two subarray with equal sum. more formally, check that the prefix sum of a part of the array is equal to the suffix of rest of the array. 

public class array{
    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 6, 3, 1};
    }
}