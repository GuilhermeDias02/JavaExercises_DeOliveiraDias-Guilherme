public class Exercice8{
    public static void main(String[] args){
        String[] colors = {"bleu", "rouge", "jaune"};
        String value;

        for(String color : colors){
            switch (color){
                case "bleu":
                    value = "La couleur preferee de Louis est le bleu";

                    System.out.println(value);
                    break;
                case "rouge":
                    value = "Pour sa peinture, Andree a utilise du rouge";

                    System.out.println(value);
                    break;
                case "jaune":
                    value = "La couleur preferee de Louis est le bleu";

                    System.out.println(value);
            }
        }
	}
}