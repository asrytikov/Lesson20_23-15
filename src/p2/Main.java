package p2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Stream<People> peopleStream = Stream.of(new People("Masha", 30, 50000),
                new People("Alex", 22, 45000), new People("Vasiliy", 35, 100_000));
        //peopleStream.filter(people -> people.getAge()>=30).forEach(people -> System.out.println(people.getName()));

        //peopleStream.map(people -> people.getName()).forEach(System.out::println);

        /*peopleStream.map(people -> "Name: " + people.getName() + " Salary: " + people.getSalary())
                    .forEach(System.out::println);*/

        /*peopleStream.flatMap(people -> Stream.of(
                String.format("Name: %s Age: %d", people.getName(), people.getAge()),
                String.format("Name: %s Salary: %d", people.getName(), people.getSalary())
        )).forEach(System.out::println);*/

        peopleStream.sorted(new PeopleComparator()).forEach(System.out::println);

        List<String> names = new ArrayList<>();
        Collections.addAll(names, "Alex", "Pavel", "Ivan", "Masha");
        names.stream().sorted().forEach(System.out::println);


    }

}

class PeopleComparator implements Comparator<People>{

    @Override
    public int compare(People people, People people1) {
        return people.getName().toUpperCase().compareTo(people1.getName().toUpperCase());
    }
}
