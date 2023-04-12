package Angabe05;

public class BerechneSumme {
    public static void main(String[] args) {

        System.out.println("Die Summe des uebergebenen Arrays lautet: " + berechneSumme(new int[]{1, 2, 3, 4}));


    }

    public static int berechneSumme(int[] arr) {

        int summe;
        if (arr.length >= 0) {

            return summe =arr[0] + (berechneSumme(int[]arr-1);
        } else return summe =1;
        return summe;
   }
}
