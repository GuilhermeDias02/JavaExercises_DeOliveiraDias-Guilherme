package file5;

import file5.GenerateArray;
import java.util.ArrayList;

public class Exercice1 {
    public static void main(String[] args) {
        GenerateArray.generate(10, 100);
        ArrayList<Integer> nvListe = GenerateArray.getList();

        for (Integer integer : nvListe) {
            System.out.print(integer + " ");
        }

        System.out.print("\r\n");

        ArrayList<Integer> listeTri = bubbleSortC(nvListe);

        for (Integer integer : listeTri) {
            System.out.print(integer + " ");
        }

        System.out.print("\r\n");
    }

    private static ArrayList<Integer> bubbleSortC(ArrayList<Integer> uneListe) {
        ArrayList<Integer> laListe = uneListe;

        int n = laListe.size();
        int temp = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (laListe.get(j - 1) > laListe.get(j)) {
                    temp = laListe.get(j - 1);
                    laListe.add(j - 1, laListe.get(j));
                    laListe.add(j, temp);
                }

            }
        }

        return laListe;
    }
}