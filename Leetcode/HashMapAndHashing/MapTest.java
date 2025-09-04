package HashMapAndHashing;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        String s1 = new String("hello"); // new object
        String s2 = new String("hello"); // another new object
        String s3 = "hello"; // another new object
        String s4 = "hello"; // another new object

        map.put(s3, "first");
        map.put(s4, "second");

        System.out.println(map);
    }
}
