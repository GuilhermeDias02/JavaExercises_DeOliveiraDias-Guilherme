public class Exercice3 {

    public static void main(String[] args) {
        int count = 0;
        int start = 1;
        int end = 50;

        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                count += i;
            }
        }

        System.out.println("La somme des nombres pairs entre 1 et 50 est : " + count);
    }
}