
import java.util.Scanner;

/*
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * System.out.println("Enter your name_1");
 * String str1 = sc.nextLine();
 * System.out.println("Enter your name_2");
 * String str2 = sc.nextLine();
 * System.out.println(str1); // print the string input from the user
 * System.out.println(str1.length()); // return length of the string
 * System.out.println(str1.charAt(2)); // return the character of the given
 * index
 * System.out.println(str1.indexOf('s')); // return the index of the given
 * character
 * System.out.println(str1.compareTo(str2)); // compare two string
 * System.out.println(str1.contains("shu")); // return true if str1 contains shu
 * System.out.println(str1.startsWith("s")); // return true if str1 starts with
 * shu and otherwise return false
 * System.out.println(str1.endsWith("am")); // return true if str1 ends with am
 * otherwise return false
 * System.out.println(str1.toLowerCase()); // return all the string in lowercase
 * System.out.println(str1.toUpperCase()); // return a string with uppercase
 * System.out.println(str1.concat(str2)); // add both string in str1 and return
 * str1
 * 
 * 
 * String str = "Shubham";
 * System.out.println(str.substring(0, 5));
 * }
 * 
 * 
 * }
 * 
 * 
 * 
 * 
 * 
 * given a string s, print all the substring of s.
 * input: s = "abcd"
 * output: a ab abc abcd b bc bcd c cd d
 * 
 * public class string{
 * public static void main(String[] args) {
 * String s = "abcd";
 * for(int i=0; i<=3; i++){
 * for(int j=i+1; j<=4; j++){
 * System.out.print(s.substring(i,j) + " ");
 * }
 * }
 * }
 * }
 * 
 * 
 * 
 * 
 * public class string {
 * public static void main(String[] args) {
 * String str1 = "Shubham";
 * String str2 = "Shubham";
 * String str3 = new String("Shubham");
 * System.out.println(str1 == str3);
 * System.out.println(str1.equals(str3));
 * }
 * }
 * 
 * 
 * 
 * String builder ---> string builder is used to because their is no method of
 * setCharAt at String
 * 
 * 
 * public class string{
 * public static void main(String[] args) {
 * StringBuilder str = new StringBuilder("Shubham");
 * str.append(" Pathak"); // append string ,character , integer
 * System.out.println(str);
 * str.setCharAt(0, 'm'); // setCharAt function is used to set a character at
 * particular index
 * System.out.println(str);
 * str.insert(6, 'x'); // insert a given character in an string
 * System.out.println(str);
 * str.deleteCharAt(7); // delete a character at particular index
 * System.out.println(str);
 * str.deleteCharAt(2); // delete a character at particular index
 * System.out.println(str);
 * str.reverse(); // reverse a string
 * System.out.println(str);
 * str.delete(2, 6); // delete a charcter with index 2 to 6
 * System.out.println(str);
 * str.reverse();
 * System.out.println(str);
 * System.out.println(str.substring(2)); // substring is used to display a
 * string with given index
 * 
 * }
 * }
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * convert the string uppercase to lowercase and lowercase to uppercase
 * 
 * public class string{
 * public static void main(String[] args) {
 * String str = "PhysICS";
 * System.out.println(str.toLowerCase());
 * }
 * }
 * 
 * 
 * public class string{
 * public static void main(String[] args) {
 * String str = "PhysICS";
 * String toggledStr = "";
 * 
 * for(int i=0; i<str.length(); i++){
 * char ch = str.charAt(i);
 * 
 * if(Character.isUpperCase(ch)){
 * toggledStr += Character.toLowerCase(ch);
 * }
 * else{
 * toggledStr += Character.toUpperCase(ch);
 * }
 * }
 * System.out.println(toggledStr);
 * }
 * }
 * 
 * 
 * 
 * 
 * 
 * 
 * palindrome substring
 * 
 * 
 * public class string{
 * public static void main(String[] args) {
 * String str = "abcdcba";
 * StringBuilder gtr = new StringBuilder(str);
 * gtr.reverse();
 * 
 * if(str.equals(gtr.toString())){
 * System.out.println("String is palindrome");
 * }
 * else{
 * System.out.println("String is not palindrome");
 * }
 * }
 * }
 * 
 * 
 * public class string{
 * public static void main(String[] args) {
 * String str = "abcdcba";
 * String gtr = "";
 * 
 * for(int i=str.length(); i>=0; i--){
 * if(str.equals(args))
 * }
 * }
 * }
 * 
 * 
 * 
 * // Print All Subsequences of a String
 * // Write a Java program to generate and print all subsequences of a given
 * string using recursion.
 * 
 * 
 * public class string {
 * public static void subsequences(String input, String current, int index){
 * if(index == input.length()){
 * System.out.println(current);
 * return;
 * }
 * }
 * public static void main(String[] args) {
 * String input = "abc";
 * }
 * }
 * 
 * 
 * 
 * 
 * // substring(i, j) and substring(i)
 * 
 * 
 * public class string {
 * public static void main(String[] args) {
 * String s = "physics";
 * for(int i=2; i<4; i++){
 * System.out.print(s.substring(i));
 * }
 * }
 * }
 * 
 * 
 * 
 * // print a substring of sequene
 * 
 * public class string {
 * public static void main(String[] args) {
 * String str = "abcd";
 * for(int i=0; i<4; i++){
 * for(int j=i+1; j<=4; j++){
 * System.out.print(str.substring(i, j) + " ");
 * }
 * }
 * }
 * }
 * 
 * 
 * 
 * // used recursion
 * 
 * public class string {
 * public static void subsequences(String str){
 * for(int i=0; i < str.length(); i++){
 * for(int j=i+1; j<=str.length(); j++){
 * System.out.print(str.substring(i,j) + " ");
 * }
 * }
 * }
 * public static void main(String[] args) {
 * String str = "abcd";
 * subsequences(str);
 * 
 * }
 * }
 * 
 * 
 * 
 * 
 * // Print All Subsequences of an Array
 * // Given an array of integers, generate all possible subsequences and print
 * them.
 * 
 * public class string {
 * public static void subsequencesDisplay(int[] arr){
 * for(int i=0; i<arr.length; i++){
 * for(int j=i+1; j<=arr.length; j++){
 * System.out.println(arr.substring(i,j));
 * }
 * }
 * 
 * }
 * public static void main(String[] args) {
 * int[] arr = {1, 2, 3};
 * subsequencesDisplay(arr);
 * 
 * }
 * }
 * 
 * 
 * 
 * //Count Subsequences of a String
 * // Modify the previous program to count and return the number of subsequences
 * of a given string.
 * 
 * 
 * public class string {
 * public static int countSubSequnece(String str){
 * int count = 0;
 * for(int i=0; i<str.length(); i++){
 * for(int j=i+1; j<=str.length(); j++){
 * System.out.print(str.substring(i,j) + " ");
 * count++;
 * }
 * }
 * return count;
 * }
 * public static void main(String[] args) {
 * String str = "abcd";
 * System.out.println("\nTotal Subsequence: " + countSubSequnece(str));
 * }
 * }
 * 
 * 
 */

// subsequence

// public class string {
// public static void subsequencesDisplay(String str) {
// for (int i = 0; i < str.length(); i++) {
// for (int j = i + 1; j <= str.length(); j++) {
// System.out.print(str.subSequence(i, j) + " ");
// }
// }
// }

// public static void main(String[] args) {
// String str = "abcd";
// subsequencesDisplay(str);
// }
// }

// total subsequence count

// public class string {
// public static void subsequence(String str) {
// int count = 0;
// for (int i = 0; i < str.length(); i++) {
// for (int j = i + 1; j <= str.length(); j++) {
// System.out.println(str.substring(i, j));
// count++;
// }
// }
// System.out.println(count);
// }

// public static void main(String[] args) {
// String str = "abcd";

// subsequence(str);
// }
// }

// palindrome check

// public class string {
// public static boolean isPalindrome(String str) {
// StringBuilder reversed = new StringBuilder(str);

// reversed.reverse();

// return str.equals(reversed.toString());
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter a String: ");
// String str = sc.nextLine();

// if (isPalindrome(str)) {
// System.out.println("String is plaindrome");
// } else {
// System.out.println("String is not palindrome");
// }
// }
// }