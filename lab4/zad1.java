//package lab4;

import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;



public class zad1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj napis");
        String str = scan.nextLine();
        System.out.println("Podaj drugi napis");
        String subStr = scan.nextLine();
        System.out.println("Podaj znak");
        char c = scan.next().charAt(0);

        System.out.println(countChar(str,c));
        System.out.println(countSubStr(str, subStr));
        System.out.println(middle(str));
        System.out.println(repeat(str, 3));
//        System.out.println(where(str,subStr));
        System.out.println(change(str));
        System.out.println(nice(str));

    }

    public static int countChar(String str, char c) {
        int licznik = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c)
                licznik++;

        }
        return  licznik;
    }

    public static int countSubStr(String str, String subStr) {
//        int licznik = 0;
//        for (int i = str.indexOf(subStr); i != -1; i++) {
//            if (str.charAt(i) == subStr.charAt(i))
//                licznik++;

//        int counter = 0;
//        int pos = 0;
//        while(true){
//            pos = str.indexOf(subStr, pos)    ;
//        if(pos != 1){
//            counter++;
//            pos += subStr.length();
//        }
//        else {
//            return counter;
//        }}

        int licznik = 0;
        int i = 0;

        while ((i = str.indexOf(subStr, i)) != -1 ){
            licznik++;
            i++;

        }
        return licznik;

    }
    public static String middle(String str){

        if(str.length() %2!=0) {
            String nowy = str.substring(str.length() / 2,(str.length()/2)+1);
            return nowy;
        }
        else{
            String nowy = str.substring((str.length() / 2)-1,(str.length()/2)+1);
            return nowy;
        }
    }

    public static String repeat(String str, int n){
//

        String nowy = "";
        for(int i =0; i<n; i++){
            nowy = nowy.concat(str);
        }
        return nowy;
    }

    public static int[] where(String str, String subStr){

        ArrayList<Integer> tab = new ArrayList<Integer>();

        int counter = 0;
        int pos = 0;
        while(true){
            pos = str.indexOf(subStr, pos);
            if(pos != 1){
                counter++;
                tab.add(pos);
                pos += subStr.length();

            }
            else {

                int[] tab2 = new int[tab.size()];
                for(int i=0; i<tab2.length;i++){
                    tab2[i] = tab.get(i).intValue();
                }
                return tab2;
            }

        }


    }
    public static String change(String str){
        var sb = new StringBuffer();

        for(int i=0;i<str.length();i++) {
            if (str.charAt(i)>='A'&&str.charAt(i)<='Z')
            {
                sb.append(str.toLowerCase().charAt(i));

            }
            else if(str.charAt(i)>='a'&&str.charAt(i)<='z')
            {
                sb.append(str.toUpperCase().charAt(i));
            }
        }
        String result = sb.toString();
        return result;
    }
    public static String nice(String str){
        var sb = new StringBuffer();

        for(int i=0;i<str.length();i++){
            sb.append(str.charAt(i));
        }

        for(int i=str.length(); i<0; i--){
            sb.append(str.charAt(i));
        }
        String result = sb.toString();
        String[] res = result.split("'",3);
        String r = res.toString();
        return r;
    }

    public static String nice(String str, int liczba, String sep){
        var sb = new StringBuffer();

        for(int i=0;i<str.length();i++){
            sb.append(str.charAt(i));
        }

        for(int i=str.length(); i<0; i--){
            sb.append(str.charAt(i));
        }

        String result = sb.toString();
        String[] res = result.split(sep, liczba);
        String r = res.toString();
        return r;
    }
}
