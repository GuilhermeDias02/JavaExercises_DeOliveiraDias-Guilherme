import java.util.ArrayList;

public class Exercice5{
    public static void main(String[] args) {
        ArrayList<Integer> nbArray = new ArrayList<Integer>();
        nbArray.add(75);
        nbArray.add(80);
        nbArray.add(90);
        nbArray.add(95);
        nbArray.add(85);

        int averageArray = Exercice5.averageCalc(nbArray);

        System.out.println("La moyenne de la liste est : " + averageArray);
    }

    private static int averageCalc(ArrayList<Integer> numbers){
        int count = 0;

        for (Integer integer : numbers) {
            count += integer;
        }

        return count / numbers.size();
    }
}