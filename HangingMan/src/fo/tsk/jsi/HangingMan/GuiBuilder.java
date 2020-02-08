package fo.tsk.jsi.HangingMan;

import java.util.Set;
import java.util.SortedSet;

public class GuiBuilder {
    private final WrongGuessesCounter _wrongGuessesCounter;
    public GuiBuilder(WrongGuessesCounter wrongGuessesCounter) {
        _wrongGuessesCounter = wrongGuessesCounter;
    }

    public String getGUI(String solution, Set<Character> guessed) {
        String solutionMasked = "";

        int wrongGuesses = _wrongGuessesCounter.Count(solution, guessed);

        for (int i = 0; i < solution.length(); i++) {
            //String s = solution.substring(i, i+1).toUpperCase();
            Character c = solution.charAt(i);
            if (guessed.contains(Character.toUpperCase(c)) || guessed.contains(Character.toLowerCase(c))) {
                solutionMasked = solutionMasked + c;
            } else {
                solutionMasked = solutionMasked + "*";
            }
        }

        String hangingMan = "";

        switch (wrongGuesses) {
            case 0: hangingMan = "                \n" +
                                 "                \n" +
                                 "                \n" +
                                 "                \n" +
                                 "                \n" +
                                 "                \n" +
                                 "                \n" +
                                 "                \n" +
                                 "                ";
                break;
            case 1: hangingMan = "                \n" +
                    "                \n" +
                    "                \n" +
                    "                \n" +
                    "                \n" +
                    "                \n" +
                    "                \n" +
                    "     /\\         \n" +
                    "    /  \\         ";
                break;
            case 2: hangingMan = "                \n" +
                    "                \n" +
                    "      |         \n" +
                    "      |         \n" +
                    "      |         \n" +
                    "      |         \n" +
                    "      |         \n" +
                    "     /\\         \n" +
                    "    /  \\         ";
                break;
            case 3: hangingMan = "                \n" +
                    "      -------   \n" +
                    "      |         \n" +
                    "      |         \n" +
                    "      |         \n" +
                    "      |         \n" +
                    "      |         \n" +
                    "     /\\         \n" +
                    "    /  \\         ";
                break;
            case 4: hangingMan = "                \n" +
                    "      -------   \n" +
                    "      |     |   \n" +
                    "      |     o   \n" +
                    "      |    /|\\  \n" +
                    "      |          \n" +
                    "      |          \n" +
                    "     /\\         \n" +
                    "    /  \\         ";
                break;
            case 5: hangingMan = "                \n" +
                    "      -------   \n" +
                    "      |     |   \n" +
                    "      |     o   \n" +
                    "      |    /|\\  \n" +
                    "      |     |   \n" +
                    "      |    / \\  \n" +
                    "     /\\         \n" +
                    "    /  \\         ";
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            default:
        }

        String template =
                "--------------------------------------------\n" +
                "-             Loysn: %s                    -\n" +
                "-                                          -\n" +
                "-                                          -\n" +
                "-                                          -\n" +
                "- Git: %s                                  -\n" +
                "-                                          -\n" +
                "-                                          -\n" +
                "--------------------------------------------";
        template = String.format(template, solutionMasked, guessed);
        String[] mainCanvas = template.split("\\n");
        String[] hangingManSplitted = hangingMan.split("\\n");
        for (int i = 0; i < mainCanvas.length; i++) {
            mainCanvas[i] = mainCanvas[i].substring(0, 44) + (hangingManSplitted.length >= i ? hangingManSplitted[i] : "huh?");
        }



        String guiWithHangingMan = "";
        for (String s: mainCanvas) {
            guiWithHangingMan = guiWithHangingMan + s + "\n";
        }
        return guiWithHangingMan;
    }
}
