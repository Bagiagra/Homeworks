package by.overone.lesson21;

import java.util.*;

public class CountUnique {
    public static List<Integer> setArray() {
        Random random = new Random();
        List<Integer> listOfFigures = new ArrayList<>(20);
        while (listOfFigures.size() < 20) {
            int a = random.nextInt(30);
            listOfFigures.add(a);
        }
        return listOfFigures;
    }


    public static int countUnique( List<Integer> listOfFigures) {
        Set<Integer> uniqueNumber = new HashSet<>();
        for (int x : listOfFigures) {
            uniqueNumber.add(x);
        }
        return uniqueNumber.size();
    }

}
