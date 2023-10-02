public class Exercice5{
    public static void main(String[] args){
        String str = "abcdefghijklmnopqrstuvwxyz";
        Integer i = 0;

        while(i < str.length()){
            if((i+1) % 2 == 0){
                System.out.print(str.charAt(i));
            }

            i++;
        }
	}
}