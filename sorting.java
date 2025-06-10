
//  BubbleSort

// public class sorting {
//     public static void bubbleSort(int[] arr) {
//         for (int i = 0; i < arr.length - 1; i++) {
//             boolean flag = false;
//             for (int j = 0; j < arr.length - i - 1; j++) {
//                 if (arr[j] > arr[j + 1]) {
//                     int temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;
//                     flag = true;
//                 }
//             }
//             if (!flag) {
//                 return;
//             }
//         }
//     }

//     public static void main(String[] args) {
//         int[] arr = { 7, 8, 4, 5, 6 };
//         bubbleSort(arr);

//         for (int sort : arr) {
//             System.out.print(sort + " ");
//         }
//     }
// }

//  selection sort

// public class sorting {
//     public static void selctionSort(int[] arr) {
//         int n = arr.length;
//         for (int i = 0; i < n - 1; i++) {
//             int min_index = i;
//             for (int j = i + 1; j < n; j++) {
//                 if (arr[j] < arr[min_index]) {
//                     min_index = j;
//                 }
//             }
//             int temp = arr[i];
//             arr[i] = arr[min_index];
//             arr[min_index] = temp;
//         }
//     }

//     public static void main(String[] args) {
//         int[] arr = { 2, 5, 4, 3, 7, 9, 8 };
//         selctionSort(arr);
//         for (int sort : arr) {
//             System.out.print(sort + " ");
//         }
//     }
// }

//  Insertion sort

// public class sorting {
//     public static void insertionSort(int[] arr) {
//         int n = arr.length;

//         for (int i = 1; i < n; i++) {
//             int j = i;
//             while (j > 0 && arr[j] < arr[j - 1]) {
//                 int temp = arr[j];
//                 arr[j] = arr[j - 1];
//                 arr[j - 1] = temp;
//                 j--;
//             }
//         }

//     }

//     public static void main(String[] args) {
//         int[] arr = { 8, 3, 6, 5, 4, 5 };
//         insertionSort(arr);

//         for (int sort : arr) {
//             System.out.print(sort + " ");
//         }
//     }
// }

//  given an integer array move all 0's the end of it while maintaining the relative order of the non- zero elements.

// public class sorting {
//     public static void zeroSort(int[] arr) {
//         int n = arr.length;
//         for (int i = 0; i < n - 1; i++) {
//             for (int j = 0; j < n - i - 1; j++) {
//                 if (arr[j] == 0 && arr[j + 1] != 0) {
//                     int temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;
//                 }
//             }
//         }
//     }

//     public static void main(String[] args) {
//         int[] arr = { 0, 5, 0, 3, 42 };
//         zeroSort(arr);

//         for (int num : arr) {
//             System.out.print(num + " ");
//         }
//     }
// }

//  given an array of name of the fruits; you are supposed to sort it in lexicographical order using the selection sort

// public class sorting {
//     public static void lexicographicalOrder(String[] arr) {
//         int n = arr.length;

//         for (int i = 0; i < n - 1; i++) {
//             int min_index = i;
//             for (int j = i + 1; j < n; j++) {
//                 if (arr[j].compareTo(arr[min_index]) < 0) {
//                     min_index = j;
//                 }
//             }
//             String temp = arr[i];
//             arr[i] = arr[min_index];
//             arr[min_index] = temp;
//         }
//     }

//     public static void main(String[] args) {
//         String[] arr = { "papaya", "lime", "watermelon", "apple", "mango", "kiwi" };
//         lexicographicalOrder(arr);

//         for (String sort : arr) {
//             System.out.println(sort);
//         }
//     }
// }