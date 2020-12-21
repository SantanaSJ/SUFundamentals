package OrderByAge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> list = new ArrayList<>();

        String line = scanner.nextLine();
        while (!line.equals("End")) {
            String[] parts = line.split(" ");
            String name = parts[0];
            String ID = parts[1];
            int age = Integer.parseInt(parts[2]);

            Person person1 = new Person(name, ID, age);
            list.add(person1);
            line = scanner.nextLine();
        }
        list.stream()
                .sorted((a, b) -> {
                    return Integer.compare(a.getAge(), b.getAge());
                })
                .forEach(person -> System.out.println(person.toString()));
    }
}
