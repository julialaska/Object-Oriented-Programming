package Z3;

import java.io.File;
import java.util.Arrays;

public class zad3 {
    public static void main(String[] args) {
        File[] files = new File("162457-E01\\src").listFiles();
        Arrays.sort(files, (a,b) -> {
            if(a.isDirectory() && !b.isDirectory())
                return -1;
            if(!a.isDirectory() && b.isDirectory())
                return 1;
            return a.compareTo(b);
        });

        for(File f: files){
            System.out.println(f);
        }
    }
}
