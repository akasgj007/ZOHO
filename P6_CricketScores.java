/*
 Given a timeline of scores, find the individual scores of player 1 and player 2 and Extras

W – Wide N – No Ball . – Dot Ball

Consider the game starts from player 1

I/P:

1 . 2 . 4 3 6 W 1 . N . 2 1

O/P:

P1 – 8

P2 – 12

Extras – 2
 */

public class P6_CricketScores {
    public static void main(String[] args) {
        String scoreBoard = "1 . 2 . 4 3 6 W 1 . N . 2 1";
        int scores[] = findScores(scoreBoard);
        System.out.println("Player 1 score : " + scores[0]);
        System.out.println("Player 2 score : " + scores[1]);
        System.out.println("Extras score : " + scores[2]);

    }

    private static int[] findScores(String scoreBoard) {
        int p1Score = 0, p2Score = 0, extras = 0;
        int currPlayer = 1;
        boolean swapStrike = false;

        for (char c : scoreBoard.toCharArray()) {
            if (Character.isDigit(c)) {
                int run = (c - '0');
                if (currPlayer == 1)
                    p1Score += run;
                else
                    p2Score += run;

                if (run % 2 == 1)
                    swapStrike = true;
            } else if (c == 'N' || c == 'W')
                extras++;

            if (swapStrike) {
                currPlayer = 3 - currPlayer;
                swapStrike = false;
            }

        }

        return new int[] { p1Score, p2Score, extras };
    }

}
