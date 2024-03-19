import domain.Person;
import domain.Pet;

import java.util.*;

public class Main {
    public static Person[] array = new Person[10];
    public static Random random = new Random();

    public static void generate() {
        array[0] = new Person(1L, "Valera", random.nextInt(100));
        array[1] = new Person(2L, "Alex", random.nextInt(100));
        array[2] = new Person(3L, "Bob", random.nextInt(100));
        array[3] = new Person(4L, "Alice", random.nextInt(100));
        array[4] = new Person(5L, "Egor", random.nextInt(100));
        array[5] = new Person(6L, "Mike", random.nextInt(100));
        array[6] = new Person(7L, "Donald", random.nextInt(100));
        array[7] = new Person(8L, "John", random.nextInt(100));
        array[8] = new Person(9L, "Ryan", random.nextInt(100));
        array[9] = new Person(10L, "Nataly", random.nextInt(100));
    }

    public static void main(String[] args) {
        generate();
        System.out.println(Arrays.toString(array));
        Arrays.sort(array, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        System.out.println(Arrays.toString(array));
        System.out.println();

        generate();
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println();

        List<Person> personList = new ArrayList<>();
        personList.add(new Person(1L, "Valera", random.nextInt(100)));
        personList.add(new Person(2L, "Alex", random.nextInt(100)));
        personList.add(new Person(3L, "Bob", random.nextInt(100)));
        personList.add(new Person(4L, "Alice", random.nextInt(100)));
        personList.add(new Person(5L, "Egor", random.nextInt(100)));
        personList.add(new Person(6L, "Mike", random.nextInt(100)));
        personList.add(new Person(7L, "Donald", random.nextInt(100)));
        personList.add(new Person(8L, "John", random.nextInt(100)));
        personList.add(new Person(9L, "Ryan", random.nextInt(100)));
        personList.add(new Person(10L, "Nataly", random.nextInt(100)));
        System.out.println(personList);
        Collections.sort(personList);
        System.out.println(personList);
        System.out.println();

        Set100Int set100Int = new Set100Int();

        set100Int.add(52);
        System.out.println(set100Int.contains(52));
        System.out.println(set100Int.contains(77));
        set100Int.add(77);
        System.out.println(set100Int.contains(77));
        set100Int.add(5);
        System.out.println(set100Int.add(1111));
        System.out.println();

        Set<Person> personSet = new HashSet<>();
        personSet.add(new Person(1L, "Valera", random.nextInt(100)));
        personSet.add(new Person(2L, "Alex", random.nextInt(100)));
        personSet.add(new Person(3L, "Bob", random.nextInt(100)));
        personSet.add(new Person(4L, "Valera", random.nextInt(100)));
        personSet.add(new Person(4L, "Valera", random.nextInt(100)));
        System.out.println(personSet);



        Map<String, Integer> productHashMap = new HashMap<>();
        productHashMap.put("хлеб", 35);
        productHashMap.put("молоко", 60);
        productHashMap.put("ряженка", 60);
        productHashMap.put("сыр", 350);

        System.out.println(productHashMap);
        Integer bread = productHashMap.put("хлеб", 70);
        System.out.println(productHashMap);
        System.out.println(bread);
        System.out.println("=====================");
        for (Map.Entry<String, Integer> entry: productHashMap.entrySet()) {
            if (entry.getKey().equals("хлеб") || entry.getKey().equals("ряженка")) {
                System.out.println(entry.getValue());
            }
        }
        System.out.println("=====================");
        for (Integer value : productHashMap.values()) {
            System.out.println(value);
        }
        System.out.println("=====================");
        for (String s : productHashMap.keySet()) {
            System.out.println(s);
        }
        System.out.println("=====================");
        System.out.println(productHashMap.get("хлеб"));
        System.out.println("=====================");

        Map<String, Integer> productTreeMap = new TreeMap<>();
        productHashMap.put("хлеб", 35);
        productHashMap.put("молоко", 60);
        productHashMap.put("ряженка", 60);
        productHashMap.put("сыр", 350);
        System.out.println(productTreeMap);
        System.out.println("=====================");

        Map<Person, Pet> personPetTreeMap = new TreeMap<>();
        personPetTreeMap.put(
                new Person(1, "Иван", 18),
                new Pet("Шарик")
        );
        personPetTreeMap.put(
                new Person(2, "Александр", 29),
                new Pet("Джава")
        );
        System.out.println(personPetTreeMap);
    }
}