// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    // Replace this comment with your code

            String slogan1 = args[0];
            String slogan = slogan1.toUpperCase();
            String laps1 = args[1];
            int laps = Integer.parseInt(laps1);

            for (int i = 0; i < slogan.length(); i++) {
                if (slogan.charAt(i) == 'A' || slogan.charAt(i) == 'E' || slogan.charAt(i) == 'F' || slogan.charAt(i) == 'H' || slogan.charAt(i) == 'I' || slogan.charAt(i) == 'L' || slogan.charAt(i) == 'M' || slogan.charAt(i) == 'O' || slogan.charAt(i) == 'R' || slogan.charAt(i) == 'S' || slogan.charAt(i) == 'X'|| slogan.charAt(i) == 'N') {
                        System.out.println("Give me an " + slogan.charAt(i) + ": " + slogan.charAt(i) + "!");
                } else {
                        System.out.println("Give me a  " + slogan.charAt(i) + ": " + slogan.charAt(i) + "!");
                }

            }

            System.out.println("What does that spell?");

            for (int i = 0; i < laps; i++) {
                System.out.println(slogan + "!!!");
            }


            
        }
}
