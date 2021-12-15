package pl.imiajd.laska;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class zad3 {
    public static void main(String[] args) throws FileNotFoundException{

        ArrayList<String> lista = new ArrayList<>();

//        File plik = new File("plik.txt");
//        "pl/imiajd/laska/plik.txt"

        Scanner file = new Scanner(new File("plik.txt"));

        while (file.hasNextLine()) {
            String line = file.nextLine();
            lista.add(line);

        }
        Collections.sort(lista);

        for (String i : lista) {
            System.out.println(i);
        }

    }
}
