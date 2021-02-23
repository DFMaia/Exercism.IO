/**
 * Given a word, compute the scrabble score for that word.
 *
 * Letter Values
 * You'll need these:
 *
 * Letter                           Value
 * A, E, I, O, U, L, N, R, S, T       1
 * D, G                               2
 * B, C, M, P                         3
 * F, H, V, W, Y                      4
 * K                                  5
 * J, X                               8
 * Q, Z                               10
 * Examples
 * "cabbage" should be scored as worth 14 points:
 *
 * 3 points for C
 * 1 point for A, twice
 * 3 points for B, twice
 * 2 points for G
 * 1 point for E
 * And to total:
 *
 * 3 + 2*1 + 2*3 + 2 + 1
 * = 3 + 2 + 6 + 3
 * = 5 + 9
 * = 14
 */


public class AAE_ScrabbleScore {

    public int score = 0;

    AAE_ScrabbleScore(String word) {

        String validWordUpperCase = word.toUpperCase();

        if(word.isEmpty()) score += 0;

        for (int i = 0; i < validWordUpperCase.length(); i++){
            switch (validWordUpperCase.charAt(i)){
                case 'A': case 'E': case 'I': case 'O': case 'U': case 'L': case 'N': case 'R': case 'S': case 'T':
                    this.score++;
                    break;
                case 'D': case 'G':
                    this.score += 2;
                    break;
                case 'B': case 'C': case 'M': case 'P':
                    this.score += 3;
                    break;
                case 'F': case 'H': case 'V': case 'W': case 'Y':
                    this.score += 4;
                    break;
                case 'K':
                    this.score += 5;
                    break;
                case 'J': case 'X':
                    this.score += 8;
                    break;
                case 'Q': case 'Z':
                    this.score += 10;
                    break;
            }
        }

    }

    int getScore() {
        return this.score;
    }

}
