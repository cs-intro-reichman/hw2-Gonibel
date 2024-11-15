// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    // Replace this comment with your code

		String laps1 = args[0];
		int laps = Integer.parseInt(laps1);
		double sum = 0.0;
		double term;

		for (int i = 0; i < laps; i++) {
			term = (1.0/(i * 2 + 1));
			if (i % 2 == 0){ sum += term;}
			else { sum -= term;}
		}
		sum = sum * 4;
		System.out.println("pi,approximated:     " + Math.PI);
		System.out.println("pi according to Java:     " + sum);

	}
}
