
import java.util.ArrayList;

// public class recursion {
//     public static int Factorial(int n) {
//         if (n == 0 || n == 1) {
//             return 1;
//         
//         } else {
//             return n * Factorial(n - 1);
//         }
//         // return -1;
//     }

//     public static void main(String[] args) {
//         int n = 5;
//         // Factorial(5);
//         System.out.println(Factorial(5));
//     }

// }

//  program to find nth fibonacci number.

// public class recursion {
//     public static int fibonacci(int n) {
//         if (n == 0) {
//             return 0;
//         } else if (n == 1) {
//             return 1;
//         } else {
//             return fibonacci(n - 1) + fibonacci(n - 2);
//         }
//     }

//     public static void main(String[] args) {
//         int n = 10;

//         for (int i = 0; i <= n; i++) {
//             System.out.print(fibonacci(i) + " ");
//         }
//     }
// }

//  given an integre find out the sum of its digits using recursion.

// public class recursion {
//     public static int sumOfDigit(int n) {
//         // if (n == 0) {
//         // return 0;
//         // }
//         // return n % 10 + sumOfDigit(n / 10);

//         if (n == 0) {
//             return 0;
//         }
//         int smallAns = sumOfDigit(n / 10);
//         int ans = smallAns + (n % 10);

//         return ans;

//     }

//     public static void main(String[] args) {
//         int n = 12345;
//         System.out.println(sumOfDigit(n));
//     }
// }

//  given twi number p & q find the value p^q using a recursion function

// public class recursion {
//     public static int power(int p, int q) {
//         if (q == 0) {
//             return 1;
//         } else {
//             return p * power(p, q - 1);
//         }
//     }

//     public static void main(String[] args) {
//         int p = 5;
//         int q = 2;

//         System.out.println(power(p, q));
//     }
// }

// given a number num and a value k. print k multiple of num.

// public class recursion {
//     public static void multiplePrint(int num, int k) {
//         for (int i = 1; i <= k; i++) {
//             System.out.print(num * i + " ");
//         }
//     }

//     public static void main(String[] args) {
//         int num = 12;
//         int k = 5;
//         multiplePrint(num, k);
//     }
// }

//  given a number n. find the sum of n natural number.

// public class recursion {
//     public static int naturalNumber(int n) {
//         if (n == 1) {
//             return 1;
//         }
//         return n + naturalNumber(n - 1);
//     }

//     public static void main(String[] args) {
//         int n = 10;
//         System.out.println(naturalNumber(n));
//     }
// }

//  print the max value of the array.

// public class recursion {
//     public static int maxArray(int[] arr) {
//         int max = 0;
//         for (int i = 0; i < arr.length; i++) {
//             if (max < arr[i]) {
//                 max = arr[i];
//             }
//         }
//         return max;
//     }

//     public static void main(String[] args) {
//         int[] arr = { 10, 50, 30, 20, 60, 70 };
//         System.out.println(maxArray(arr));
//     }
// }

//  find the sum of the element of the array.

// public class recursion {
//     public static int sumArray(int[] arr) {
//         int sum = 0;
//         for (int i = 0; i < arr.length; i++) {
//             sum += arr[i];
//         }
//         return sum;
//     }

//     public static void main(String[] args) {
//         int[] sum = { 10, 20, 30, 40, 50 };
//         System.out.println(sumArray(sum));
//     }
// }

//  given an array of n integer and a target value x.

// public class recursion {
//     public static void isPresent(int[] arr, int x) {
//         boolean found = false;

//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == x) {
//                 found = true;
//                 break;
//             }
//         }
//         if (found) {
//             System.out.println("yes");
//         } else {
//             System.out.println("No");
//         }
//     }

//     public static void main(String[] args) {
//         int[] arr = { 4, 12, 54, 14, 3, 8, 6 };
//         int x = 14;
//         isPresent(arr, x);
//     }
// }

//  return index of target element in an array

// public class recursion {
//     public static int isPresent(int[] arr, int target) {
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == target) {
//                 return i;
//             }
//         }
//         return -1;
//     }

//     public static void main(String[] args) {
//         int[] arr = { 10, 20, 30, 40, 50 };
//         int target = 40;
//         System.out.println(isPresent(arr, target));
//     }
// }

//  given an array arr of size N and a integer X. the task is to find all the indicies of the inyeger X in the array.

// public class recursion {
//     public static void isPresent(int[] arr, int x) {
//         boolean found = false;

//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == x) {
//                 System.out.println(i + " ");
//                 found = true;
//             }
//         }
//         if (!found) {
//             System.out.println("-1");
//         }
//     }

//     public static void main(String[] args) {
//         int[] arr = { 1, 2, 3, 2, 2, 5 };
//         int x = 2;
//         isPresent(arr, x);
//     }
// }

//  given an array of size N and an integer x. the task is to find all the indicies of the integer x in the array.

public class recursion {
    public static ArrayList<Integer> findIndex(int[] arr, int x) {
        ArrayList<Integer> indicies = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                indicies.add(i);
            }
        }
        return indicies;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 4, 3, 4 };
        int target = 4;

        ArrayList<Integer> result = findIndex(arr, target);

        if (result.isEmpty()) {
            System.out.println("Element not found");
        } else {
            System.out.println("Indices of " + target + ": " + result);
        }
    }
}