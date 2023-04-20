package TennisGame;

public class TennisGame {
    public static String getScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        int playerScore = 0;
        boolean isSameScore = player1Score == player2Score;
        if (isSameScore) {
            return declarationForSameScore(player1Score);
        } else {
            boolean isPlayer1ScoreOverEqual4 = player1Score >= 4;
            boolean isPlayer2ScoreOverEqual4 = player2Score >= 4;
            if (isPlayer1ScoreOverEqual4 || isPlayer2ScoreOverEqual4) {
                return declarationForScoreOverEqualFour(player1Score, player2Score);
            } else {
                return standardDeclaration(player1Score, player2Score);
            }
        }
    }

    public static String declarationForSameScore(int playersScore) {
        String declaration = "";
        switch (playersScore) {
            case 0:
                declaration = "Love-All";
                break;
            case 1:
                declaration = "Fifteen-All";
                break;
            case 2:
                declaration = "Thirty-All";
                break;
            case 3:
                declaration = "Forty-All";
                break;
            default:
                declaration = "Deuce";
                break;

        }
        return declaration;
    }

    public static String declarationForScoreOverEqualFour(int player1Score, int player2Score) {
        String declaration = "";
        int scoreDifference = player1Score - player2Score;
        if (scoreDifference == 1) declaration = "Advantage player1";
        else if (scoreDifference == -1) declaration = "Advantage player2";
        else if (scoreDifference >= 2) declaration = "Win for player1";
        else declaration = "Win for player2";
        return declaration;
    }

    public static String standardDeclaration(int player1Score, int player2Score) {
        int playerScore = 0;
        String declaration = "";
        for (int i = 1; i < 3; i++) {
            if (i == 1) playerScore = player1Score;
            else {
                declaration += "-";
                playerScore = player2Score;
            }
            switch (playerScore) {
                case 0:
                    declaration += "Love";
                    break;
                case 1:
                    declaration += "Fifteen";
                    break;
                case 2:
                    declaration += "Thirty";
                    break;
                case 3:
                    declaration += "Forty";
                    break;
            }
        }
        return declaration;
    }
}
