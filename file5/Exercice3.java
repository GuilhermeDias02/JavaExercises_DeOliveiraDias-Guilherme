package file5;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercice3 {
    public static void main(String[] args) {
        GenerateArray.generate(10, 100);
        ArrayList<Integer> nvListe = GenerateArray.getList();

        for (Integer integer : nvListe) {
            System.out.print(integer + " ");
        }

        System.out.print("\r\n");

        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Entrez un nombre :");
            int s = scan.nextInt();
            nvListe.add(s);
        }
        scan.close();

        for (Integer integer : nvListe) {
            System.out.print(integer + " ");
        }

        ArrayList<Integer> listeTri = bubbleSortD(nvListe);

        for (Integer integer : listeTri) {
            System.out.print(integer + " ");
        }

        System.out.print("\r\n");
    }

    private static ArrayList<Integer> bubbleSortD(ArrayList<Integer> uneListe) {
        ArrayList<Integer> laListe = uneListe;

        int n = laListe.size();
        int temp = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (laListe.get(j - 1) < laListe.get(j)) {
                    temp = laListe.get(j - 1);
                    laListe.add(j - 1, laListe.get(j));
                    laListe.add(j, temp);
                }

            }
        }

        return laListe;
    }
}
