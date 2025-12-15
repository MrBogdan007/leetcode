package w3school.stack;

import java.util.Arrays;
import java.util.Stack;

public class CustomStack {
    private int[] arr;
    private int top;

    public  CustomStack(int size){
        arr = new int [size];
        top = -1;
    }
    public static void main(String[] args) {
//        System.out.println("Initialize a stack:");
//        CustomStack stack = new CustomStack(5);
//        System.out.println("Is the stack empty? " + stack.isEmpty());
//        System.out.println("\nInput some elements on the stack:");
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.push(4);
//        stack.push(5);
//        stack.display();
//        System.out.println("\nTop element of the stack: " + stack.peek());
//        System.out.println("\nRemove two element from the stack:");
//        stack.pop();
//        stack.pop();
//        stack.display();
//        System.out.println("\nTop element of the stack after popping: " + stack.peek());
//        System.out.println("\nIs the stack empty? " + stack.isEmpty());
        CustomStack stack = new CustomStack(6);
        stack.push(1);
        stack.push(3);
        stack.push(2);
        stack.push(0);
        stack.push(7);
        stack.push(5);
        stack.display();
       stack.sort();

        stack.display();
    }

    private int[] sort2() {
       return Arrays.stream(arr).sorted().toArray();
    }
    //checking if peeked element from the left is more than popped last element.  as top is -1 in tempStack, and i will always pick end element from arr.
    //pushing new stack from -1 top element in tempStack and populating it top(-1 becomes 0)
    public void sort() {
        CustomStack sorted = new CustomStack(arr.length);

        // Move elements to "sorted" stack in sorted order
        while (!isEmpty()) {
            int current = pop();

            // Move bigger elements back to original stack
            while (!sorted.isEmpty() && sorted.peek() > current) {
                push(sorted.pop());
            }

            // Insert current element in correct position
            sorted.push(current);
        }

        // Move sorted elements back into original stack
        while (!sorted.isEmpty()) {
            push(sorted.pop());
        }
    }


    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.print("Stack elements: ");
            for (int i = top; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
    private void push(int i) {
        top++;
        arr[top] = i;
    }
    private int pop(){
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        } else {
            int poppedElement = arr[top];
            top--;
            return poppedElement;
        }
    }
    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return arr[top];
        }
    }


    private boolean isEmpty() {
        return top == -1;
    }
}
