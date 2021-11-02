//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class zad2{
//
////    private static final String FILE_PATH = "data.txt";
//    public static void main(String args[]) throws IOException {
//        FileUtil fileUtil = new FileUtil("plik.txt");
//
//    }
//}
//
//class FileUtil {
//    static BufferedReader reader = null;
//    public FileUtil(String filePath) throws FileNotFoundException {
//        File file = new File(filePath);
//        FileInputStream fileStream = new FileInputStream(file);
//        InputStreamReader input = new InputStreamReader(fileStream);
//        reader = new BufferedReader(input);
//    }
//
//    public static int count() throws IOException {
//        int licznik = 0;
//        String data;
//        while((data = reader.readLine()) != null) {
//            licznik += data.length();
//        }
//        return licznik;
//    }
//}
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class zad2 {

    public static void main(String args[]) throws IOException {
        FileUtil fileUtil = new FileUtil("zad2.txt");

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj znak");
        char c = scan.next().charAt(0);

        System.out.println("No. of words in file: " + fileUtil.getWordCount(c));
    }
}

class FileUtil {
    static BufferedReader reader = null;
    public FileUtil(String filePath) throws FileNotFoundException {
        File file = new File(filePath);
        FileInputStream fileStream = new FileInputStream(file);
        InputStreamReader input = new InputStreamReader(fileStream);
        reader = new BufferedReader(input);
    }

    public static int getWordCount(char c) throws IOException {
        int licznik = 0;
        String data;
        while((data = reader.readLine()) != null){

            // \\s+ regex for space delimiter
//            String[] words = data.split("\\s+");
//            String words = reader.readLine();
            if(data.charAt(licznik) == c)
            licznik += 1;
        }
        return licznik;
    }
}