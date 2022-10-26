package snakeladder;

public class NoPlayLadderOrSnake {
    public static void main(String[] args) {
        double Random = Math.floor(Math.random() * 10) % 3;
        System.out.println("Check Options :" +Random);

        int Dice = (int) Math.floor(Math.random() * 10) % 6 + 1;
        int NoPlay = 0;
        int ladder = 1;
        int snake = -1;
        int Position = 0;
        int stay = 0;
        int MovesAhead = 1;
        int MovesBehind = -1;

        double TotalMovesAhead = 0;
        double TotalMovesBehind = 0;
        double check = Math.floor(Math.random() * 10) % 3;
        if (check == NoPlay) {
            stay = 0;

        } else if (check == ladder) {
            Position = Position + Dice;
        }

        TotalMovesAhead = MovesAhead + Random;
        System.out.println("Ladder MovesAhead : " +TotalMovesAhead);
    }
}
