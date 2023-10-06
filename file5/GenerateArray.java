package file5;

import java.util.ArrayList;
import java.util.Random;

public class GenerateArray {
    private static ArrayList<Integer> list;

    /**
     * générer la liste statique aléatoirement avec sa taille et le nombre le plus grand (inclus) qui peut être dedans
     * @param taille
     * @param max
     */
    public static void generate(int taille, int max){
        list = new ArrayList<Integer>();
        Random rand = new Random();
        int r;

        for (int i = 0; i < taille; i++) {
            r = rand.nextInt(1, max + 1);
            list.add(r);
        }
    }

    public static void addItem(int i){
        list.add(i);
    }

    public static ArrayList<Integer> getList(){
        return list;
    }
}
