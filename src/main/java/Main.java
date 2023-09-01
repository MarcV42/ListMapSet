import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<Student> stundents = new HashSet<>();
        stundents.add(new Student("a1234", "Alice"));
        stundents.add(new Student("a1234", "Alice"));

        System.out.println(stundents);

    }

    //SET:
    public static void setDemo() {
        Set<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        System.out.println(fruits);
        System.out.println(fruits.contains("Apple"));

        fruits.remove("Apple");

        System.out.println(fruits);
    }

    public static void ausgelagertausMain() {

        // MAP:
        Map<String, Integer> map = new HashMap<>();

        map.put("Alice", 95);
        map.put("Franzi", 77);
        map.put("Alice", 42);

        System.out.println(map);

        System.out.println(map.get("Alice"));

        System.out.println(map.containsKey("Balala"));

        map.remove("Franzi");
        System.out.println(map);


    }
}
