package _08_clean_code.exrcises;

public class TennisGame {

    public static String getScore(String namePlayerOne, String namePlayerTwo, int scoreOfPlayOne, int scoreOfPlayTwo) {
        StringBuilder score = new StringBuilder();
        int tempScore;
        if (scoreOfPlayOne == scoreOfPlayTwo) {
            score = getStringBuilder(scoreOfPlayOne);
        } else if (scoreOfPlayOne >= 4 || scoreOfPlayTwo >= 4) {
            int minusResult = scoreOfPlayOne - scoreOfPlayTwo;
            if (minusResult == 1) {
                score = new StringBuilder("Advantage player1");
            } else if (minusResult == -1) {
                {
                    score = new StringBuilder("Advantage player2");
                }
            } else if (minusResult >= 2) {
                score = new StringBuilder("Win for player1");
            } else {
                score = new StringBuilder("Win for player2");
            }
        } else {
            for (int i = 1; i < 3; i++) {
                getTempScore(scoreOfPlayOne, scoreOfPlayTwo, score, i);
            }
        }
        return score.toString();
    }

    private static void getTempScore(int scoreOfPlayOne, int scoreOfPlayTwo, StringBuilder score, int i) {
        int tempScore;
        if (i == 1) tempScore = scoreOfPlayOne;
        else {
            score.append("-");
            tempScore = scoreOfPlayTwo;
        }
        switch (tempScore) {
            case 0:
                score.append("Love");
                break;
            case 1:
                score.append("Fifteen");
                break;
            case 2:
                score.append("Thirty");
                break;
            case 3:
                score.append("Forty");
                break;
        }
    }

    private static StringBuilder getStringBuilder(int scoreOfPlayOne) {
        StringBuilder score;
        switch (scoreOfPlayOne) {
            case 0:
                score = new StringBuilder("Love-All");
                break;
            case 1:
                score = new StringBuilder("Fifteen-All");
                break;
            case 2:
                score = new StringBuilder("Thirty-All");
                break;
            case 3:
                score = new StringBuilder("Forty-All");
                break;
            default:
                score = new StringBuilder("Deuce");
                break;

        }
        return score;
    }
}