package w3school.stack;

import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(4);
        while (!s.empty()){
            System.out.println(s.pop());
        }
    }

}
