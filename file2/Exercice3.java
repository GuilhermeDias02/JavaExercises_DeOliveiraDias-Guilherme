import java.util.ArrayList;

public class Exercice3 {
    public static void main(String args[]){
        ArrayList<String> quotations = new ArrayList<String>();

        quotations.add("Quand Paris s\'enrhume, l\'Europe a froid");
        quotations.add("S\'il y a un diamant dans la poitrine, il brille sur le visage");
        quotations.add("La joie de vivre n\'est pas un but, mais un devoir");

        for (String s : quotations) {
            System.out.println(s + " : " + Exercice3.countVowels(s));
        }
    }

    private static int countVowels(String str){
        int n = 0;
        String vowels = "AEIOUaeiou";
        char[] c = str.toCharArray();

        for(int i = 0; i < str.length(); i++){
            c[i] = Character.toLowerCase(c[i]);
            if(c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o' || c[i] == 'u' || c[i] == 'y'){
                n++;
            }
        }

        return n;
    }
}
