package helloObjekte;

import java.util.Arrays;

public class ArrayTest {

    public void sort() {
        int[] sortierArray = {5, 3, 2, 1, 4};
        Arrays.sort(sortierArray);
        System.out.println(Arrays.toString(sortierArray));
    }

    public void search() {
        int[] searchArray = {5, 3, 2, 1, 4};
        int index = Arrays.binarySearch(searchArray, 0, searchArray.length-1, 3);
        if(index == - 1) {
            System.out.println("Nicht gefunden");
        } else {
            System.out.println("Gefunden an Index: " + index);
        }
    }

    public void compare() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 4};
        if(Arrays.equals(array1, array2)) {
            System.out.println("Arrays sind gleich");
        } else {
            System.out.println("Arrays sind nicht gleich");
        }
    }

    public String[] testMethod() {
        String[] test = {"Integer", "Boolean", "Character", "Long", "Double", "Float", "Short", "Byte"};
        return test;
    }

    public String[] sortMethod(String[] test) {
        Arrays.sort(test);
        return test;
    }

}
