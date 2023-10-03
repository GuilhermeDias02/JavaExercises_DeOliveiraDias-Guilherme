import java.util.ArrayList;

public class bonus1 {
    private static void main(String[] args){
        if(args.length == 0){ System.out.println("erreur: vous devez passer un argument"); return; }

        int i = Integer.parseInt(args[0]);

        ArrayList<String> arbre = bonus1.calcBranches(1, i, new ArrayList<String>());

        // appel fonction ajout tronc

        // apell fonction ajout espaces blancs en fonction du plus long element

        for (String ligne : arbre) {
            System.out.println(ligne);
        }

    }

    private static ArrayList<String> calcBranches(int min, int max, ArrayList<String> last){

        if(min > max){return last;}

        ArrayList<String> nvPartie = new ArrayList<String>();
        // calc nv partie

        last.addAll(nvPartie);

        //appel fonction recursive
    }

    private static ArrayList<String> calcTronc(int nbr){

    }

    private static ArrayList<String> calcEspaces(int nbr){

    }
}
