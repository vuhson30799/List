package SearchAlgorithrm;

import java.util.ArrayList;

public class BinarySearchRecursive {
    public static void main(String[] args) {
        int[] arrTest1 = {1,2,3,4,5,6,7,8,9};
        int[] arrTest2 = {1,2,3,4,5,6,7,8};
        System.out.println("Binary search for 3 in arrTest1: " + binarySearch(arrTest1,3));
        System.out.println("Binary search for 10 in arrTest1: " + binarySearch(arrTest1,10));
        System.out.println("Binary search for 6 in arrTest2: " + binarySearch(arrTest2,6));
        System.out.println("Binary search for 13 in arrTest1: " + binarySearch(arrTest2,13));
    }
    public static int binarySearch (int[] arr,int key){
        int length = arr.length / 2;
        int[] newArr;
        if (length == 0){
            if (key == arr[length]) {
                return length;
            }else {
                return -1;
            }
        }
       if (key < arr[length]){
           newArr = new int[length];
           for (int i = 0; i < length; i++) {
               newArr[i] = arr[i];
           }
           return binarySearch(newArr,key);
       }else if (key > arr[length]){
           if (arr.length % 2 == 0){
                newArr = new int[length - 1];
           }else{
               newArr = new int[length];
           }
           int j = 0;
           for (int i = length + 1; i < arr.length; i++) {
               newArr[j++] = arr[i];
           }
           int result = binarySearch(newArr,key);
           if (result != -1){
               return length + result + 1;
           }else {
               return result;
           }
       }else {
           return length;
       }
    }
}
