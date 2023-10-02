public class Exercice9{
    public static void main(String[] args){
        int[] numbers = { 21565,  3412,  180, 
            1556, 182, 84, 15};
        int i = 0;
        int[] pasDiv3 = new int[numbers.length-3]; // jsp pk 3 mais ca marche

        for(int number : numbers){
            if(number % 3 != 0){
                pasDiv3[i] = number;

                i++;
            }
        }

        for(int nbr : pasDiv3){
            System.out.print(nbr);

            if(nbr != pasDiv3[pasDiv3.length - 1]){
                System.out.print(", ");
            }
        }
	}
}