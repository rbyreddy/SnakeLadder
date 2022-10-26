package snakeladder;

import java.util.Random;

public class RollTheDie {
    public static void main(String[] args) {
        int pos = 0;
        System.out.println("Single Player at Start Position "+pos);
        RollDice();
    }
    public static void RollDice(){
        int dice = (int) Math.floor(Math.random() * 10) % 6 + 1;
        System.out.println("Dice Num :" +dice);
    }
}
