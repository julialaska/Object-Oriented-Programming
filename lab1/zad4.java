public class zad4 {
        public static void main(String[] args){
            double kwota = 1000;
            double procent = 0.06;

            for(int i=0; i<3; i++){
                kwota = kwota + kwota * procent;

                System.out.println(kwota);
            }

        }
    }

