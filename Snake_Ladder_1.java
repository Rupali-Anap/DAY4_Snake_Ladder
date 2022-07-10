package Day4_Pract_Prob;
import java.util.Random;

public class Snake_Ladder_1 {

        public static void main(String[] args) {
            System.out.println("Start The Game by Rolling Dice");
            Random Dice = new Random();
            int a = Dice.nextInt(6)+1;
            System.out.println(a);
        }

}
