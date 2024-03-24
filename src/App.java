import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) throws Exception {
        // Compile the regex.
        String regex_1 = "a*b";
        String regex_2 = "[-+]?[0-9]+\\.[0-9]+";
        String regex_3 = "^The.*Spain$";
        String regex_4 = "<H[123456]>";
        Pattern pattern_1 = Pattern.compile(regex_1);
        Pattern pattern_2 = Pattern.compile(regex_2);
        Pattern pattern_3 = Pattern.compile(regex_3);
        Pattern pattern_4 = Pattern.compile(regex_4);
        // Create the 'target' string we wish to interrogate
        String targetString_1 = "aaaaabaacaab";
        String targetString_2 = "+0.2";
        String targetString_3 = "The rain in Spain";
        String targetString_4 = "<H1>";
        // Get a Matcher based on the target string
        Matcher matcher_1 = pattern_1.matcher(targetString_1);
        Matcher matcher_2 = pattern_2.matcher(targetString_2);
        Matcher matcher_3 = pattern_3.matcher(targetString_3);
        Matcher matcher_4 = pattern_4.matcher(targetString_4);
        if (matcher_1.find()) {
            System.out.println("Matched any number of a's and a single b at the end \n");
        } else {
            System.out.println("Didn't Match any number of a's and a single b at the end \n");
        }
        if (matcher_2.matches()) {
            System.out.println("Matched a floating point number \n");
        } else {
            System.out.println("Didn't Match a floating point number \n");
        }
        if (matcher_3.matches()) {
            System.out.println("Matched a sentence that starts with The and ends in Spain\n");
        } else {
            System.out.println("Didn't Match a sentence that starts with The and ends in Spain \n");
        }
        if (matcher_4.matches()) {
            System.out.println("Matched a correct html tag \n");
        } else {
            System.out.println("Didn't Match a correct html tag \n");
        }
    }
}
