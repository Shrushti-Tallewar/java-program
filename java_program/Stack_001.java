// Q. Find the next greater element
// Given an array for every element find the next greater element on the right side. If no greater element exists print -1.

import java.util.*;

public class Stack_001 {

    public static void main(String[] args) {
        int[] A = {4, 5, 2, 10};
        nextGreater(A);
    }

    static void nextGreater(int[] array) {

        Stack<Integer> stack = new Stack<>();
        int n = array.length;
        int[] result = new int[n];

        for (int i = n - 1; i >= 0; i--) {

            while (!stack.isEmpty() && stack.peek() <= array[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = stack.peek();
            }

            stack.push(array[i]);
        }

        for (int i = 0; i < n; i++) {
            System.out.println(array[i] + " --> " + result[i]);
        }
    }
}









