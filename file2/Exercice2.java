import java.util.ArrayList;

public class Exercice2 {
    public static void main(String args[]){
        if(args.length == 0){ System.out.println("erreur: vous devez passer un argument"); return; }

        ArrayList<String> tab = new ArrayList<String>();

        tab.add("kiwi");
        tab.add("pomme");
        tab.add("poire");
        tab.add("litchi");
        tab.add("rhubarbe");

        int findIndex = Exercice2.findFruit(tab, args[0]);

        System.out.println("Le fruit " + args[0] + " est a l'index " + findIndex);
	}

    private static int findFruit(ArrayList<String> unTab, String str){
        int i = 0;

        for(String t : unTab){
            if(t.equals(str)){
                return i;
            }

            i++;
        }

        return -1;
    }
}
