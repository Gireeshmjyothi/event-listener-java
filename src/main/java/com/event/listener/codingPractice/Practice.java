package com.event.listener.codingPractice;

import org.springframework.stereotype.Component;

import java.util.*;
import java.util.stream.Collectors;

@Component
public class Practice {

    //sum all the even number from the array
    public static int sumOfAllEvenNumber(int[] arr){
        int sum = 0;
        for (int j : arr) {
            if (j % 2 == 0) {
                sum += j;
            }
        }
        return sum;
    }

    //finding the min and max value from the array
    public static int[] findMinMax(int[] arr){
        int min =0;
        int max = 0;
        int[] newArr = new int[2];
        for (int j : arr) {
            if (j < min) {
                min = j;
            }
            if (j > max) {
                max = j;
            }
        }
        newArr[0] = min;
        newArr[1] = max;
        return newArr;
    }

    //finding two pair which is sum of the given number
    public static int[] findSum(int[] arr, int num){
        int[] newArr = new int[2];
        for (int i = 0; i < arr.length-1; i++) {
            for(int j = i+1; j<arr.length - 1; j++){
                if((arr[i]+arr[j]) == num){
                    newArr[0] = arr[i];
                    newArr[1] = arr[j];
                }
            }
        }
        if(newArr[0]+newArr[1] == num){
            return newArr;
        }
        return arr;
    }

    //merge two sorted array
    public static int[] mergerTwoSortedArray(int[] arr1, int[]arr2){
        int[] mergedArray = new int[arr1.length + arr2.length];
        int i=0,j=0,k=0;

        while(i < arr1.length && j < arr2.length){
            if(arr1[i] <= arr2[j]){
                mergedArray[k++] = arr1[i++];
            }else {
                mergedArray[k++] = arr2[j++];
            }
        }
        while(i<arr1.length){
            mergedArray[k++] = arr1[i++];
        }
        while(j<arr2.length){
            mergedArray[k++] = arr2[j++];
        }
        return mergedArray;
    }

    //Remove char from string
    public static String removeGivenChar(String str, char ch){

        String newStr = "";
        for(int i = 0; i < str.length(); i++){
            if(!(str.charAt(i) == ch)){
               newStr +=str.charAt(i);
            }
        }

        return newStr;
    }

    //check two array values are same or not
    public static boolean compareTwoArray(int[] arr1, int[] arr2){
        int n = arr1.length;
        int m = arr2.length;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(n != m){
           return false;
        }
        for(int i = 0; i < n; i++){
            if(arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }

    //Finding the frequency of character from the string
    public static void findFreqOfString(String str){
        Map<Character, Integer> map = new HashMap<>();
        char ch;
        for (int i = 0; i < str.length(); i++){
            ch = str.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }else map.put(ch, 1);
        }
        System.out.println(map);
    }

    //Generating the largest value from the array
    public static void generateLargestValue(int[] arr){
        Arrays.sort(arr);
        StringBuilder largestValue = new StringBuilder();
        for(int i = arr.length -1; i >= 0; i--){
                largestValue.append(arr[i]);
        }

        System.out.println(Integer.parseInt(String.valueOf(largestValue)));
    }

    //generating largest value from string array
    public static void getLargestValue(String[] str){
        StringBuilder newStr = new StringBuilder();
        Arrays.sort(str, (num1, num2)-> (num2+num1).compareTo(num1+num2));

        for(String s : str){
            newStr.append(s);
        }

        System.out.println(newStr);
    }

    //finding median value from the array
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0, j = 0, k = 0;
        int[] arr = new int[nums1.length + nums2.length];

        while(i < nums1.length && j < nums2.length){
            if(nums1[i] <= nums2[j]){
                arr[k++] = nums1[i++];
            }else{
                arr[k++] = nums2[j++];
            }
        }

        while(i < nums1.length){
            arr[k++] = nums1[i++];
        }
        while(j < nums2.length){
            arr[k++] = nums2[j++];
        }
        boolean flag = arr.length % 2 == 0;
        double result;
        if(flag){
            int a = arr.length/2;
            int b = a - 1;
            result = (double) (arr[a] + arr[b]) /2;
        }else {
            result = arr[arr.length/2];
        }
        System.out.println("Result : "+result);
        return result;
    }

    //finding group of element from the array
    public static void groupOfElement(){
        List<String> strings = Arrays.asList("apple", "banana", "orange", "grape", "pineapple","jackFruit");
       Map<Integer, List<String> > map = strings.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(map);
        String str = 1+2+"One"+1+2+"Two";
        System.out.println(str);
    }

    public static void joinWord(){
        String[] str = {"Hello", " ", "world", "!"};
        String joinedString = Arrays.stream(str).collect(Collectors.joining());
        StringBuilder newStr = new StringBuilder();
        for(String s:str){
            newStr.append(s);
        }
        System.out.println(newStr);
        System.out.println(joinedString);

        //intersection of two int arrays
        int[] n = {1,2,2,3,3};
        int[] m = {9,3,4,1,2};
        Arrays.stream(n).filter(x -> Arrays.stream(m).anyMatch(y -> y==x)).distinct().forEach(value -> System.out.print(value + " "));
        System.out.println();
    }

    //printing 1 to 10 without loop
    public static void printNumber(int number){
        if(number<=10){
            System.out.print(number + " ");
            printNumber(number+1);
        }
    }

    //String joiner java 8 feature
    public static void stringJoiner(){
        StringJoiner sj1 = new StringJoiner(",", "{","}");
        sj1.add("A").add("B").add("C");
        System.out.println(sj1);
        System.out.println(sj1.length());

        StringJoiner sj2 = new StringJoiner(":");
        sj2.add("P").add("Q");
        System.out.println(sj2);

        sj1.merge(sj2);
        System.out.println(sj1);
    }

    //Intersection of two array
    public static void printIntersection(int[] arr1, int[] arr2){
        Set<Integer> s = new HashSet<>();
        for (int j : arr1) {
            s.add(j);
        }
        for (int j : arr2) {
            if (s.contains(j)) {
                System.out.print(j + " ");
            }
        }
    }

    public static void reArrange(int[] arr){
        int temp;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length -1-i; j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i : arr){
            System.out.print(i + " ");
        }
    }

}
