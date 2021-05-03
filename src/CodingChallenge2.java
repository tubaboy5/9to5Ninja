/*
Info:
        Let's pretend a hash # represents the backspace on a computer being pressed. Write a function that takes a string containing # and returns a string without any #.
        Notes:

        Backspaces can remove whitespace, and characters.
        If the number of hashes exceeds the previous characters, remove the previous characters entirely (see example #3).
        If there only exists hashes, return an empty string (see example #4).

        function erase(str) {
        // Code goes here
        }

        erase("he##l#hel#llo") // expected output -> "hello"

        erase("Ryan# Talb##ert") // expected output -> "Rya Taert"

        erase("ni###nja man") // expected output -> "nja man"

        erase("####") // expected output -> ""

        erase("Hovey Benjamin######## is S#U#P#E#R# unde####rr#ate##d") // expected output -> "Hovey is rad"
 */

public class CodingChallenge2 {
    public static void main(String[] args) {

        erase("he##l#hel#llo"); // expected output -> "hello"
        System.out.println("The expected output is: hello");
        System.out.println();

        erase("Ryan# Talb##ert"); // expected output -> "Rya Taert"
        System.out.println("The expected output is: Rya Taert");
        System.out.println();

        erase("ni###nja man"); // expected output -> "nja man"
        System.out.println("The expected output is: nja man");
        System.out.println();

        erase("####"); // expected output -> ""
        System.out.println("The expected output is: ");
        System.out.println("NOTE: The expected output is an empty string.");

        System.out.println();

        erase("Hovey Benjamin######## is S#U#P#E#R# unde####rr#ate##d"); // expected output -> "Hovey is rad"
        System.out.println("The expected output is: Hovey is rad");
        System.out.println();

    }

    private static void erase(String input) {
        String filterChar = "#";
        
        StringBuilder initialInput = new StringBuilder(input);
        StringBuilder afterRemoval = new StringBuilder(input);

        int index = initialInput.indexOf(filterChar);
        while (index >= 0) {
            afterRemoval = initialInput.deleteCharAt(index);
            if (index >=1) {
                afterRemoval = initialInput.deleteCharAt(index - 1);
            }
            index = initialInput.indexOf(filterChar, index = 0);
        }
        System.out.println("If you input: " + input + ", then your output will be: " + afterRemoval + ".");
    }
}
