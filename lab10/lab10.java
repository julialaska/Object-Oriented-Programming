package lab10;

import java.util.*;

public class lab10 {
    public static void main(String[] args){
        LinkedList<String>pracownicy = new LinkedList<>();
        pracownicy.add("pracownik1");
        pracownicy.add("pracownik2");
        pracownicy.add("pracownik3");
        pracownicy.add("pracownik4");
        pracownicy.add("pracownik5");
        pracownicy.add("pracownik6");
        pracownicy.add("pracownik7");
        pracownicy.add("pracownik8");

//        System.out.println(pracownicy);
//        redukuj(pracownicy,3);
//        System.out.println(pracownicy);

        odwroc(pracownicy);
        System.out.println(pracownicy);

        String str = "Ala ma kota.";
        String str2 = "Jej kot lubi myszy.";

        System.out.println(reverse(str));
        System.out.println(str);
        System.out.println(reverse(str2));

        int num = 2105;
        divide(num);

        sitoEratostenesa(100);

        print(pracownicy);

    }
    public static void redukuj(LinkedList<String>pracownicy, int n) {
        for (int i = n; i < pracownicy.size(); i += n) {
            pracownicy.remove(i);
        }
    }
    public static <T> void redukuj_gen(LinkedList<T>pracownicy, int n){
        for (int i = n; i < pracownicy.size(); i += n) {
            pracownicy.remove(i);
        }
    }
    public static void odwroc(LinkedList<String> lista){
        Collections.reverse(lista);
    }
    public static <T> void odwroc_gen(LinkedList<T> lista){
        Collections.reverse(lista);
    }
    public static String reverse(String s){
        Stack<String> stack = new Stack<String>();
        StringTokenizer strTok = new StringTokenizer(s.substring(0, s.length() - 1).toLowerCase());
        while(strTok.hasMoreTokens()){
            stack.push(strTok.nextToken());
        }
        StringBuilder revStr = new StringBuilder();
        while(!stack.empty()){
            revStr.append(stack.pop());
            revStr.append(" ");

            }

        String str = revStr.toString().substring(0,1).toUpperCase();
        str += revStr.toString().substring(1,revStr.length()) + s.substring(s.length()-1,s.length());
        return str;
        }


    public static void divide(Integer num){
        Stack<Integer> stack = new Stack<Integer>();
        while(num != 0){
            stack.push(num % 10);
            num /= 10;
        }
        for(int i = 0; i < stack.size()+3; i++){
            System.out.println(stack.pop() + " ");
        }
    }

    public static void sitoEratostenesa(int n){
        ArrayList<Integer> pierwsze = new ArrayList<>();
        for(int i = 2; i*i < n; i++){
            if(i == 2 || i == 3){
                pierwsze.add(i);
            }
            else if(i % 2== 0 || i % 3 == 0){
                continue;
            }
            else{
                pierwsze.add(i);
            }

        }
        System.out.println(pierwsze);
    }


    public static <T extends Iterable<?>> void print(T arg){
        Iterator<?> i = arg.iterator();
        while(i.hasNext()){
            System.out.print(i.next() + ", ");
        }
    }


}



