package Leetcode.HashMapAndHashing;

import java.util.HashMap;
import java.util.Map;

public class HashMapCollisionDemo {
    public static void main(String[] args) {

        // Two different keys but same hashCode
        String k1 = "FB";   // special strings
        String k2 = "Ea";   // they have SAME hashCode in Java

        System.out.println("k1.hashCode(): " + k1.hashCode());
        System.out.println("k2.hashCode(): " + k2.hashCode());

        Map<String, String> map = new HashMap<>();
        map.put(k1, "First");
        map.put(k2, "Second");

        System.out.println("Get k1: " + map.get(k1)); // "First"
        System.out.println("Get k2: " + map.get(k2)); // "Second"

        //This makes them a classic example for teaching hash collisions.
    }
}