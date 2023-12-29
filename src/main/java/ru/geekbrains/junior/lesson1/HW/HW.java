package ru.geekbrains.junior.lesson1.HW;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class HW {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5);

        OptionalDouble avg = nums.stream()
                .filter(x->x%2==0)
                .mapToInt(x->x).average();
        System.out.println(avg.getAsDouble());
    }
}
