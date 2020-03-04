package fo.tsk.jsi.HangingMan;

import java.util.*;

public class GuiBuilder {
    private final WrongGuessesCounter _wrongGuessesCounter;
    public GuiBuilder(WrongGuessesCounter wrongGuessesCounter) {
        _wrongGuessesCounter = wrongGuessesCounter;
    }

    /*static String getGUI(String solution, ArrayList<Character> guesses) {
        return "Loysn: *o**h**o**i\n" +
                "Git: i,o,j,e,h,l,w\n" +
                "Skeiv git: 4";
    }*/

    public String getGuiPublic(String solution, Set<Character> guessed) {
        return GuiBuilder.getGUI(solution, ConvertSetToArrayList(guessed));
    }

    static String getGUI(String solution, ArrayList<Character> guesses) {
        String solutionMasked = "";

        for (int i = 0; i<solution.length(); i++) {
            char cUpperCase = Character.toUpperCase(solution.charAt(i));
            char cLowerCase = Character.toLowerCase(solution.charAt(i));
            if (guesses.contains(cUpperCase) || guesses.contains(cLowerCase)) {
                solutionMasked = solutionMasked + solution.charAt(i);
            } else {
                solutionMasked = solutionMasked + "*";
            }
        }

        WrongGuessesCounter wgc = new WrongGuessesCounter();
        int wrongGuesses = wgc.Count(solution, ConvertArrayListToSet(guesses));


        return "Loysn: " + solutionMasked+"\n" +
                "Git: "+guesses.toString()+"\n" +
                "Skeiv git: " + wrongGuesses;

    }

    static ArrayList<Character> ConvertSetToArrayList(Set<Character> characterSet) {
        ArrayList<Character> result = new ArrayList();
        Iterator<Character> iterator = characterSet.iterator();
        while (iterator.hasNext()) {
            result.add(iterator.next());
        }
        return result;
    }

    static Set<Character> ConvertArrayListToSet(List<Character> characterList) {
        Set<Character> result = new TreeSet();
        for (int i = 0; i < characterList.size(); i++) {
            result.add(characterList.get(i));
        }
        return result;
    }
}
