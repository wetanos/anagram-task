import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(Main.checkIfWordsAnagrams("Buckethead", "DeathCubeK"));
    }

    public static boolean checkIfWordsAnagrams(String firstWord, String secondWord) {
            String firstWordLowered = firstWord.toLowerCase();
            String secondWordLowered = secondWord.toLowerCase();
            List<Character> firstWordChars = new ArrayList<Character>();
            List<Character> secondWordChars = new ArrayList<Character>();
            boolean result;

            if(firstWord.length() == secondWord.length()) {
                for (int i = 0; i < firstWordLowered.length(); i++){
                    firstWordChars.add(firstWordLowered.charAt(i));
                    secondWordChars.add(secondWordLowered.charAt(i));
                }
                int counterOfDifferentCharacters = firstWordChars.size();
                for (int i = 0; i < (firstWordChars.size()); i++) {
                    for(int k = 0; k < firstWordChars.size(); k++) {
                        if(firstWordChars.get(i) == secondWordChars.get(k)) {
                            counterOfDifferentCharacters--;
                            break;
                        }
                    }
                }
                result = counterOfDifferentCharacters == 0;
            } else {
                result = false;
            }
        return result;
    }
}
