package com.remousses.interview.exercises;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListSet {

    public static void main(String[] args) {
        List<Integer> l1 = List.of(1,7,4,7,1);
        Set<Integer> s1 = new HashSet<>(l1);

        System.out.println(l1.stream().reduce(0, Integer::sum).equals(s1.stream().reduce(0, Integer::sum)));


        List<CustomObject> l2 = List.of(
                new CustomObject(1),new CustomObject(7),new CustomObject(4),
                new CustomObject(7),new CustomObject(1)
        );
        Set<CustomObject> s2 = new HashSet<>(l2);

        System.out.println(l2.stream().map(CustomObject::getNumber).reduce(0, Integer::sum).equals(s2.stream().map(CustomObject::getNumber).reduce(0, Integer::sum)));
    }
}

@Getter
@AllArgsConstructor
class CustomObject {
    private int number;
}
