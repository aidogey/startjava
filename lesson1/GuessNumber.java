import java.util.Random;

public class GuessNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int computerNumber = random.nextInt(1, 101);

        for (int playerNumber = 1; playerNumber <= 100; playerNumber++) {
            if (playerNumber < computerNumber) {
                System.out.println(playerNumber + " меньше того, что загадал компьютер");
            } else if (playerNumber > computerNumber) {
                System.out.println(playerNumber + " больше того, что загадал компьютер");
            } else {
                System.out.println("Вы победили!");
                break;
            }
        }
    }
}