package main.java.com.rudkin.headcounter;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class HeadCounter {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        fillListWithRandom0toNineInt(list, 100);
        countSameIntegers(list);
    }

    public static void fillListWithRandom0toNineInt(List<Integer> list, int elements) {
        for (int i = 0; i < elements; i++) {
            list.add(new Random().nextInt(10));
        }

    }

    public static void countSameIntegers(@NotNull List<Integer> list) {
        Map<Integer, Long> map = list.stream()
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        System.out.println(map);
    }
}
