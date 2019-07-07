package main.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        List<Integer> array = new ArrayList<>();
        System.out.println("========Please enter ten numbers, after each press key Enter========");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            array.add(Integer.parseInt(reader.readLine()));
        }


        EvenComparator evenComparator = new EvenComparator();
        Set<Integer> set = new TreeSet<>(evenComparator);

        set.addAll(array);

        System.out.println(set);

    }
}
