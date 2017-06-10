package algorithm.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BubbleSort {

    public static void main(final String[] args) {
        final int size = 100;
        final List<Integer> list = IntStream.range(0, size).boxed().collect(Collectors.toList());
        Collections.shuffle(list);
        final int[] value = list.stream().mapToInt(i -> i).toArray();
        System.out.println(Arrays.toString(value));
        sort(value);
        System.out.println(Arrays.toString(value));
        if (Arrays.equals(value, IntStream.range(0, size).toArray()) == false) {
            throw new AssertionError();
        }
    }

    static void sort(final int[] value) {
        for (int i = 0; i < value.length - 1; i++) {
            for (int j = i + 1; j < value.length; j++) {
                if (value[i] > value[j]) {
                    swap(value, i, j);
                }
            }
        }
    }

    static void swap(final int[] value, final int i, final int j) {
        final int temp = value[i];
        value[i] = value[j];
        value[j] = temp;
    }
}
