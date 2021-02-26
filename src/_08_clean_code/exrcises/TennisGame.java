package _08_clean_code.exrcises;

public class TennisGame {

    public static String getScore(String nameFirstPlayer, String nameSecondPlayer, int scoreOfFirstPlayer, int scoreOfSecondPlayer) {
        StringBuilder score = new StringBuilder();
        int tempScore;
        if (scoreOfFirstPlayer == scoreOfSecondPlayer) {
            score = getStringBuilder(scoreOfFirstPlayer);
        } else if (scoreOfFirstPlayer >= 4 || scoreOfSecondPlayer >= 4) {
            int minusResult = scoreOfFirstPlayer - scoreOfSecondPlayer;
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
                getTempScore(scoreOfFirstPlayer, scoreOfSecondPlayer, score, i);
            }
        }
        return score.toString();
    }

    private static void getTempScore(int scoreOfFirstPlayer, int scoreOfSecondPlayer, StringBuilder score, int i) {
        int tempScore;
        if (i == 1) tempScore = scoreOfFirstPlayer;
        else {
            score.append("-");
            tempScore = scoreOfSecondPlayer;
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

    private static StringBuilder getStringBuilder(int scoreOfFirstPlayer) {
        StringBuilder score;
        switch (scoreOfFirstPlayer) {
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