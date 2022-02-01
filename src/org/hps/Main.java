package org.hps;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Long> partitions = Arrays.asList(Long.valueOf("5"),Long.valueOf("5"),Long.valueOf("1"), Long.valueOf("4"));
        int binCapacity = 5;
        FirstFitDecreasing algorithm = new FirstFitDecreasing(partitions,binCapacity);
        algorithm.solve();
        algorithm.showResults();
    }
}
