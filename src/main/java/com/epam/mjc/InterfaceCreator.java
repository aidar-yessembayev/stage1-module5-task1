package com.epam.mjc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class InterfaceCreator {
    public Predicate<List<String>> isValuesStartWithUpperCase() {
        return x -> {

            for (int i = 0; i < x.size(); i++) {
                String word = x.get(i);

                if (!(word.equals(word.toUpperCase()))) {
                    return false;
                }
            }

            return true;
        };
    }

    public Consumer<List<Integer>> addEvenValuesAtTheEnd() {
        return x -> {

            for (int i = 0; i < x.size(); i++) {
                int value = x.get(i);

                if (value % 2 == 0) {
                    x.add(value);
                }
            }

        };
    }

    public Supplier<List<String>> filterCollection(List<String> values) {
        return () -> {
            List<String> result = new ArrayList<>();

            if (values.size() > 0) {

                for (int i = 0; i < values.size(); i++) {
                    String sentence = values.get(i);

                    if (sentence.equals(sentence.toUpperCase()) && sentence.endsWith(".")) {
                        String[] words = sentence.split(" ");

                        if (words.length > 3) {
                            result.add(sentence);
                        }
                    }
                }

            }

            return result;
        };
    }

    public Function<List<String>, Map<String, Integer>> stringSize() {
        return x -> {
            Map<String, Integer> result = new HashMap<>();

            if (x.size() > 0) {

                for (int i = 0; i < x.size(); i++) {
                    int x_len = x.get(i).length();
                    result.put(x.get(i), x_len);
                }

            }

            return result;
        };
    }

    public BiFunction<List<Integer>, List<Integer>, List<Integer>> concatList() {
        return (list1, list2) -> {
            List<Integer> result = new ArrayList<>();

            if (list1.size() > 0) {

                for (int i = 0; i < list1.size(); i++) {
                    result.add(list1.get(i));
                }

            }

            if (list2.size() > 0) {

                for (int i = 0; i < list2.size(); i++) {
                    result.add(list2.get(i));
                }

            }

            return result;
        };
    }
}
