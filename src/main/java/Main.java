package main.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        List<Integer> array = new ArrayList<>();
        System.out.println("========Please enter ten numbers, after each press key Enter========");


        while (array.size() < 10) {
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                array.add(Integer.parseInt(reader.readLine()));
            } catch (NumberFormatException e) {
                System.out.println("You entered an incorrect number, please enter " + (10 - array.size()) + " more numbers");
            }
        }

        EvenComparator evenComparator = new EvenComparator();
        Set<Integer> set = new TreeSet<>(evenComparator);

        set.addAll(array);

        System.out.println(set);

    }
}
