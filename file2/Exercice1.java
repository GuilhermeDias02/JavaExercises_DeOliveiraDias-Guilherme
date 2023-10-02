import java.util.ArrayList;

public class Exercice1 {
    public static void main(String[] args){
        ArrayList<Integer> stock = new ArrayList<Integer>();

        stock.add(14);
        stock.add(887);
        stock.add(58);
        stock.add(713);
        stock.add(179);
        stock.add(512);
        stock.add(786);
        stock.add(29);

        System.out.println("Contenu du stock: " + Exercice1.sum(stock));
	}

    private static Integer sum(ArrayList<Integer> unStock){
        Integer res = 0;

        for(Integer s : unStock){
            res += s;
        }

        return res;
    }
}
