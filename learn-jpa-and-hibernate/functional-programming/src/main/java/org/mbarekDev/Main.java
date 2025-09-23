package org.mbarekDev;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Integer> nums = List.of(10, 9, 13, 4, 6, 2, 12, 15);
        List<String> stucks = List.of("spring", "spring boot", "spr", "API", "ms", "AWS", "Docker", "Kubernetes");
        stucks.stream()
                .filter(spring -> spring.contains("spring"))
                .filter(spring -> spring.length() <= 6)
                .forEach(System.out::println);
        nums.stream()
                .filter(numbs -> numbs % 2 != 0)
                .map(numbs -> numbs * numbs * numbs)
                .forEach(System.out::println);

        List<String> fruits = List.of("apple", "banana", "mango");

        Predicate<? super String> predicate = fruit -> fruit.startsWith("c");
        Optional<String> optional = fruits.stream().filter(predicate).findFirst();
        System.out.println(optional);
        System.out.println(optional.isEmpty());
        System.out.println(optional.isPresent());
        System.out.println(optional.get());

        Optional<String> fruit=Optional.of("banana");
        Optional<String> empty= Optional.empty();
        System.out.println(fruit);
        System.out.println(empty);

        // printAllNumbewrInListStructured(nums);
        // printOddNumbewrInListStructured(nums);
    }

    private static void printAllNumbewrInListStructured(List<Integer> numbers) {
        numbers.stream().forEach(System.out::println);
        // for (int number : numbers) {
        // System.out.println(number);
        // }
    }

    private static void printOddNumbewrInListStructured(List<Integer> numbers) {
        numbers.stream().filter(num -> num % 2 != 0).forEach(System.out::println);
    }

    private static void printSquersNumbewrInListStructured(List<Integer> numbers) {
        numbers.stream()// convert to stream
                .map(num -> num * 2)
                .forEach(System.out::println);
    }

    private static boolean printEven(int num) {
        return num % 2 == 0;
    }

}