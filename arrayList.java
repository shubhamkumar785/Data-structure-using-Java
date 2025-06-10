// ArrayList<Integer> l1 = new ArrayList<>();
// l1.add(10);
// l1.add(20);
// l1.add(30);

// System.out.println(l1.get(1));// 20

// for (int num : l1) {
// System.out.print(num + " ");
// }

// System.out.println();
// System.out.println(l1); // [10, 20, 30]

// // adding element at some index i // [5 100 6 7 8]
// l1.add(1, 100);
// System.out.println(l1); // [10, 100, 20, 30]

// // modifying element at index i
// l1.set(1, 10);
// System.out.println(l1); // [10, 10, 20, 30]

// // removing an element at index i
// l1.remove(1);
// System.out.println(l1); // [10, 20, 30]

// // removing an element e

// // checking if element exist
// System.out.println(l1.contains(10));

// // if you don't specify class you can put anything inside
// ArrayList l = new ArrayList();
// l.add(10);
// l.add(10.5);
// l.add("shubham");
// l.add("true");
// System.out.println(l);
// }

// }

// write a program to reverse the given arraylist.

// public class arrayList {
// public static void reverseList(ArrayList<Integer> l) {
// int left = 0, right = l.size() - 1;

// while (left < right) {
// Integer temp = left;
// l.set(left, l.get(right));
// l.set(right, l.get(left));
// left++;
// right--;
// }
// }

// public static void main(String[] args) {
// ArrayList<Integer> l = new ArrayList<>();
// l.add(0);
// l.add(10);
// l.add(3);
// l.add(5);
// l.add(22);
// l.add(10);

// System.out.println("original list: " + l);

// reverseList(l);
// System.out.println("reversed list: " + l);

// }
// }

// normal array used two pointer approach

// public class arrayList {
// public static void print(int[] arr) {
// int l = 0, r = arr.length - 1;
// while (l < r) {
// int temp = arr[l];
// arr[l] = arr[r];
// arr[r] = temp;
// l++;
// r--;
// }
// for (int num : arr) {
// System.out.print(num + " ");
// }
// }

// public static void main(String[] args) {
// int[] arr = { 1, 2, 3, 4, 5, 6 };
// print(arr);

// }
// }

// collections.reverse() method use to reverse a list
// public class arrayList {

// public static void main(String[] args) {
// ArrayList<Integer> l = new ArrayList<>();
// l.add(0);
// l.add(10);
// l.add(3);
// l.add(5);
// l.add(22);
// l.add(10);

// System.out.println("original list: " + l);

// Collections.reverse(l);
// System.out.println("reversed list: " + l);

// }
// }

// write a prpgram to sort an arraylist of strings in descending order.

// public class arrayList {
// public static void main(String[] args) {
// ArrayList<String> str = new ArrayList<>();
// str.add("10");
// str.add("20");
// str.add("30");
// str.add("40");
// str.add("50");

// System.out.println(str);
// Collections.sort(str, Collections.reverseOrder());
// System.out.println(str);
// }
// }

// public class arrayList {
// public static List<Integer> twoSum(List<Integer> l, int target){
// int n = l.size();
// for(int i=0; i<l; i++){
// for(int j=i+1; j<l; j++){
// if(l.get(i) + l.get(j) == target){
// return Arrays.asList(l);
// }
// }
// }
// return new ArrayList<>();
// }
// public static void main(String[] args) {
// ArrayList<Integer> l = new ArrayList<>() {
// l.add(2);
// l.add(7);
// l.add(11);
// l.add(15);

// System.out.println(l);
// System.out.println(twoSum());
// }
// }
// }

// public class arrayList {
// public static int missingNumber(int[] arr) {
// int n = arr.length;
// int totalSum = n * (n + 2);
// int sum = 0;
// for (int i = 0; i < n; i++) {
// sum += arr[i];
// }
// int actualSum = totalSum - sum;
// return actualSum;

// }

// public static void main(String[] args) {
// int[] arr = { 1, 2, 4 };
// System.out.println(missingNumber(arr));
// }
// }