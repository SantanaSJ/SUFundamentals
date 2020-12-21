package OpinionPoll;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Person> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] personalInfo = scanner.nextLine().split(" ");
            String name = personalInfo[0];
            int age = Integer.parseInt(personalInfo[1]);

            Person person = new Person(name, age);
            list.add(person);
        }
        list.stream()
                .sorted((a, b) -> {
                    return a.getName().compareTo(b.getName());
                })
                .filter(p -> p.getAge() > 30)
                .forEach(person -> {
                    System.out.printf("%s - %d%n", person.getName(), person.getAge());
                });
    }


}

