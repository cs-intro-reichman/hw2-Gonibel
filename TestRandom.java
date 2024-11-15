// Tests the distribution generated by Java's Math.random() function.
public  class  TestRandom {
	public static void main(String[]  args) {
	    // Replace this comment with your code

		String laps1 = args[0];
		int laps = Integer.parseInt(laps1);

		int countersmall = 0;
		int counterbig = 0;

		for( int i = 0; i < laps; i++) {

			double test = Math.random();

			if (test > 0.5) {
				counterbig++;
			} else {
				countersmall++;
			}

		}

		System.out.println(" > 0.5: " + counterbig + " times");
		System.out.println("<= 0.5: " + countersmall + " times");
	}
}
