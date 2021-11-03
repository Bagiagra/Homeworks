package by.overone.lesson21;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Words {
    public static void main(String[] args) {
        ArrayList<String> englishWords = new ArrayList<>();
        englishWords.add("it");
        englishWords.add("they");
        englishWords.add("she");
        englishWords.add("he");
        englishWords.add("we");
        englishWords.add("I");
        englishWords.add("they");
        englishWords.add("she");
        englishWords.add("he");
        englishWords.add("we");
        englishWords.add("They");
        englishWords.add("She");
        englishWords.add("he");
        englishWords.add("We");

        System.out.println(englishWords);

        Set<String> uniqueWords = new HashSet<>();
        for (String x : englishWords) {
            uniqueWords.add(x);
        }
        System.out.println(uniqueWords);
    }
}

