import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        int[] nums = {-10, 10, 13, -5, 0, 9, 10, -3, 12, 16};
        int count = 0;
        for (int i: nums) {
            if (i>0) count++;
        }
        System.out.println(count);

        long c = IntStream.of(-10, 10, 13, -5, 0, 9, 10, -3, 12, 16).filter(x -> x>0).count();
        System.out.println(c);

        ArrayList<String> names = new ArrayList<>();
        Collections.addAll(names, "Alex", "Pavel", "Ivan", "Masha");
        names.stream().filter(x -> x.length() > 4).forEach(s -> System.out.println(s));

        Stream<String> namesStream = names.stream();
        namesStream = namesStream.filter(s -> s.length()>4);
        namesStream.forEach(s -> System.out.println(s));
        /*long number = namesStream.count();
        System.out.println(number);*/
        System.out.println("---------------");

        Stream<String> nStream = Arrays.stream(new String[]{"Alex", "Pavel", "Ivan", "Masha"});
        nStream.forEach(System.out::println);

        IntStream intStream = Arrays.stream(new int[]{1,2,3,4});
        intStream.forEach(System.out::println);

        Stream<String> namStream = Stream.of("Alex", "Pavel", "Ivan", "Masha");
        namStream.forEach(System.out::println);

        String[] namesArray = {"Alex", "Pavel", "Ivan", "Masha"};
        Stream<String> namesArrStream = Stream.of(namesArray);
        namesArrStream.forEach(System.out::println);







    }
}