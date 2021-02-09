/**
 * Convert a number to a string, the contents of which depend on the number's factors.
 *
 * If the number has 3 as a factor, output 'Pling'.
 * If the number has 5 as a factor, output 'Plang'.
 * If the number has 7 as a factor, output 'Plong'.
 * If the number does not have 3, 5, or 7 as a factor, just pass the number's digits straight through.
 * Examples
 * 28's factors are 1, 2, 4, 7, 14, 28.
 * In raindrop-speak, this would be a simple "Plong".
 * 30's factors are 1, 2, 3, 5, 6, 10, 15, 30.
 * In raindrop-speak, this would be a "PlingPlang".
 * 34 has four factors: 1, 2, 17, and 34.
 * In raindrop-speak, this would be "34".
 */


public class G_Raindrops {

    String convert(int number) {

        StringBuilder resultString = new StringBuilder();

        if(number % 3 == 0) resultString.append("Pling");
        if(number % 5 == 0) resultString.append("Plang");
        if(number % 7 == 0) resultString.append("Plong");

        return resultString.length() == 0 ? Integer.toString(number) : resultString.toString();

    }

}
