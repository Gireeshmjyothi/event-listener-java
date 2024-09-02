package com.event.listener.codingPractice;

import com.event.listener.events.Product;
import com.event.listener.interfaces.Drawable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

@Component
public class RunPracticeCode {

    @Autowired
    private Dev dev;

    public void runPracticeCode(){

        //sum all the even number from the array
        int[] arr = {1,2,3,4,5,6,7,8,9,10, 12, 17};
        System.out.println(Arrays.stream(arr).filter(value -> value%2==0).sum());
        System.out.println("sum of all the even number from the array : " + Practice.sumOfAllEvenNumber(arr));

        //finding the string count from the array
        String[] str = {"apple", "orange", "banana", "apple", "apple"};
        System.out.println(Arrays.stream(str).filter(value -> value.equals("apple")).count());

        List<String> strList = Arrays.asList("apple", "orange", "banana", "apple", "apple");
        System.out.println(strList.stream().filter(value -> value.equals("apple")).count());

        //finding the min and max value from the array
        int[] minMaxArr = {-1,-3,0,2,4,3,4,23,3};
        int[] output = Practice.findMinMax(minMaxArr);
        System.out.println("Min and Max value from the given array : " + output[0] +", "+output[1]);

        //finding two pair which is sum of the given number
        int[] find = {-1, -3, 0, 2, 4, 3, 4, 23, 3};
        int[] result = Practice.findSum(find, 26);
        for (int x:result){
            System.out.print(x + " ");
        }
        System.out.println();

        //Without lambda expression java 8
        Drawable drawable = new Drawable() {
            public void draw(String name) {
                System.out.println("Drawable method calling without lambda expression : " + name);
            }
        };
        drawable.draw("Gireesh");

        //With lambda expression
        Drawable draw = (String name)->{
            System.out.println("Drawable method calling with lambda expression : " + name);
        };
        draw.draw("Raju");

        List<String> list  = new ArrayList<>();
        list.add("Rahul");
        list.add("Naveen");
        list.add("Rohan");
        list.add("John");

        list.forEach((name)-> System.out.println(name));

        List<Product> productList = new ArrayList<Product>();

        productList.add(new Product(11, "Samsung", 78099.99));
        productList.add(new Product(21, "Apple", 80053.99));
        productList.add(new Product(31, "Google", 76053.99));
        productList.add(new Product(41, "OnePluse", 50025.99));

        System.out.println("Sorting product list by name");
        productList.sort((p1, p2) -> {
            return p1.getProductName().compareTo(p2.getProductName());
        });

        for(Product list1 : productList){
            System.out.println("Sorted product list by name : " + list1.getId() + "," + list1.getProductName() + "," + list1.getPrice());
        }
//
//		List<String> strings = List.of("one","two","three","four","node");
//		var map = strings.stream()
//				.collect(groupingBy(String::length, counting()));
//		map.forEach((key, value) -> System.out.println(key + " :: " + value));

        //merge two sorted array
        int[] arr1 = {1,3,5,7,9};
        int[] arr2 = {2,4,6,8,8,10};
        int[] sortedArray = Practice.mergerTwoSortedArray(arr1, arr2);
        for(int i:sortedArray){
            System.out.print(i + " ");
        }

        System.out.println();

        //Remove char from string
        String str1 = "CloudTeCh";
        char ch = 'C';
        String removedString = Practice.removeGivenChar(str1, ch);
        System.out.println(removedString);

        //check two array values are same or not
        int[] array1 = {1,2,3,5,6,4};
        int[] array2 = {3,4,5,1,2,6};
        boolean isBothArraySame = Practice.compareTwoArray(array1, array2);
        if (isBothArraySame)System.out.println("Both the arrays are equals");
        else System.out.println("Both the arrays are not equals.");

        //Finding the frequency of character from the string
        Practice.findFreqOfString("abbcdcc");

        //Generating the largest value from the array
        int[] largestValue = {8,6,0,4,6,4,2,7};
        Practice.generateLargestValue(largestValue);

        //interview question
        Integer num1 = 100;
        Integer num2 = 100;
        Integer num3 = 500;
        Integer num4 = 500;

        if(num1 == num2){
            System.out.println("num1 == num2");
        }else {
            System.out.println("num1 != num2");
        }
        if(num3 == num4){
            System.out.println("num3 == num4");
        }else {
            System.out.println("num3 != num4");
        }

        //interview question
        Base x = new Base();
        Base y = new Derived();
        Derived z = new Derived();
        doPrint(x);
        doPrint(y);
        doPrint(z);

        //generating largest value from string array
        String[] string = {"3", "30", "4", "9", "0"};
        Practice.getLargestValue(string);

        //finding median value from the array
        int[] n1 = {1,2};
        int[] n2 = {3,4};

        double result1 = Practice.findMedianSortedArrays(n1,n2);
        System.out.println(result1);

        //finding group of element from the array
        Practice.groupOfElement();

        //Concatenating given string
        Practice.joinWord();

        //print 1 to 10 without loop
        Practice.printNumber(1);
        System.out.println();

        //String joiner java 8 feature
        Practice.stringJoiner();

        //Intersection of two array
        int[] interSec1 = {10,30,35,40,60, 40};
        int[] interSec2 = {30,60,10};
        Practice.printIntersection(interSec1, interSec2);
        System.out.println();

        Student student1 = new Student(1, "Alice");
        Student student2 = new Student(2, "Bob");
        Student student3 = new Student(1, "Alice");
        // Creating a HashMap
        HashMap<Student, String> studentMap = new HashMap<>();
        // Adding elements to the HashMap
        studentMap.put(student1, "A Grade");
        studentMap.put(student2, "B Grade");
        // Retrieving elements from the HashMap
        System.out.println("Grade of student1: " + studentMap.get(student1));
        System.out.println("Grade of student2: " + studentMap.get(student2));
        // Using student3 to retrieve a value
        System.out.println("Grade of student3: " + studentMap.get(student3));

        dev.build();

        WaterJug w = WaterJug.getInstance();
        System.out.println("get water : "+w.getWater(4));

        int[] l1 = {-5,6,8,-1,-2,1,0,3,-3,4,-4,5};
        Practice.reArrange(l1);
    }


    public static void doPrint(Base o){
        o.print();
    }
}

class  Base {
    public void print(){
        System.out.println("base");
    }
}
class Derived extends Base {
    public void print(){
        System.out.println("Derived");
    }
}
