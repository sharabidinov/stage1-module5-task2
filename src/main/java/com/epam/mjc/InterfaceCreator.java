package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;

public class InterfaceCreator {
    public static void main(String[] args) {

    }

    public Operation<Integer> divideBy(Integer divider) {
        return (list) -> {
            List<Integer> result = new ArrayList<>();
            for (Integer integer : list) {
                result.add(integer / divider);
            }
            return result;
        };
    }
}
