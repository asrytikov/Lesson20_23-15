package p3;

import p2.People;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        Stream<Integer> integerStream = Stream.of(1,2,3,4,-3,-2,-1,5,6,7);
        //integerStream.sorted().takeWhile(x -> x<=3).forEach(System.out::println);
        //integerStream.dropWhile(x -> x<=3).forEach(System.out::println);
        Stream<Integer> integerStream1 = Stream.of(100, 200, 300, 2222);

        Stream.concat(integerStream, integerStream1).forEach(System.out::println);

        Stream<Integer> integerStream2 = Stream.of(3,4,4,5,5,51,1,2,3,3,4,4,5,5,5);
        //integerStream2.distinct().forEach(System.out::println);

        //integerStream2.skip(2).limit(5).forEach(System.out::println);

        //System.out.println(integerStream2.distinct().count());

        List<String> names = new ArrayList<>();
        Collections.addAll(names, "Alex", "Pavel", "Ivan", "Masha", "Grigorij Ivanovich");
        //Optional<String> first =  names.stream().findFirst();
        //Optional<String> first =  names.stream().findAny();
        //System.out.println(first.get());

        boolean allM = names.stream().allMatch(s -> s.length()>3);
        System.out.println(allM);

        boolean anyM = names.stream().anyMatch(s -> s.length()>10);
        System.out.println(anyM);

        boolean noneM = names.stream().noneMatch(s -> s=="Katya");
        System.out.println(noneM);

        /*Optional<Integer> min = integerStream2.min(Integer::compare);
        System.out.println(min.get());*/
        /*Optional<Integer> max = integerStream2.max(Integer::compare);
        System.out.println(max.get());*/

        /*Optional<Integer> result = integerStream2.reduce((x,y)->x+y);
        System.out.println(result.get());*/

        int res = integerStream2.reduce(1000, (x,y)->x+y);
        System.out.println(res);

        Stream<People> peopleStream = Stream.of(new People("Masha", 30, 50000),
                new People("Alex", 22, 45000), new People("Vasiliy", 35, 100_000));

        int sumSalary = peopleStream.reduce(0,
                (x, y) -> {
                    if (y.getSalary() >= 50000)
                        return x + y.getSalary();
                    else
                        return x + 0;
                },
                (x,y)->x+y
                );
        System.out.println(sumSalary);









    }

}
