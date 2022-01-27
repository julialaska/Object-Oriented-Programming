// Program wykorzystujący zbiór typu TreeSet
// w celu pokazania wszystkich słów odczytanych z pliku o rozszerzeniu TXT

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class WordsInTreeSetDemo
{
    public static void main(String[] args) throws FileNotFoundException {

        // Klasa TreeSet implementuje interfejs Set
        Set<String> words = new TreeSet<>();
        long totalTime = 0;

        File file = new File("WordsInTreeSetDemo\\alice30.txt");
//        File file1 = new File("WordsInTreeSetDemo\\lordoftherings_chapter1.txt");
        Scanner in = new Scanner(file);
        while (in.hasNext()) {
            String word = in.next();
            long callTime = System.currentTimeMillis();
            words.add(word);
            callTime = System.currentTimeMillis() - callTime;
            totalTime += callTime;
        }

        Iterator<String> iter = words.iterator();
        for (int j = 1; j <= 20; ++j) {
            System.out.println(iter.next());
        }

        System.out.println(". . .\n");
        System.out.println(words.size() + " unikalnych słów. " + totalTime + " milisekund.");


//
//        HashSet 5908 unikalnych słów. 15 milisekund vs TreeSet 5908 unikalnych słów. 27 milisekund
    }
}