import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        // Erstellen einer HashMap für Studenten
        Map<String, Student> studentsMap = new HashMap<>();

        // Hinzufügen von Studenten zur HashMap
        Student student1 = new Student("a1234", "Alice");
        Student student2 = new Student("b5678", "Bob");

        studentsMap.put(student1.getId(), student1);
        studentsMap.put(student2.getId(), student2);


        // Ausgabe der Studenten in der HashMap
        for (Map.Entry<String, Student> entry : studentsMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

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

    public static void ausgelagert2(){
        Set<Student> stundents = new HashSet<>();
        stundents.add(new Student("a1234", "Alice"));
        stundents.add(new Student("a1234", "Alice"));

        System.out.println(stundents);
    }
}
